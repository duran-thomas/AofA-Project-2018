
public class LinkedList {
	
	private DataNode head;
	
	public LinkedList() {
		head = null;
	}

	public DataNode getHead() {
		return head;
	}

	public void setHead(DataNode head) {
		this.head = head;
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
		if(isFull()) {
			System.out.println("List Is Full");
		}else {
			DataNode temp = new DataNode(data);
			if(isEmpty()) {
				head = temp;
			}else {
				DataNode temp2 = head;
				while(temp2.getLink() != null) {
					temp2 = temp2.getLink();
				}
				temp2.setLink(temp);
			}
		}
	}
	

	public Module remove() {
		Module c = null;
		if(isEmpty()) {
			System.out.println("List Is Empty");
		}else {
			DataNode current = head;
			head = current.getLink();
			c = current.getData();
			current = null;
		}
		return c;
	}
	
	DataNode getMiddle(DataNode h) {
		if (h == null) return h;
		DataNode a = h.getLink();
		DataNode b = h;
		
		while (a != null) {
			a = a.getLink();
			if(a != null) {
				b = b.getLink();
				a = a.getLink();
			}
		}
		return b;
	}
	
	DataNode sortedMerge(DataNode a, DataNode b) {
		DataNode result = null;
		
		if (a == null) return b;
		if (b == null) return a;
		
		if (a.getData().rating <= b.getData().rating) {
			result = a;
			result.setLink(sortedMerge(a, b.getLink()));
		}
		return result;
	}
	
	DataNode mergeSort(DataNode h) {
		if (h == null || h.getLink() == null) {
			return h;
		}
		
		DataNode middle = getMiddle(h);
		DataNode nextOfMiddle = middle.getLink();
		
		middle.setLink(null);
		
		DataNode leftList = mergeSort(h);
		DataNode rigthList = mergeSort(nextOfMiddle);
		
		DataNode sortedList = sortedMerge(leftList, rigthList);
		return sortedList;
	}
	
	
	@Override
	public String toString() {
		return "LinearList [head=" + head + "]" +"\n";
	}
	
	public void show() {
		System.out.println(toString());
		
	}
}
