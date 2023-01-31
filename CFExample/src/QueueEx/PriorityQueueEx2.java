package QueueEx;

import java.util.PriorityQueue;

public class PriorityQueueEx2 {
	public static void main(String[] args) {
		PriorityQueue pq1=new PriorityQueue();
		PriorityQueue pq2=new PriorityQueue();
		
		pq2.add("rahul@gmail.com");
		pq2.add("rahul@gmail.com");
		pq2.add("rahul@gmail.com");
		pq2.add("rahul@gmail.com");
		System.out.println(pq1);
		System.out.println(pq2);
		pq2.offer("shaw@gmail.com");
		
		
		System.out.println(pq2);
	}
}
