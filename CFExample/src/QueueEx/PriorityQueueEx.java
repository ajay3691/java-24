package QueueEx;

import java.util.PriorityQueue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		pq.add("rahul@gmail.com");
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(20);
		System.out.println(pq);
	}
}
