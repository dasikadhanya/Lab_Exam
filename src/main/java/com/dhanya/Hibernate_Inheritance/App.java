package com.dhanya.Hibernate_Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg=new Configuration();
       cfg.configure();
       SessionFactory sf=cfg.buildSessionFactory();
       Session s=sf.openSession();
       Transaction tnx=s.beginTransaction();
       Vechile e=new Vechile();
       e.setId(1);
     e.setName("Dhanya");
     e.setType("Cse");
     e.setMaxspeed(1000.0);
     e.setColor1("Blue");
       s.save(e);
       tnx.commit();
       Car pe=new Car();
       pe.setNo_of_doors(4);;
       s.save(pe);
       Transaction tnx1=s.beginTransaction();
       tnx1.commit();
      Truck ce=new Truck();
       ce.setLoadcapacity(1000.0);
       s.save(ce);
       Transaction tnx2=s.beginTransaction();
       tnx2.commit();
       
       s.close();
    }
}
