package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	delete();
    }
    public static void create() {
    	//object creation
    	Student s = new Student(107,"ankit","eee",2015);
    		
    	//hibernate code
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx= session.beginTransaction();
        //save objects
        session.save(s);
        
        //commit transaction
        tx.commit();
    }
    
    
    
    
    
    public static void read() {
    	//hibernate code
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
      //read object
        Student st = session.get(Student.class, 102);
        System.out.println(st);
    }
    
    
    
    
    
    
    
    
    
    public static void update() {
    	//hibernate code
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx= session.beginTransaction();
        
        //get object
        Student st = session.get(Student.class, 103);
        st.setName("Deepika");
        
        //update object
        session.save(st);
        
        //commit transaction
        tx.commit();
    }
    
    
    
    
    
    public static void delete() {
    	//hibernate code
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx= session.beginTransaction();
        
        //get object
        Student st = session.get(Student.class, 107);
        
        //delete object
        session.delete(st);
        
        //commit transaction
        tx.commit();
    }
}
