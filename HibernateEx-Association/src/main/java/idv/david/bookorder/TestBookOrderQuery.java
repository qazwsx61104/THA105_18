package idv.david.bookorder;

import org.hibernate.Session;

import entity.Book;
import entity.OrderDetail1;
import entity.OrderMaster;
import util.HibernateUtil;

public class TestBookOrderQuery {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			
			session.beginTransaction();
			
			// 從訂單主檔查詢關聯的明細資料與書本資料 (強大！)
			OrderMaster order = session.get(OrderMaster.class, 4);
			for (OrderDetail1 detail : order.getDetails()) {
				System.out.println(detail.getBook().getName());
			}
			
			System.out.println("====================");
			
			// 從書本查詢關聯到的銷售紀錄(明細)
			Book book = session.get(Book.class, 2);
			for (OrderDetail1 detail : book.getDetails()) {
				System.out.println(detail.getOrderMaster().getId());
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
