package idv.david.deptemp;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;

import entity.Dept;
import entity.Emp;
import util.HibernateUtil;

public class TestEmpAndDeptUpdate {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			
			session.beginTransaction();
			
			// 建立要新增的部門資料
			Dept dept = new Dept();
			dept.setDeptno(90);
			dept.setDname("人事部");
			dept.setLoc("高雄");
			
			// 接著建立從屬的員工們
			Emp emp1 = new Emp();
			emp1.setEname("David");
			emp1.setJob("MANAGER");
			emp1.setHiredate(Date.valueOf("2023-01-01"));
			emp1.setSal(new BigDecimal(50000));
			emp1.setComm(new BigDecimal(500));
			// set關聯的部門資料
			emp1.setDept(dept);
			
			Emp emp2 = new Emp();
			emp2.setEname("Vincent");
			emp2.setJob("STAFF");
			emp2.setHiredate(Date.valueOf("2023-01-01"));
			emp2.setSal(new BigDecimal(3000));
			emp2.setComm(new BigDecimal(0));
			// set關聯的部門資料
			emp2.setDept(dept);
			
			Set<Emp> emps = new LinkedHashSet<>();
			emps.add(emp1);
			emps.add(emp2);
			// 此部門要新增時，跟著要一起新增的員工們 (員工物件裡也都有關聯的部門資訊)
			dept.setEmps(emps);
			
			session.save(dept);
			
			// 當部門(一方)刪除時，連帶關聯的員工們(多方)也一併刪除
//			Dept dept = session.get(Dept.class, 90);
//			if (dept != null) {
//				session.delete(dept);
//			}
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtil.shutdown();
		}
		
	}
}
