package idv.david.memberarticle;

import java.util.Set;

import org.hibernate.Session;

import entity.Article;
import entity.MemberShip;
import util.HibernateUtil;

public class TestMemberArticleQuery {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			
			session.beginTransaction();
			
			MemberShip member = session.get(MemberShip.class, 4);
			Set<Article> articles = member.getArticles();
			for (Article a : articles) {
				System.out.println(a.getTitle());
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
