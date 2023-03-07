package StringConcepts;

import java.util.Arrays;

public class StringOperations_Notes {

	public static void main(String[] args) {
		
		
		String m= "This is my testing code";
		System.out.println(m.substring(3)); //is my testing code
		System.out.println(m.substring(5,11)); //is my 
		System.out.println(m.substring(m.indexOf("is")+3, 8)); //is
		System.out.println("-----------------------------------------------------------");
		
		String s5="This is your order id 11234";
		System.out.println(s5.length()); //27
		System.out.println(s5.substring (s5.indexOf("id")+3, s5.length())); //11234
		System.out.println("-----------------------------------------------------------");
		
		String s="Your order 2312 is generated successfully";
		System.out.println(s.length());
		System.out.println(s.substring(s.indexOf("order")+6, s.indexOf('i')-1));
		System.out.println("-----------------------------------------------------------");
		
		 //System.out.println(s5.substring(s5.indexOf("id")+3, s5.length()));
	
}
}