package com.oops.test1;

public class TestAuthor {

	public static void main(String[] args) {
		Author a1=new Author();
		Author a2=new Author("Viraj ","Kumar ");
		Author a3=new Author("Ajay ","Kumar ","A brief history of time ");
		
		System.out.println("V2 :"+a2.getFirstName()); //value of 2nd object using getters method.
		System.out.println("v3 :"+a3);				  //value of the3rd object by using tostring.
		System.out.println("v1 :"+a1.getFirstName()); //value of 1st object using getters.  
		
		System.out.println("A1 :"+a1);                //Reference and its value
		System.out.println("A2 :"+a1.getFirstName()); //
	}

}
