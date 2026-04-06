package com.tnsif.accessmodifierdemo2;

import com.tnsif.accessmodifierdemo.Publicdemo;

public class Demo3 {
	public static void main(String[] args) {
		Publicdemo p=new Publicdemo();
		System.out.println(p.a);
		System.out.println(p.s);
	p.display();
}
}