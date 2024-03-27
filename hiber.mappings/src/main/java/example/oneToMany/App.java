package example.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		//object creation
		Customer c = new Customer();
		
		Orders o1 = new Orders(111, "jeans", 1499, c);
		Orders o2 = new Orders(222, "shoes", 799, c);
		
		List<Orders> oList = new ArrayList<Orders>();
		oList.add(o1);
		oList.add(o2);
		
		c.setcNum(1000);
		c.setName("rajat");
		c.setOrders(oList);
		
		//hibernate code
        Configuration cfg = new Configuration();
        cfg.configure();
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx= session.beginTransaction();
        
       //save objects
        
        session.save(c);
        
        session.save(o1);
        session.save(o2);
        
        //commit transaction
       tx.commit();
	}
}
