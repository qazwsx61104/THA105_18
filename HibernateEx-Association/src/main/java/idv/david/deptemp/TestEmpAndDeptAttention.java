package idv.david.deptemp;

import org.hibernate.Session;

import entity.Emp;
import util.HibernateUtil;

public class TestEmpAndDeptAttention {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			
			session.beginTransaction();
			
			Emp emp = session.get(Emp.class, 7001);
			// 一人犯錯...就誅他九族！！
			if (emp != null)
				session.delete(emp);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtil.shutdown();
		}
	}
}
