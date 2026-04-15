package com.tnsif.finalkeyworddemo;
// demo for final variable

class UPIAPP{
	final int max=10000;

void showlimit() {
	System.out.println("amount "+max);
}
}
public class Finalvariable {
public static void main(String[] args) {
	UPIAPP u =new UPIAPP();
	u.showlimit();
//	u.max=20000;
}
}

