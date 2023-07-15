package com.app.tester;

import com.app.queue.Queue;

public class QueueTester {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		System.out.println(q.insert(10));
		System.out.println(q.insert(20));
		System.out.println(q.insert(30));
		System.out.println(q.insert(40));
		System.out.println(q.insert(50));
		System.out.println(q.insert(60));
		System.out.println(q.delete());

	}

}
