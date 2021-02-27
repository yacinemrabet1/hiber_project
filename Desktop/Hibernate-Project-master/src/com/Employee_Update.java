package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration; 
public class Employee_Update {
	public static void update(){
		try {
			SessionFactory sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
			Session session=sessionfactory.openSession();
			Employee obj_Employee=new Employee();
			obj_Employee.setSl_no(2);
			obj_Employee.setEmployee_name("Employee Two");
			obj_Employee.setMobil_no("22222222");
			session.update(obj_Employee);
			System.out.println("Updated-"+obj_Employee.getEmployee_name());
			session.beginTransaction().commit(); 
		    session.close();
		    sessionfactory.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}