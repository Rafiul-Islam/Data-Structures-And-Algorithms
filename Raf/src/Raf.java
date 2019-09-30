import java.util.PriorityQueue;
import java.util.Stack;

public class Raf {
	public static void main(String[] args) {

		PriorityQueue<Integer> queue = new PriorityQueue<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println(queue.size());
		
		System.out.println(queue.peek());
		
		
	}
}
