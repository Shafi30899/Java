package com.Dsa;

public class LinkedListPractice {

	public class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	public static void main(String[] args) {
		
		LinkedListPractice x=new LinkedListPractice();
		Node n1=x.new Node(10);
		Node n2=x.new Node(20);
		Node n3=x.new Node(30);
		
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=null;
		x.transverse(head);
	

	}
	void transverse(Node head) {
		Node cur=head;
		while(cur!=null) {
			System.out.println(cur.data);
			cur=cur.next;
		}
		
		
	}

}
