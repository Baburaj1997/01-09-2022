package com.oops.test1;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1=new Employee(100064 ,"Babu ","Kumar ",80000);
		System.out.println(e1);
		
		System.out.println("-----------------------------------------------------------");
		          //showing the deatails using getter methods.
		System.out.println(e1.getAnnualSalary());
		System.out.println("id is :"+e1.getId());
		System.out.println("name is :"+e1.getName());
		
	    System.out.println("firstname is: " + e1.getFirstName());
		System.out.println("lastname is: " + e1.getLastName());
		System.out.println("salary is: " + e1.getSalary());

	    System.out.println("name is: " + e1.getName());
	    System.out.println("annual salary is: " + e1.getAnnualSalary());
		System.out.println("-----------------------------------------------------------");
	}

}
