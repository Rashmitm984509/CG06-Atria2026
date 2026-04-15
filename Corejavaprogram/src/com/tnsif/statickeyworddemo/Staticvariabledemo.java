package com.tnsif.statickeyworddemo;
// demo for static variable(common property)

class Student{
	String name;
	int id;
 static String collegename="Atria";
	
	//parameter con
	public Student(String name, int id ) {
		this.name = name;
		this.id = id;
		this.collegename = collegename;
	}
	
	void showdetails() {
		System.out.println(" Student "+ name +" id "+ id +" collegname "+ collegename);
	}
}

public class Staticvariabledemo {
	public static void main(String[] args) {
		Student s1=new Student("Guru",1);	
		Student s2=new Student("Rahul",3);
		Student s3=new Student("Prajwal",7);
		Student s4=new Student("roshan",4);
		
		s1.showdetails();
		s2.showdetails();
		s3.showdetails();
		s4.showdetails();
	}
	
}
