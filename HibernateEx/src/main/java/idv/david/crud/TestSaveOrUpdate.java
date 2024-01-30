package idv.david.crud;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;

import entity.Emp;
import util.HibernateUtil;

public class TestSaveOrUpdate {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();
			
			Emp emp = new Emp();
//			emp.setEmpno(7015);
			emp.setEname("DAVID");
			emp.setJob("CEO");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse("2023-01-01");
			emp.setHiredate(date);
			
			emp.setSal(new BigDecimal(String.valueOf(9999.0)));
			emp.setComm(new BigDecimal(String.valueOf(0.0)));
			emp.setEmpdeptno(10);
			
			session.saveOrUpdate(emp);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtil.shutdown();
		}
	}
}
