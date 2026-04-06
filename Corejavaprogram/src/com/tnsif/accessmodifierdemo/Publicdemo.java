package com.tnsif.accessmodifierdemo;
// demo for public access modifier
public class Publicdemo {
	
	 int a=9;// data members
	public String s="Radha";
	
	public void display() {// function or method
	System.out.println("welcome");	
	}
	
	public static void main(String[] args) {
		Publicdemo p=new Publicdemo();
		System.out.println(p.a);
		System.out.println(p.s);
	p.display();
	}  
}
