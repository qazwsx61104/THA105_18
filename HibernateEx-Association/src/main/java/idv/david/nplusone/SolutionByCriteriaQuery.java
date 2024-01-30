package idv.david.nplusone;

import java.util.List;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import entity.Dept;
import entity.Emp;
import util.HibernateUtil;

public class SolutionByCriteriaQuery {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			
			session.beginTransaction();
			
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Dept> query = builder.createQuery(Dept.class).distinct(true);
			Root<Dept> root = query.from(Dept.class);
			root.fetch("emps", JoinType.LEFT);
			query.select(root);
			
			List<Dept> list = session.createQuery(query).list();
			for (Dept dept : list) {
				System.out.println(dept.getDname() + " =============");
				for (Emp emp : dept.getEmps()) {
					System.out.println(emp.getEname());
				}
			
			}
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtil.shutdown();
		}
	}
}
