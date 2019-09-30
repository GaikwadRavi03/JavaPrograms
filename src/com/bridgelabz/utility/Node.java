package com.bridgelabz.utility;

public class Node<T> {

	T data;
	Node<T> next;

	// Default Node Constructor.
	public Node() {
		data = null;
		next = null;
	}

	/**
	 * Purpose : Parameterized Node Constructor.
	 * 
	 * @param data
	 */
	public Node(T data) {
		this.data = data;
		next = null;
	}

	/**
	 * Purpose : Parameterized Node Constructor.
	 * 
	 * @param data
	 * @param next
	 */
	public Node(T data, Node next) {
		this.data = data;
		this.next = next;
	}

	/**
	 * Purpose : reads value of a Data.
	 * 
	 * @return
	 */
	public T getData() {
		return data;
	}

	/**
	 * Purpose : updates value of a Data.
	 * 
	 * @param data
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * Purpose : reads value of a next.
	 * 
	 * @return
	 */
	public Node<T> getNext() {
		return next;
	}

	/**
	 * Purpose : updates value of a Next.
	 * 
	 * @param next
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}