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
        
        Course c1 = new Course();
        Course c2 = new Course();
        Course c3 = new Course();
        
        List<Course> cList1 = new ArrayList<Course>();
        cList1.add(c1);
        cList1.add(c2);
        cList1.add(c3);
        List<Course> cList2 = new ArrayList<Course>();
        cList2.add(c2);
        cList2.add(c3);
       
        Student s1 = new Student(1, "amit", cList1);
        Student s2 = new Student(2, "sumit", cList2);
        
        List<Student> sList1 = new ArrayList<Student>();
        sList1.add(s1);
        
        List<Student> sList2 = new ArrayList<Student>();
        sList2.add(s1);
        sList2.add(s2);
        
        c1.setcId(1001);
        c1.setcName("Java");
        c1.setStudentList(sList1);
        
        c2.setcId(2002);
        c2.setcName("Python");
        c2.setStudentList(sList2);
        
        c3.setcId(3003);
        c3.setcName("Sql");
        c3.setStudentList(sList2);
             
        sess.persist(s1);
        sess.persist(s2);
        sess.persist(c1);
        sess.persist(c2);
        sess.persist(c3);
        
        tx.commit();
    }
}
