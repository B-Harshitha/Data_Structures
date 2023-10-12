package lineards;

import java.util.Scanner;

public class Stack {
	
	static int top=-1;
	static int cap;
	static int Stack[]=new int[cap];;
	
	public static boolean isfull() {
		if(top==cap-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void push(int ele) {
		if(isfull())
		{
			System.out.println("Stack is full");
		}
		else {
			top++;
		}
	}
	
	
	public static boolean isempty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void pop() {
		if(isempty()) {
			System.out.println("Stack is empty");
		}
		else {
			System.out.println(Stack[top]+"deleted");
			top--;
		}
	}

	
	public static void peek() {
		if(isempty()) {
			System.out.println("Stack is full");
		}
		else {
			System.out.println(Stack[top]);
		}
	}
	
	
	public static void display() {
		if(isempty()) {
			System.out.println("Stack is full");
		}
		else {
			for(int i=top;i>=0;i--) {
				System.out.println(Stack[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the capacity of stack");
		cap=ip.nextInt();
		while(true) {
			System.out.println("Enter your choice \n 1.Push \n 2.Pop\n 3.Peek \n 4.Display \n 5.Exit");
			int choice=ip.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the element");
				 int ele=ip.nextInt();
				 push(ele);
				 
				 break;
			case 2:
				pop();
				 break;
			case 3:
				peek();
				 break;
			case 4:
				display();
				 break;
			case 5:
				System.out.println("Stack is closed");
				 System.exit(0);
				 break;
			default:System.out.println("Invalid Choice");
			}
			
		}
	
		// TODO Auto-generated method stub

	}

}
