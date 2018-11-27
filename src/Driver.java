import javax.swing.plaf.synth.SynthSeparatorUI;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Module 1
		List CIT4020 = new List();
		
		CIT4020.insert(new Module("Clayton", 2, 2));
		CIT4020.insert(new Module("DeCastillo", 3, 2));
		CIT4020.insert(new Module("Lynch", 2, 2));
		CIT4020.insert(new Module("Major", 1, 2));
		CIT4020.insert(new Module("Moore", 1, 2));
		CIT4020.insert(new Module("Ragsdale", 1, 2));
		CIT4020.insert(new Module("Rakes", 3, 2));
		CIT4020.insert(new Module("Rookwood", 3, 2));
		CIT4020.insert(new Module("Russell", 4, 2));
		CIT4020.insert(new Module("Williams", 4, 2));
		

		System.out.println("CIT4020");
		CIT4020.printList(CIT4020.head);
		System.out.println("\n");
		System.out.println("Sorted List");
		CIT4020.head = CIT4020.mergeSort(CIT4020.head);
		CIT4020.printList(CIT4020.head);
		
		//Module 2
		List CIT3003 = new List();
		
		CIT3003.insert(new Module("Clayton", 4, 2));
		CIT3003.insert(new Module("DeCastillo", 3, 2));
		CIT3003.insert(new Module("Lynch", 3, 2));
		CIT3003.insert(new Module("Major", 4, 2));
		CIT3003.insert(new Module("Moore", 1, 2));
		CIT3003.insert(new Module("Ragsdale", 3, 2));
		CIT3003.insert(new Module("Rakes", 1, 2));
		CIT3003.insert(new Module("Rookwood", 4, 2));
		CIT3003.insert(new Module("Russell", 1, 2));
		CIT3003.insert(new Module("Williams", 3, 2));
		
		System.out.println("\n");		
		System.out.println("CIT3003");
		CIT3003.printList(CIT3003.head);
		System.out.println("\n");
		System.out.println("Sorted List");
		CIT3003.head = CIT3003.mergeSort(CIT3003.head);
		CIT3003.printList(CIT3003.head);
		
		//Module 3
		List CMP3011 = new List();
		
		CMP3011.insert(new Module("Clayton", 1, 2));
		CMP3011.insert(new Module("DeCastillo", 4, 2));
		CMP3011.insert(new Module("Lynch", 2, 2));
		CMP3011.insert(new Module("Major", 2, 2));
		CMP3011.insert(new Module("Moore", 4, 2));
		CMP3011.insert(new Module("Ragsdale", 1, 2));
		CMP3011.insert(new Module("Rakes", 1, 2));
		CMP3011.insert(new Module("Rookwood", 4, 2));
		CMP3011.insert(new Module("Russell", 1, 2));
		CMP3011.insert(new Module("Williams", 3, 2));
		
		System.out.println("\n");		
		System.out.println("CMP3011");
		CMP3011.printList(CMP3011.head);
		System.out.println("\n");
		System.out.println("Sorted List");
		CMP3011.head = CMP3011.mergeSort(CMP3011.head);
		CMP3011.printList(CMP3011.head);
		
		//Module 4
		List CMP2006 = new List();
		
		CMP2006.insert(new Module("Clayton", 3, 2));
		CMP2006.insert(new Module("DeCastillo", 1, 2));
		CMP2006.insert(new Module("Lynch", 1, 2));
		CMP2006.insert(new Module("Major", 5, 2));
		CMP2006.insert(new Module("Moore", 4, 2));
		CMP2006.insert(new Module("Ragsdale", 5, 2));
		CMP2006.insert(new Module("Rakes", 5, 2));
		CMP2006.insert(new Module("Rookwood", 5, 2));
		CMP2006.insert(new Module("Russell", 2, 2));
		CMP2006.insert(new Module("Williams", 1, 2));
		
		System.out.println("\n");		
		System.out.println("CMP2006");
		CMP2006.printList(CMP2006.head);
		System.out.println("\n");
		System.out.println("Sorted List");
		CMP2006.head = CMP2006.mergeSort(CMP2006.head);
		CMP2006.printList(CMP2006.head);
		
		//Module 5
		List CMP1005 = new List();
		
		CMP1005.insert(new Module("Clayton", 2, 2));
		CMP1005.insert(new Module("DeCastillo", 2, 2));
		CMP1005.insert(new Module("Lynch", 3, 2));
		CMP1005.insert(new Module("Major", 1, 2));
		CMP1005.insert(new Module("Moore", 2, 2));
		CMP1005.insert(new Module("Ragsdale", 4, 2));
		CMP1005.insert(new Module("Rakes", 3, 2));
		CMP1005.insert(new Module("Rookwood", 5, 2));
		CMP1005.insert(new Module("Russell", 2, 2));
		CMP1005.insert(new Module("Williams", 2, 2));
		
		System.out.println("\n");		
		System.out.println("CMP1005");
		CMP1005.printList(CMP1005.head);
		System.out.println("\n");
		System.out.println("Sorted List");
		CMP1005.head = CMP1005.mergeSort(CMP1005.head);
		CMP1005.printList(CMP1005.head);
		
		//Module 6
		List CIT3006 = new List();
		
		CIT3006.insert(new Module("Clayton", 5, 2));
		CIT3006.insert(new Module("DeCastillo", 5, 2));
		CIT3006.insert(new Module("Lynch", 4, 2));
		CIT3006.insert(new Module("Major", 3, 2));
		CIT3006.insert(new Module("Moore", 3, 2));
		CIT3006.insert(new Module("Ragsdale", 1, 2));
		CIT3006.insert(new Module("Rakes", 1, 2));
		CIT3006.insert(new Module("Rookwood", 1, 2));
		CIT3006.insert(new Module("Russell", 5, 2));
		CIT3006.insert(new Module("Williams", 3, 2));
		
		System.out.println("\n");		
		System.out.println("CIT3006");
		CIT3006.printList(CIT3006.head);
		System.out.println("\n");
		System.out.println("Sorted List");
		CIT3006.head = CIT3006.mergeSort(CIT3006.head);
		CIT3006.printList(CIT3006.head);
		
		//Module 7
		List CMP4011 = new List();
		
		CMP4011.insert(new Module("Clayton", 5, 2));
		CMP4011.insert(new Module("DeCastillo", 5, 2));
		CMP4011.insert(new Module("Lynch", 4, 2));
		CMP4011.insert(new Module("Major", 2, 2));
		CMP4011.insert(new Module("Moore", 3, 2));
		CMP4011.insert(new Module("Ragsdale", 1, 2));
		CMP4011.insert(new Module("Rakes", 1, 2));
		CMP4011.insert(new Module("Rookwood", 1, 2));
		CMP4011.insert(new Module("Russell", 5, 2));
		CMP4011.insert(new Module("Williams", 3, 2));
		
		System.out.println("\n");		
		System.out.println("CMP4011");
		CMP4011.printList(CMP4011.head);
		System.out.println("\n");
		System.out.println("Sorted List");
		CMP4011.head = CMP4011.mergeSort(CMP4011.head);
		CMP4011.printList(CMP4011.head);
		
		//Module 8
		List CIT4004 = new List();
		
		CIT4004.insert(new Module("Clayton", 5, 2));
		CIT4004.insert(new Module("DeCastillo", 4, 2));
		CIT4004.insert(new Module("Lynch", 4, 2));
		CIT4004.insert(new Module("Major", 2, 2));
		CIT4004.insert(new Module("Moore", 5, 2));
		CIT4004.insert(new Module("Ragsdale", 2, 2));
		CIT4004.insert(new Module("Rakes", 1, 2));
		CIT4004.insert(new Module("Rookwood", 3, 2));
		CIT4004.insert(new Module("Russell", 5, 2));
		CIT4004.insert(new Module("Williams", 1, 2));
		
		System.out.println("\n");		
		System.out.println("CIT4004");
		CIT4004.printList(CIT4004.head);
		System.out.println("\n");
		System.out.println("Sorted List");
		CIT4004.head = CIT4004.mergeSort(CIT4004.head);
		CIT4004.printList(CIT4004.head);
	}

}
