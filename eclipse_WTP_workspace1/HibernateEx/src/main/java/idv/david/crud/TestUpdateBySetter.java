package idv.david.crud;

import org.hibernate.Session;

import entity.Dept;
import util.HibernateUtil;

public class TestUpdateBySetter {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			
			//被Session管理的資料庫 , 等同對資料庫直接進行操作
//			Dept dept = session.get(Dept.class, 50);
//			if (dept != null)
//				dept.setLoc("中壢");      //此時會對資料庫進行變更
			
			// 也可以
			Dept dept2 = new Dept();
			dept2.setDeptno(50);
			dept2.setDname("業務部");
			dept2.setLoc("台中");
			session.update(dept2);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtil.shutdown();
		}
	}
}
