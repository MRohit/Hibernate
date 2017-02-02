import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.psl.beans.*;
/*
 * for table per hierarchy(TPH) we need subclass
 * and for table per concrete class we need union subclass
 */

public class Tester {
	public static void main(String[] args) {
		Account act=new Account(101,1000.23);
		Savings sa=new Savings(102,132.2,12321);
		Current ca=new Current(103,1232.2,213.323);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
		try {
			session.beginTransaction();
			session.save(act);
			session.save(sa);
			session.save(ca);
			session.getTransaction().commit();
			System.out.println("Record Savedd");
		}catch(Exception e){
			System.out.println("Error");
			//session.close();
			session.getTransaction().rollback();
		}
	}
	
}
