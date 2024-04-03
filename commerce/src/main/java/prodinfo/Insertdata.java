package prodinfo;


	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;

	public class Insertdata {

		public static void main(String[] args) {
			SessionFactory sf=Hibernateutil.buildSessionFactory();
			Session session=sf.openSession();
			Transaction ts=session.beginTransaction();
			
			Product1 p=new Product1();
			p.setItem("Eraser");
			p.setPrice(6);
			session.save(p);
			ts.commit();
			System.out.println("Data inserted succesfully");
		}
	}

