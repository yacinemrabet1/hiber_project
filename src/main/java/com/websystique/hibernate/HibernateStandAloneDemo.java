package com.websystique.hibernate;

import java.util.List;

import org.hibernate.Session;

import com.websystique.hibernate.model.Student;

/**
 * Class used to perform CRUD operation on database with Hibernate API's
 * 
 */
public class HibernateStandAloneDemo {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		HibernateStandAloneDemo application = new HibernateStandAloneDemo();

		/*
		 * Save few objects with hibernate
		 */
		int studentId1 = application.saveStudent(1,2, 4,"yacine","mrabet","it","homme");
		int studentId2 = application.saveStudent(1,2, 4,"essefi","ahlem","it","femme");


		/*
		 * Retrieve all saved objects
		 */
		List<Student> students = application.getAllStudents();
		System.out.println("List of all persisted students >>>");
		for (Student student : students) {
			System.out.println("Persisted Student :" + student);
		}

		/*
		 * Update an object
		 * application.updateStudent(studentId4, "ARTS");
		 */

		 application.updateStudent(studentId1, "DS");


		/*
		
		 * Deletes an object
		
		 */
		 application.deleteStudent(studentId2);

		 
		

		/*
		 * Retrieve all saved objects
		 */
		List<Student> remaingStudents = application.getAllStudents();
		System.out.println("List of all remained persisted students >>>");
		for (Student student : remaingStudents) {
			System.out.println("Persisted Student :" + student);
		}

	}

	/**
	 * This method saves a Student object in database
	 */
	public int saveStudent(int id_inscription, int id_famille, int num_eleve, String prenom, String nom,
			String section, String sexe) {
		Student student = new Student(id_inscription, id_famille,  num_eleve,  prenom,  nom,
				 section,  sexe);
		

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		int id = (Integer) session.save(student);
		session.getTransaction().commit();
		session.close();
		return id;
	}

	/**
	 * This method returns list of all persisted Student objects/tuples from
	 * database
	 */
	public List<Student> getAllStudents() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		@SuppressWarnings("unchecked")
		List<Student> employees = (List<Student>) session.createQuery(
				"FROM Student s ORDER BY s.prenom ASC").list();

		session.getTransaction().commit();
		session.close();
		return employees;
	}

	/**
	 * This method updates a specific Student object
	 * 
	 */
	
	public void updateStudent(int id, String section) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Student student = (Student) session.get(Student.class, id);
		student.setSection(section);
		session.update(student);//No need to update manually as it will be updated automatically on transaction close.
		session.getTransaction().commit();
		session.close();
		
	}
	

	/**
	 * This method deletes a specific Student object
	 * 
	 */
	
	
	public void deleteStudent(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();

		Student student = (Student) session.get(Student.class, id);
		session.delete(student);
		session.getTransaction().commit();
		session.close();
	}
	
}
