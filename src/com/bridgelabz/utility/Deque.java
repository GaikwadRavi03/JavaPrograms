package com.bridgelabz.utility;

import java.util.Comparator;

public class Deque<E extends Comparable<E>> implements Comparator<E> {

	public Node<E> start = null;
	public Node<E> end = null;
	int size = 0;

	private class Node<V> {
		private V element;
		private Node<V> next;
		private Node<V> prev;
	}

	/**
	 * Purpose : Insert at First in Dequeue.
	 * 
	 * @param element
	 */
	public void addFront(E element) {
		if (start == null) {
			Node<E> temp = new Node<E>();
			temp.element = element;
			start = temp;
			end = temp;
			size++;
		} else {
			Node<E> temp = new Node<E>();
			temp.element = element;
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
	public void addRear(E element) {
		if (end == null) {
			Node<E> temp = new Node<E>();
			temp.element = element;
			temp.next = null;
			temp.prev = null;
			start = temp;
			end = temp;
			size++;
		} else {
			Node<E> temp = new Node<E>();
			temp.element = element;
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
			return temp.element;
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
			return temp.element;
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