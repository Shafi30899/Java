package com.login;

public class SumString {
	public static void main(String[] args) {
		
	
	
//	String str1="1234567890";
//    String sum = "";
//	
//	  for (int i = 0; i < str1.length();i++) {
//            //  int a = Integer.parseInt(String.valueOf(c[i]));
//              sum = sum + str1.charAt(i);
//              i++;
//          }
//	  System.out.println(sum);
      
		 String str1 = new String("afeip2389u");
//	      for(int i=0; i<str.length(); i++) {
//	         if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//	            System.out.print(str.charAt(i));
//	         }
//	      }
		 
char[] c = str1.toCharArray();
	        String sum="";
	        for (int i = 0; i < c.length; i++) {
	            if (Character.isDigit(c[i])) {
	                int a = Integer.parseInt(String.valueOf(c[i]));
	                sum = sum + a;
	            }
	        }
	        System.out.println("Sum of Digits is : " + sum);

	String sum1="";
	for(int i=0;i<sum.length();i++) {
		sum1=sum1+sum.charAt(i);
		i++;
	}
	  System.out.println("Sum of Digits is : " + sum1);
	}


	
}
