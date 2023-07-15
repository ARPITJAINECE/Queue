package com.app.circular_queue;

public class CircularQueue {
	private int[] arr;
	private int front;
	private int rear;
	private int size;

	public CircularQueue(int size) {
		this.size = size;
		front = rear = -1;
		arr = new int[size];
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return (front == -1 && rear == size - 1) || ((rear + 1) % size == front);
	}

	public boolean insert(int data) {
		if (isFull()) {
			System.out.println("a");
			return false;
		}
		System.out.println("b");
		rear = (rear + 1) % size;
		arr[rear] = data;
		return true;
	}

	public int delete() {
		if (isEmpty()) {
			return -1;
		}
		front = (front + 1) % size;
		return arr[front];
	}
}
