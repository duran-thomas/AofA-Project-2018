
public class List {

	Node head = null;
	
	static class Node{
		
		Module data;
		Node next;
		
		public Node(Module data) {
			this.data = data;
		}
	}
	
	
	Node sortedMerge(Node a, Node b) {
		
		Node result = null;
		if (a == null) {
			return b;
		}
		if (b == null) {
			return a;
		}
		if (a.data.rating <= b.data.rating) {
			result = a;
			result.next = sortedMerge(a.next, b);
		}else {
			result = b;
			result.next = sortedMerge(a, b.next);
		}
		return result;
	}
	
	Node mergeSort(Node h) {
		if (h == null || h.next == null) {
			return h;
		}
		
		Node middle = getMiddle(h);
		Node nextOfMiddle = middle.next;
		
		middle.next = null;
		
		Node leftSide = mergeSort(h);
		Node rightSide = mergeSort(nextOfMiddle);
		
		Node sortedList = sortedMerge(leftSide, rightSide);
		return sortedList;
	}
	
	Node getMiddle(Node h) {
		if (h == null) {
			return h;
		}
		Node a = h.next;
		Node b = h;
		
		while (a != null) {
			a = a.next;
			if(a != null) {
				b = b.next;
				a = a.next;
			}
		}
		return b;
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	@SuppressWarnings("unused") 
	public boolean isFull() {
		DataNode temp = new DataNode();
		if(temp == null) {
			return true;
		}else {
			temp = null;
			return false;
		}
	}
	
	public void insert(Module data) {
		
		Node newNode = new Node(data);
		
		newNode.next = head;
		
		head = newNode;
	}
	
	void printList(Node headref)  
    { 
        while (headref != null)  
        { 
            System.out.print(headref.data + " "); 
            headref = headref.next; 
        } 
    }
}
