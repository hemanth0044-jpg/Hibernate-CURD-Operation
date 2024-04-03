package prodinfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Deletproduct {

	public static void main(String[] args) {
		SessionFactory sf=Hibernateutil.buildSessionFactory();
		Session session=sf.openSession();
		Transaction ts=session.beginTransaction();
		
		Product1 p=session.get(Product1.class,5);
		session.delete(p);
		ts.commit();
		System.out.println("Data Deleted");
		
	}
}
