package com.bridgelabz.utility;

import java.util.Comparator;

public class Deque<E extends Comparable<E>> implements Comparator<E> {

	public Node<E> start = null;
	public Node<E> end = null;
	int size = 0;

	private class Node<V> {
		private V data;
		private Node<V> next;
		private Node<V> prev;
	}

	/**
	 * Purpose : Insert at First in Dequeue.
	 * 
	 * @param element
	 */
	public void addFront(E data) {
		if (start == null) {
			Node<E> temp = new Node<E>();
			temp.data = data;
			start = temp;
			end = temp;
			size++;
		} else {
			Node<E> temp = new Node<E>();
			temp.data = data;
			start.prev = temp;
			temp.next = start;
			temp.prev = null;
			start = temp;
			size++;
		}
	}

	/**
	 * Purpose : Insert at Last in Dequeue.
	 * 
	 * @param element
	 */
	public void addRear(E data) {
		if (end == null) {
			Node<E> temp = new Node<E>();
			temp.data = data;
			temp.next = null;
			temp.prev = null;
			start = temp;
			end = temp;
			size++;
		} else {
			Node<E> temp = new Node<E>();
			temp.data = data;
			end.next = temp;
			temp.prev = end;
			temp.next = null;
			end = temp;
			size++;
		}
	}

	/**
	 * Purpose : remove Last In Dequeue.
	 * 
	 * @return
	 */
	public E removeRear() {
		if (size > 0) {
			Node<E> temp = end;
			end = end.prev;
			size--;
			return temp.data;
		}
		return null;

	}

	/**
	 * Purpose : remove First In Dequeue.
	 * 
	 * @return
	 */
	public E removeFront() {
		if (size > 0) {
			Node<E> temp = start;
			start = start.next;
			size--;
			return temp.data;
		}
		return null;

	}

	/**
	 * Purpose : Check The Dequeue is empty or not.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	/**
	 * Purpose : Know The Exact Size of Dequeue.
	 * 
	 * @return
	 */
	public int size() {
		return size;
	}

	@Override
	public int compare(E o1, E o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}