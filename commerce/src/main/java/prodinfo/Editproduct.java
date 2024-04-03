package prodinfo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Editproduct {
public static void main(String[] args) {
	SessionFactory sf=Hibernateutil.buildSessionFactory();
	Session session=sf.openSession();
	Transaction ts=session.beginTransaction();
	
	Product1 p=session.get(Product1.class,5);
	p.setItem("Books");
	session.update(p);
	ts.commit();
}
}
