package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.Employee;

import util.HibernateConfig;

public class App {

	public static void main(String[] args) {
     Employee em=new Employee();
//     em.setId(0);
     em.setName("donu");
     em.setGender("Female");
     em.setSalary(20000);
     
     SessionFactory sf=HibernateConfig.getSessionFactory();
     Session session=sf.openSession();
     Transaction tx=session.beginTransaction();
     
     Employee e=session.get(Employee.class, 2);
     System.out.println(e);
     
     session.save(em);
     tx.commit();
     
	}

}
