package com.bridgelabz.utility;

import java.util.Comparator;

public class Stack<E extends Comparable<E>> implements Comparator<E> {

	int size = 0;
	public Node<E> start = null;

	private class Node<V> {
		public V element;
		public Node<V> next;
	}

	/**
	 * Purpose : Push Element In Stack.
	 */
	public void push(E element) {
		if (start == null) {
			start = new Node<E>();
			start.element = element;
			size++;
			return;
		}
		Node<E> temp = new Node<E>();
		temp.element = element;
		temp.next = start;
		start = temp;
		size++;
	}

	/**
	 * Purpose : Pop The Element From Stack.
	 * 
	 * @return
	 */
	public E pop() {
		if (start != null) {
			E popelement = start.element;
			start = start.next;
			size--;
			return popelement;

		} else {
			return null;
		}
	}

	/**
	 * Purpose : Fetch the first element of the Stack.
	 * 
	 * @return
	 */
	public E peek() {
		return start.element;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	public int size() {
		return size;
	}

	@Override
	public int compare(E arg0, E arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
}