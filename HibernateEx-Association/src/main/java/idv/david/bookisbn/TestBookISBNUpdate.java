package idv.david.bookisbn;

import java.math.BigDecimal;

import org.hibernate.Session;

import entity.Book;
import entity.BookIsbn;
import util.HibernateUtil;

// 實際上書本與 ISBN 關係並不會拆成兩個表格
// 為了展示 OneToOne 才故意這樣設定表格關係

public class TestBookISBNUpdate {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			
			session.beginTransaction();
			
			Book book = new Book();
			book.setName("Java講義");
			book.setAuthor("David");
			book.setPrice(new BigDecimal(500));
			
			BookIsbn bookIsbn = new BookIsbn();
			bookIsbn.setIsbn("111111111111");
			bookIsbn.setBook(book);
			
			book.setBookIsbn(bookIsbn);
			
			session.save(book);
			
			
//			Book book = session.get(Book.class, 12);
//			session.delete(book);
			
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateUtil.shutdown();
		}
	}
}
