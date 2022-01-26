package january19;

import java.util.ArrayList;

import com.sun.tools.javac.parser.Scanner;

public class MainClass<T> {
		ArrayList <T> queue = new ArrayList<T>();
		
		public void enqueue(T item) {
			queue.add(item);
		}
		
		public T dequeue() {
			if(queue.isEmpty()) {
				return null;
			}
			return queue.remove(0);
		}
		
		public static void main(String[] args) {
			MainClass <Integer> que = new MainClass <Integer>();
			que.enqueue(0);
			que.enqueue(1);
			que.enqueue(2);
			System.out.println(que.queue);
		}
		
}
