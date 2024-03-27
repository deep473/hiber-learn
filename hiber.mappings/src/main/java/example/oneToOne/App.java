package example.oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		//object creation
		Person p1 = new Person();
		Person p2 = new Person();
		
		Passport pp1 = new Passport(101, "India", p1);
		Passport pp2 = new Passport(102, "Sri lanka", p2);
		
		p1.setId(111);
		p1.setName("ramesh");
		p1.setPassport(pp1);
		
		p2.setId(222);
		p2.setName("dilshan");
		p2.setPassport(pp2);
		
		//hibernate code
        Configuration cfg = new Configuration();
        cfg.configure();
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx= session.beginTransaction();
        
       //save objects
        
        session.save(p1);
        session.save(p2);
        
        session.save(pp1);
        session.save(pp2);
        
        //commit transaction
       tx.commit();
	}
}
