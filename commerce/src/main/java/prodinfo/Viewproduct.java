package prodinfo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Viewproduct {

	public static void main(String[] args) {
		SessionFactory sf=Hibernateutil.buildSessionFactory();
		Session session =sf.openSession();
		List<Product1>pro=session.createQuery(" from Product1 ").list();
		if(pro!=null && pro.size()>0) {
			for(Product1 p:pro) {
				System.out.println(" Id "+p.getId()+" Item "+p.getItem()+" price "+p.getPrice());
			}
		}
		else {
			System.out.println("Table is empty");
		}
		
	}
}
