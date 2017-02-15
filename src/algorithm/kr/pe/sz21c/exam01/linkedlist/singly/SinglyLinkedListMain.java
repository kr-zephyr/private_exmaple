package algorithm.kr.pe.sz21c.exam01.linkedlist.singly;

public class SinglyLinkedListMain {
	public static void main(String args[]) {
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		list.printAllElem();
		System.out.println("\n\nAll Element size is " + list.getSize());
		
//		List listOrg = new LinkedList();
		/**
		 * Add
		 * add to 4 for value 7
		 */
		System.out.println("\n\nAdd to 4 for value7.");
		list.add(4, 7);
		list.printAllElem();
		System.out.println("\n\nAll Element size is " + list.getSize());
		
		/**
		 * Del
		 * del to 2
		 */
		System.out.println("\n\nDel to 2.");
		list.del(2);
		list.printAllElem();
		System.out.println("\n\nAll Element size is " + list.getSize());
		
	}
}
