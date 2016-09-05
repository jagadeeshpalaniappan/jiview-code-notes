package com.jag.datastructures.custom;

public class CustomLinkedListTest {

	public static void main(String[] args) {

		// Default constructor - let's put "0" into head element.
		JagLinkedList list = new JagLinkedList();

		// add more elements to LinkedList
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");

		/*
		 * Please note that primitive values can not be added into LinkedList
		 * directly. They must be converted to their corresponding wrapper
		 * class.
		 */

		System.out.println("Print: crunchifyList: \t\t" + list);
		System.out.println(".size(): \t\t\t\t" + list.size());
		System.out.println(".get(0): \t\t\t\t" + list.get(0) + " (get element at index:0)");
		System.out.println(".get(3): \t\t\t\t" + list.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + list.remove(2) + " (element removed)");
		System.out.println(".get(3): \t\t\t\t" + list.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + list.size());
		System.out.println("Print again: crunchifyList: \t" + list);
		
		
		
		list.reverse(list);
		
		System.out.println("Print: crunchifyList: \t\t" + list);
	}

}




//--------------------------------------------------------------------------------------------


class JagLinkedList {

	private static int counter;
	private Node head;

	// Default constructor
	public JagLinkedList() {

	}

	// Add new data (Node) to the end of this List (lastNode).
	public void add(Object data) {

		// Initialize Node only in case of [1st element]
		if (head == null) {
			head = new Node(data);
		}

		Node newNode = new Node(data);
		Node currentNode = head;

		// Let's check for NPE before iterate over crunchifyCurrent
		if (currentNode != null) {

			// starting at the head node,
			// crawl to the end of the list and then add element after last node

			// Find 'lastNode' --which has nextNode val as 'null'
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}

			// Found 'lastNode'
			// Set lastNode's "next" reference as "newNode"
			currentNode.setNextNode(newNode);
		}

		// increment the number of elements variable
		incrementCounter();
	}

	private static int getCounter() {
		return counter;
	}

	private static void incrementCounter() {
		counter++;
	}

	private void decrementCounter() {
		counter--;
	}

	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {

		Node newNode = new Node(data);
		Node currentNode = head;

		// Let's check for NPE before iterate over crunchifyCurrent
		if (currentNode != null) {
			// crawl to the requested index or the last element in the list,
			// whichever comes first
			for (int i = 0; i < index && currentNode.getNextNode() != null; i++) {
				currentNode = currentNode.getNextNode();
			}
		}

		// Found (one node) before requested-index
		Node oneNodeBeforeRequestedIndex = currentNode;

		Node requestedIndexCurrentNode = oneNodeBeforeRequestedIndex.getNextNode();

		// Setting the 'requestedIndexCurrentNode' as newNode's nextElement
		// --since newNode is going to be inserted in that index
		newNode.setNextNode(requestedIndexCurrentNode);

		// Now, set the oneNodeBeforeRequestedIndex's nextElement as 'newNode'
		// So, that 'newNode' gets inserted in to requested-index
		oneNodeBeforeRequestedIndex.setNextNode(newNode);

		// increment the number of elements variable
		incrementCounter();
	}

	// returns the element at the specified position in this list.
	public Object get(int index) {

		// index must be 1 or higher
		if (index < 0) {

			// Requested Index Invalid
			return null;
		}

		Node currentNode = null;

		if (head != null) {

			currentNode = head.getNextNode();

			// (0 to index-1)
			// crawl to the requested index
			for (int i = 0; i < index; i++) {

				// If nextNode is null, thats the last element
				if (currentNode.getNextNode() == null) {
					// Requested Index Not Available
					return null;
				}

				// NextNode
				currentNode = currentNode.getNextNode();
			}

			// Found :: Requested Index --Node --return that data
			return currentNode.getData();
		}

		return currentNode;

	}
	
	

	// removes the element at the specified position in this list.
	public boolean remove(int index) {

		// if the index is out of range, exit
		if (index < 1 || index > size()){
			return false;
		}
			

		Node currentNode = head;
		
		
		if (head != null) {
			
			
			for (int i = 0; i < index; i++) {
				
				// If nextNode is null, thats the last element
				if (currentNode.getNextNode() == null){
					// Requested Index Not Available
					return false;
				}
					
				// NextNode
				currentNode = currentNode.getNextNode();
			}
			
			
			
			// Found (one node) before requested-index
			Node oneNodeBeforeRequestedIndex = currentNode;

			Node requestedIndexRemoveNode = oneNodeBeforeRequestedIndex.getNextNode();  //this will get GC
			
			Node oneNodeAfterRequestedIndex = requestedIndexRemoveNode.getNextNode();

			
			//Ignored 'requestedIndexRemoveNode'
			oneNodeBeforeRequestedIndex.setNextNode(oneNodeAfterRequestedIndex);

			
			// decrement the number of elements variable
			decrementCounter();
			return true;

		}
		
		
		return false;
	}
	
	public void reverse(JagLinkedList list) {

		if(head != null){
			
			Node reversedNode = null;
			Node currentNode = head;
			
			while (currentNode != null) {
				
				//Temp NextNode (for iteration)
			    Node nextNode = currentNode.getNextNode();
			    
			    
			    //Modified the NextNode -with newlement
			    currentNode.setNextNode(reversedNode);
			    
			    //Changed the reversedNode -for next elemnet
			    reversedNode = currentNode;
			    
			    
			    currentNode = nextNode;
			}
			
			
			head = reversedNode;
			
		}
		

	}

	// returns the number of elements in this list.
	public int size() {
		return getCounter();
	}

	public String toString() {
		String output = "";

		if (head != null) {
			Node crunchifyCurrent = head.getNextNode();
			while (crunchifyCurrent != null) {
				output += "[" + crunchifyCurrent.getData().toString() + "]";
				crunchifyCurrent = crunchifyCurrent.getNextNode();
			}

		}
		return output;
	}

	
	
	
	//----------------------------------------- Node ---------------------------------------------------
	private class Node {
		// reference to the next node in the chain, or null if there isn't one.
		Node nextNode;

		// data carried by this node. could be of any type you need.
		Object data;

		// Node constructor
		public Node(Object dataValue) {
			data = dataValue;
			nextNode = null;
		}

		// another Node constructor if we want to specify the node to point to.
		@SuppressWarnings("unused")
		public Node(Object dataValue, Node nextNodeValue) {
			data = dataValue;
			nextNode = nextNodeValue;
		}

		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}

		@SuppressWarnings("unused")
		public void setData(Object dataValue) {
			data = dataValue;
		}

		public Node getNextNode() {
			return nextNode;
		}

		public void setNextNode(Node nextValue) {
			nextNode = nextValue;
		}
		
		
		
		@Override
		public String toString() {

			return "a"+data;
		}

	}
}