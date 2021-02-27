package com;
public class Employee_DAO {
	public static void main(String[] args) {
		System.out.println("Insert Employee One");
		Employee_insert.insert_data();
		System.out.println();
		System.out.println("Get Employee One");
		Employee_Get.get_data();
		System.out.println();
		System.out.println("Update Employee One to Employee Two");
		Employee_Update.update();
		System.out.println();
		System.out.println("Delete Employee Two");
		Employee_Delete.delete();
	}
}