package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
public class Employee_Delete {
	public static void delete(){
		try {
			SessionFactory sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
			Session session=sessionfactory.openSession();
			Employee obj_Employee=new Employee();
			obj_Employee.setEmployee_name("Employee Two");
			session.delete(obj_Employee);
			System.out.println("Deleted  "+obj_Employee.getEmployee_name());
			session.beginTransaction().commit(); 
		    session.close();
		    sessionfactory.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}