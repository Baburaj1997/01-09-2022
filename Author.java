package com.oops.test1;

public class Author {
	private String firstName,lastName,bookname;

	public Author() {
		
	}

	public Author(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Author(String firstName, String lastName, String bookname) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookname = bookname;
	}
           //setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	        //getters
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getBookname() {
		return bookname;
	}
	
	@Override
	public String toString() {
		return ""+"Author's Name :"+firstName+""+lastName+""+""+bookname;
	}
	
}
