package idv.david.nplusone;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import entity.Dept;
import entity.Emp;
import util.HibernateUtil;

public class TestNPlusOneProblem {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			
			session.beginTransaction();
			
			List<Dept> list = session.createQuery("from Dept", Dept.class).list();
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
