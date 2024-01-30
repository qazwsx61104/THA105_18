package idv.david.deptemp;

import org.hibernate.Session;

import entity.Dept;
import entity.Emp;
import util.HibernateUtil;

public class TestEmpAndDeptQuery {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			
			session.beginTransaction();
			// 從員工帶出所屬的部門資料(一筆)
			Emp emp = session.get(Emp.class, 7001);
			System.out.println(emp.getDept().getDname());
			
			System.out.println("===============");
			
			// 從部門帶出關聯的員工們資料(多筆)
			Dept dept = session.get(Dept.class, 10);
			for (Emp e : dept.getEmps()) {
				System.out.println(e.getEmpno() + " " + e.getEname());
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
