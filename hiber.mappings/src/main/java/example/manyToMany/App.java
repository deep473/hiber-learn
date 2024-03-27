package example.manyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
		public static void main(String[] args) {
			
			//object creation
			Fresher f1 = new Fresher();
			Fresher f2 = new Fresher();
			
			List<Fresher> freshers = new ArrayList<Fresher>();
			freshers.add(f1);
			freshers.add(f2);
			
			Job j1 = new Job(1111,"dev",45000,freshers);
			Job j2 = new Job(2222,"tester",35000,freshers);
			
			List<Job> jobs = new ArrayList<Job>();
			jobs.add(j1);
			jobs.add(j2);
			
			f1.setId(1);
			f1.setName("deep");
			f1.setQualification("b.tech");
			f1.setJobs(jobs);
			
			f2.setId(2);
			f2.setName("deepika");
			f2.setQualification("m.tech");
			f2.setJobs(jobs);
			
			//hibernate code
	        Configuration cfg = new Configuration();
	        cfg.configure();
	        
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();
	        Transaction tx= session.beginTransaction();
	        
	       //save objects
	        
	        session.save(f1);
	        session.save(f2);
	        
	        session.save(j1);
	        session.save(j2);
	        
	        //commit transaction
	       tx.commit();
		}
}
