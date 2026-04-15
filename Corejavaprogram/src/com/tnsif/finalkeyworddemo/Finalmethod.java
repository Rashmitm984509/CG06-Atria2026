package com.tnsif.finalkeyworddemo;
//demo for final method (u cant override)

final class Ecommerceplatform{
	final void calculate() {
		System.out.println("base discount 10%");
	}
}

class Amazon extends Ecommerceplatform{// cant inheritance 
	@Override
	 void calculate() {// cant override
		System.out.println("base discount 20%");
	}
}


public class Finalmethod {
Amazon a=new Amazon();

}
