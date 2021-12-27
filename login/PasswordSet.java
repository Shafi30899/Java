package com.login;

import java.util.Scanner;

public class PasswordSet {
	
	
	 static int digSum(int n)
	    {
	        int sum = 0;
	        while (n > 0 || sum > 9)
	        {
	            if (n == 0) {
	                n = sum;
	                sum = 0;
	            }
	            sum += n % 10;
	            n /= 10;
	        }
	        return sum;
	    }

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("enter first name : ");
	//String fname=s.next();
	String fname="ajay";
	System.out.println("enter last name : ");
	//String lname=s.next();
	String lname="kumar";
	System.out.println("enter date of birth : ");
	//String dob=s.next();
	String dob="12081982";
	System.out.println("enter mobile : ");
	//String mob=s.next();
	String mob="9439210934";
	System.out.println("enter proof : ");
//	String idp=s.next();
	String idp="afeip2389u";
	
	System.out.println(fname);
	System.out.println(lname);
	System.out.println(dob);
	System.out.println(mob);
	System.out.println(idp);

	
	String str= dob.substring(dob.length() - 4);
	String uname=fname+str;
	String pwd="";
	System.out.println("user name : "+uname);
	String str1=fname.substring(fname.length()-1);
	char str2=lname.charAt(0);
	char[] str3 = dob.toCharArray();
    int sum = 0;
    int sum1=0;
	for (int i = 0; i < str3.length; i++) {
          if (Character.isDigit(str3[i])) {
              int a = Integer.parseInt(String.valueOf(str3[i]));
              sum = sum + a;
          }
      }
	if(sum<10) {
		sum1=sum;
		  }
	else {
			sum1=digSum(sum);
		}
	String str4="";
	for(int i=0;i<mob.length();i++) {
		str4=str4+mob.charAt(i);
		i++;
	}	
	
	String str5="";
	for(int i=0; i<idp.length(); i++) {
        if(idp.charAt(i) == 'a'|| idp.charAt(i) == 'e'|| idp.charAt(i) == 'i' || idp.charAt(i) == 'o' || idp.charAt(i) == 'u') {
          str5=str5+idp.charAt(i);
        }
     }
	
	String str6="";
	char[] c = idp.toCharArray();
	for (int i = 0; i < c.length; i++) {
          if (Character.isDigit(c[i])) {
              int a = Integer.parseInt(String.valueOf(c[i]));
              str6 = str6 + a;
          }
      }
	String str7="";
	for(int i=0;i<str6.length();i++) {
		str7=str7+str6.charAt(i);
		i++;
	}
	
	
	
	pwd=str1+str2+sum1+str4+str5+str7;
	System.out.println("user name : "+uname);
	System.out.println("Password : "+pwd);
	
		
		

	}
	

}
