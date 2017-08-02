package data_structures;
import java.util.*;

public class Queues {
	public static class MyQueue<T> {
		Stack<T> newFirst = new Stack<T>();
		Stack<T> oldFirst = new Stack<T>();

		public void enqueue(T value) { // Push onto newest stack
			newFirst.push(value);
		}

		public T peek() {
			if(oldFirst.isEmpty()){
				while(!newFirst.isEmpty()){
					oldFirst.push(newFirst.pop());
				}
				T peek = oldFirst.peek();
				return peek;
			}else{
				return oldFirst.peek();
			}
		}

		public T dequeue() {
			if(oldFirst.isEmpty()){
				while(!newFirst.isEmpty()){
				 oldFirst.push(newFirst.pop());
				}
				return oldFirst.pop();
			}else{
				return oldFirst.pop();
			}
		}
	}

	
	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.dequeue();
			} else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}
}
