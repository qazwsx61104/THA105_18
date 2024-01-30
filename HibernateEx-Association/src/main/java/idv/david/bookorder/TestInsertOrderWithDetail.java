package idv.david.bookorder;

import java.util.LinkedHashSet;
import java.util.Set;

import org.hibernate.Session;

import entity.Book;
import entity.OrderDetail1;
import entity.OrderMaster;
import util.HibernateUtil;

public class TestInsertOrderWithDetail {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();

			Book book1 = session.get(Book.class, 1);
			Book book2 = session.get(Book.class, 2);

			// 建立要新增的訂單主檔
			OrderMaster order = new OrderMaster();
			order.setUid(2);

			// 接著建立明細
			OrderDetail1 detail1 = new OrderDetail1();
			detail1.setAmount(1);
			// set關聯的訂單主檔
			detail1.setOrderMaster(order);
			// set關聯的購買書本
			detail1.setBook(book1);

			OrderDetail1 detail2 = new OrderDetail1();
			detail2.setAmount(2);
			// set關聯的訂單主檔
			detail2.setOrderMaster(order);
			// set關聯的購買書本
			detail2.setBook(book2);

			Set<OrderDetail1> details = new LinkedHashSet<>();
			details.add(detail1);
			details.add(detail2);
			// 此訂單要新增時，跟著要一起新增的書本明細們 (明細物件裡也都有關聯的書本資訊)
			order.setDetails(details);

			session.save(order);

			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtil.shutdown();
		}

	}
}
