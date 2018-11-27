
public class MergeSort {

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
}
