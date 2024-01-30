package idv.david.bookisbn;

import org.hibernate.Session;

import entity.Book;
import util.HibernateUtil;

// 實際上書本與 ISBN 關係並不會拆成兩個表格
// 為了展示 OneToOne 才故意這樣設定表格關係

public class TestBookISBNQuery {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			
			session.beginTransaction();
			
			Book book = session.get(Book.class, 1);
			System.out.println(book.getBookIsbn().getIsbn());
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtil.shutdown();
		}
	}
}
