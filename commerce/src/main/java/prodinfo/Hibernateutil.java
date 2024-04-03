package prodinfo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {

	static SessionFactory sessionfactory=null;
	public static SessionFactory buildSessionFactory() {
		if(sessionfactory!=null) {
			sessionfactory=null;
		}
		Configuration cfg=new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Product1.class);
		sessionfactory=cfg.buildSessionFactory();
		return sessionfactory;
	}
}
