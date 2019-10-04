package com.bridgelabz.utility;

public class LinkedList<T> {

	public int size;
	public Node<T> start;

	// Default Linked List Constructor.
	public LinkedList() {
		size = 0;
		start = null;
	}

	/**
	 * Purpose : Check Linked List is Empty or not.
	 */
	public boolean isEmpty() { // isEmpty.
		if (start == null)
			return true;
		else
			return false;
	}

	/**
	 * Purpose : Find the total Size of Linked List.
	 * 
	 * @return
	 */
	public int getListSize() { // get list size.
		return size;
	}

	/**
	 * Purpose : Print the linked List.
	 */
	public void printList() { // print list.
		Node<T> temp = start;
		while (temp != null) {
			System.out.print(temp.getData() + " ");
			temp = temp.getNext();
		}
	}

	/**
	 * Purpose : store data in string.
	 * 
	 * @return
	 */
	public String returnListInString() {
		String str = "";
		Node<T> temp = start;
		while (temp != null) {
			str += temp.getData() + " ";
			temp = temp.getNext();
		}
		return str;
	}

	/**
	 * Purpose : insert Node at First Position in Linked List.
	 * 
	 * @param val
	 */
	public void insertAtFirst(T val) {
		Node<T> n = new Node<T>();
		n.setData(val);
		n.setNext(start);
		start = n;
		size++;
	}

	/**
	 * Purpose : Insert Node at Last in Linked List.
	 * 
	 * @param val
	 */
	public void insertAtLast(T val) {
		Node<T> n = new Node<T>();
		n.setData(val);
		Node<T> temp = start;
		if (temp == null) {
			start = n;
		} else {
			while (temp.getNext() != null)
				temp = temp.getNext();
			temp.setNext(n);
		}
		size++;
	}

	/**
	 * Purpose : Insert Node At a Sepcific Position in Linked List.
	 * 
	 * @param index
	 * @param val
	 */
	public void insertAtPosition(int index, T val) {
		if (index == 1)
			insertAtFirst(val);
		else if (index == size + 1)
			insertAtLast(val);
		else if (index > 1 && index <= size) {
			Node<T> n = new Node<T>();
			n.setData(val);
			Node<T> temp = start;
			for (int i = 1; i < index - 1; i++)
				temp = temp.getNext();
			n.setNext(temp.getNext());
			temp.setNext(n);
			size++;
		} else
			System.out.println("insertion not posiible at position :" + index);
	}

	/**
	 * Purpose : Delete First Node in Linked List
	 */
	public void DeleteFirst() {
		if (start == null)
			System.out.println("list is already empty:");
		else {
			start = start.getNext();
			size--;
		}
	}

	/**
	 * Purpose : Delete Last Node in Linked List.
	 */
	public void DeleteLast() {
		if (start == null)
			System.out.println("list is already empty:");
		else if (size == 1) {
			start = null;
			size--;
		} else {
			Node<T> temp = start;
			for (int i = 1; i < size - 1; i++)
				temp = temp.getNext();
			temp.setNext(null);
			size--;
		}
	}

	/**
	 * Purpose : Delete Node at a Specific Position.
	 * 
	 * @param index
	 */
	public void DeleteAtPosition(int index) {
		if (start == null)
			System.out.println("list is already empty");
		else if (index < 1 || index > size)
			System.out.println("Invalid index");
		else if (index == 1)
			DeleteFirst();
		else if (index == size)
			DeleteLast();
		else {
			Node<T> temp = start;
			for (int i = 1; i < index - 1; i++) {
				temp = temp.getNext();
			}
			Node<T> temp2 = temp.getNext();
			temp.setNext(temp2.getNext());
			size--;
		}
	}

	/**
	 * Purpose : Sort the Linked List.
	 * 
	 * @param list
	 */
	public static void sort(LinkedList<Integer> list) {
		int temp = 0;
		for (Node<Integer> j = list.start; j != null; j = j.getNext()) {
			for (Node<Integer> j2 = j.getNext(); j2 != null; j2 = j2.getNext()) {
				if (j.getData() > j2.getData()) {
					temp = j.getData();
					j.data = j2.data;
					j2.data = temp;
				}
			}
		}
	}

	/**
	 * Purpose : Method to add a number at specific position with sorted Linked
	 * List.
	 * 
	 * @param num
	 */
	public void insertAtSpecificPosition(int num) {
		Node<Integer> n = new Node(new Integer(num));
		if (start == null) {
			start = (Node<T>) n; // List is empty add newNode
			return;
		}

		Node t = start;
		Node move = t.next;

		if (t.next == null && (int) t.data > num) {
			n.next = t;
			start = (Node<T>) n; // If number less than head.data add it first
			return;
		}
		while (t.next != null) {
			// To insert at First
			if (num < (int) t.data) {
				n.next = t;
				start = (Node<T>) n;
				break;
			}
			// To insert at Specific position
			if (num > (int) t.data && num < (int) move.data) {
				n.next = move;
				t.next = n;
				break;
			}
			t = t.next;
			move = move.next;
		}

		if ((int) t.data < num) {
			t.next = n; // To insert at last
		}
	}

	/**
	 * Purpose : to search the item.
	 * 
	 * @param word
	 * @return
	 */
	public boolean search(int num) {
		Node temp = start;
		while (temp != null) {
			if ((int) temp.data == num)
				return true;
			temp = temp.next;
		}
		return false;
	}

	/**
	 * Purpose : get method.
	 * 
	 * @param i
	 * @return
	 */
	public String get(int position) {
		// TODO Auto-generated method stub
		Node new_node = start;
		int count = 1;
		if (position == 1) {
			return (String) new_node.getData();
		}
		T element;
		while (new_node.next != null) {
			new_node = new_node.next;
			count++;
			if (count == position) {
				element = (T) new_node.data;
				return (String) element;
			}
		}
		return null;
	}

	/**
	 * Purpose : Delete at position for Hashing class
	 * 
	 * @param index
	 */
	public void DeleteAtPositionHashing(int index) {
		if (start == null)
			System.out.println("list is already empty");
		else if (index < 0 || index > size)
			System.out.println("Invalid index");
		else if (index == 0)
			DeleteFirst();
		else if (index == size)
			DeleteLast();
		else {
			Node<T> temp = start;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.getNext();
				System.out.println(temp.data);
			}
			Node<T> temp2 = temp.getNext();
			temp.setNext(temp2.getNext());
			size--;
		}
	}

	public void DeleteFirstHashing() {
		if (start == null)
			System.out.println("list is already empty:");
		else {
			start = start.getNext();
			size--;
		}
	}

	public void DeleteLastHashing() {
		if (start == null)
			System.out.println("list is already empty:");
		else if (size == 1) {
			start = null;
			size--;
		} else {
			Node<T> temp = start;
			for (int i = 1; i < size - 1; i++)
				temp = temp.getNext();
			temp.setNext(null);
			size--;
		}
	}

}
