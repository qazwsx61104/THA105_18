package idv.david.crud;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import entity.Dept;
import util.HibernateUtil;

public class TestGetAndLoad {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			
			Dept dept1 = session.get(Dept.class, 10);
			System.out.println(dept1);
			
			Dept dept2 = session.load(Dept.class, 20); //當下並沒有向資料庫查詢 , 
			Hibernate.initialize(dept2); // Load有Lazy initialize(僥倖)狀況 , 先初始化保存
									
			session.getTransaction().commit();
			
			System.out.println(dept2);
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtil.shutdown();
		}
		
	}
}
