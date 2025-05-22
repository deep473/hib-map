package mapping.hiber;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure();
        SessionFactory fact = cfg.buildSessionFactory();
        Session sess = fact.openSession();
        Transaction tx = sess.beginTransaction();
        
        Biker biker = new Biker();
        
        Bike b1 = new Bike(111, "Apache", 150000, biker);
        Bike b2 = new Bike(222, "Yamaha", 175000, biker);
        
        List<Bike> bikeList = new ArrayList<Bike>();
        bikeList.add(b1);
        bikeList.add(b2);
        
        biker.setId(1);
        biker.setName("Amit");
        biker.setBikeList(bikeList);
        
        sess.persist(biker);
        sess.persist(b1);
        sess.persist(b2);
        
        tx.commit();
    }
}
