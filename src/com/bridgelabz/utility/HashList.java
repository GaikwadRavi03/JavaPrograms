package com.bridgelabz.utility;

import java.util.Comparator;

public class HashList<E extends Comparable<E>> implements Comparator<E> {

	public int value = 0;
	public Node<E> start;
	public Node<E> end;
	private boolean empty;

	private class Node<V> {
		public V element;
		public Node<V> next;

		public Node() {
			this.element = null;
			this.next = null;
		}

		public Node(V element) {
			this.element = element;
		}
	}

	public HashList() {

	}

	public HashList(Node<E> start, Node<E> end, int value, boolean empty) {
		this.start = start;
		this.end = end;
		this.value = value;
		this.empty = empty;
	}

	public void add(E element) {
		if (start == null) {
			start = new Node<E>();
			start.element = element;
			start.next = null;
			end = start;
			value++;
			return;
		}
		Node<E> temp = new Node<E>();
		temp.element = element;
		temp.next = start;
		start = temp;
		value++;
	}

	public boolean remove(E item) {
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;

		while (ptr != null && compare(ptr.element, item) != 0) {
			ptr2 = ptr;
			ptr = ptr.next;
		}

		if (ptr == null) {
			return false;
		} else {
			if (ptr.next == null) {
				end = ptr2;
			}
			ptr2.next = ptr.next;
			value--;
			return true;
		}
	}

	public boolean search(E item) {
		Node<E> ptr = start;
		// Node<E> ptr2 = ptr;
		while (ptr != null && compare(ptr.element, item) != 0) {
			// ptr2 = ptr;
			ptr = ptr.next;
		}

		if (ptr == null) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isEmpty() {
		return value == 0 ? true : false;
	}

	public int size() {
		return value;
	}

	public void append(E item) {
		if (end == null) {
			start = new Node<E>();
			start.element = item;
			start.next = null;
			end = start;
			value++;
			return;
		}
		end.next = new Node<E>();
		end.next.element = item;
		end = end.next;
		value++;
	}

	public int index(E item) {
		Node<E> ptr = start;
		// Node<E> ptr2 = ptr;
		int index = 0;
		while (ptr != null && compare(ptr.element, item) != 0) {
			// ptr2 = ptr;
			ptr = ptr.next;
			index++;
		}

		if (ptr == null) {
			return -1;
		} else {
			return index;
		}
	}

	public void insert(int index, E item) {
		int count = 0;
		Node<E> ptr = start;
		Node<E> ptr2 = start;
		while (count != index && ptr != null) {
			ptr2 = ptr;
			ptr = ptr.next;
		}
		if (ptr == null) {
			return;
		}
		Node<E> temp = new Node<E>();
		temp.element = item;
		ptr2.next = temp;
		temp.next = ptr;
	}

	public E pop() {
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		while (ptr.next != null) {
			ptr2 = ptr;
			ptr = ptr.next;
		}

		if (ptr == ptr2) {
			start = end = null;
			value = 0;
			return ptr.element;
		} else {
			end = ptr2;
			ptr2.next = null;
			value--;
		}
		return ptr.element;
	}

	public E pop(int index) {
		int count = 0;
		Node<E> ptr = start;
		Node<E> ptr2 = ptr;
		while (ptr != null && count < index) {
			ptr2 = ptr;
			ptr = ptr.next;
			count++;
		}

		if (count == 0) {
			start = start.next;
			value--;
		}

		else if (ptr == null) {
			return null;
		} else {
			ptr.next = ptr.next;
			value--;
		}
		return ptr.element;
	}

	@Override
	public int compare(E o1, E o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}