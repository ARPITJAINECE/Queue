package com.app.circular_queue_tester;

import com.app.circular_queue.CircularQueue;

public class Circular_Queue_Tester {

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		System.out.println(cq.insert(10));
		System.out.println(cq.insert(20));
		System.out.println(cq.insert(30));
		System.out.println(cq.insert(40));
		System.out.println(cq.insert(50));
		// System.out.println(cq.insert(60));
		System.out.println(cq.delete());
	}

}
