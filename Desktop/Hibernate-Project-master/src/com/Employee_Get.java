package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
public class Employee_Get {
	public static void get_data(){
		try {
			SessionFactory sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
			Session session=sessionfactory.openSession();
			Employee obj_Employee=new Employee();
			obj_Employee=(Employee)session.get(Employee.class,2);
			System.out.println("Get the Employee Data -"+obj_Employee.getEmployee_name());
			session.beginTransaction().commit(); 
		    session.close();
		    sessionfactory.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}