
package com.java;

public class testing {

	public void msg()
	{
		
		
		testing t = new testing();
		String i="DOG";
		String j="GOD";
		testing m =new testing();
		System.out.println("The hash code value of the testing object t is :-->"+t.hashCode());
		System.out.println("The hash code value of the testing object m is :-->"+m.hashCode());
		System.out.println("the hashcodevalue of i  is "+i.hashCode());
		System.out.println("the hash code value of the j is "+j.hashCode());
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testing test=new testing();
		test.msg();
	}

}
