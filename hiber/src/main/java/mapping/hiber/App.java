package mapping.hiber;

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
        
        Person p = new Person();    
        Aadhar a = new Aadhar(1001, "btm, blr", "male", p);
        p.setId(1);
        p.setName("amit");
        p.setMobile(998877);
        p.setAadhar(a);
        
        sess.persist(p);
        sess.persist(a);
        
        tx.commit();
    }
}
