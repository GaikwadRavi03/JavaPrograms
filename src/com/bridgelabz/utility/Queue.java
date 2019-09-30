package com.bridgelabz.utility;

public class Queue<E> {

	private Node<E> start = null;
	private Node<E> end = null;
	private int size = 0;

	private class Node<V> {
		private V element;
		private Node<V> next;
	}

	public Queue() {

	}

	/**
	 * Purpose : Inserts an element into the back of the Queue.
	 * 
	 * @param element
	 */
	public void enqueue(E element) {
		if (end == null) {
			Node<E> temp = new Node<E>();
			temp.element = element;
			start = end = temp;
			size++;
			return;
		}
		end.next = new Node<E>();
		end = end.next;
		end.element = element;
		size++;
	}

	/**
	 * Purpose : Removes an element from the front of the Queue.
	 * 
	 * @return
	 */
	public E dequeue() {
		if (start == null) {
			return null;
		}
		Node<E> temp = start;
		start = start.next;
		size--;
		return temp.element;

	}

	/**
	 * Purpose : Check The Queue is empty or not.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	/**
	 * Purpose : Know The Exact Size of Queue.
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}
}