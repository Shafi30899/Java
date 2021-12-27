package com.login;

import java.util.Scanner;

public class LoginPage {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

	
	
		

		 String[][] arr= { {"anil","aaaa"}, {"sunil","bbbb"} ,{"ram","cccc"}};

		  System.out.println("UserId:");
		  String uid=s.next();
		  System.out.println("Password"); 
		  String pwd=s.next();
		  
		  for(int i=0;i<arr.length;i++) {
		  if(!uid.equals(arr[i][0])) {
			  System.out.println("invalid userName");
			  break;
		  }}
		  
		  for(int i=0;i<arr.length;i++) { 
			  if(uid.equals(arr[i][0])) { 
				 int n=i;
				 if(uid.equals(arr[n][0])) {
					 System.out.println("valid username "); }
				 
				 if(pwd.equals(arr[n][1])) {
					 System.out.println("Success------welcome "+arr[n][0]); }
				 else {
					 System.out.println("invalid password"); }		
			  
			  }
			
		
	}
	}
}
