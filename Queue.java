package lineards;

public class Queue {
	static int cap=4,front=0,rear=0;
	static int que[]=new int[cap];
	public static boolean isfull() {
		if(rear==cap) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean isempty() {
		if(rear==front) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void enque(int ele) {
		if(isfull()) {
			System.out.println("Que is Full");
		}
		else {
			que[rear]=ele;
			rear++;
		}
	}
	public static void deque() {
		if(isempty()) {
			System.out.println("Que is empty");
		}
		else {
			for(int i=0;i<rear-1;i++) {
				que[i]=que[i+1];
				rear--;
			}
		}
	}
	public static void display() {
		if(isempty()) {
			System.out.println("Que is empty");
		}
		else {
			for(int i=0;i<rear;i++) {
				System.out.print(que[i]+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     enque(10);
     enque(20);
     enque(30);
     enque(40);
     display();
     deque();
     deque();
     display();
	}

}
