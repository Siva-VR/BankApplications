package com;

class PrivateExample {

	 private int a =10;
	 
	 private void prinNum() {
		 System.out.println(a);
	 }
	 
	 public static void main(String[] args) {
		PrivateExample pe = new PrivateExample();
		pe.prinNum();
		//A a = new A();
		//a.display();
	 }
}

 class A{
	private void display(){
		System.out.println("hello");
	}
}