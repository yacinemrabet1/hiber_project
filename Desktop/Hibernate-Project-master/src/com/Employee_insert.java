package com;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
public class Employee_insert {
	public static void insert_data(){
		try {
			SessionFactory sessionfactory=new AnnotationConfiguration().configure().buildSessionFactory();
			Session session=sessionfactory.openSession();
			Employee obj_Employee=new Employee();
		    obj_Employee.setSl_no(2);
			obj_Employee.setEmployee_name("Emplyee One");
			obj_Employee.setMobil_no("111111");
			session.save(obj_Employee);
			session.beginTransaction().commit();
		    session.close();
		    sessionfactory.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}