package algorithm.kr.pe.sz21c.exam01.linkedlist.singly;

public class SinglyLinkedList<T> {
	
	private ListElement<T> elem;
	
	SinglyLinkedList() {
		
	}
	
	public void add(T value) {
		ListElement<T> tmpElem = new ListElement<T>(value);
		if(elem == null) {
			System.out.println("new elem created");
			elem = tmpElem;
		} else {
//			elem = getLast();
			getLast().setNext(tmpElem);
		}
		
		System.out.println("value " + value + " added.");
	}
	
	public ListElement<T> get(int idx) {
		ListElement<T> rtnElem = elem;
		
		for(int i = 0; i < idx; i++) {
			rtnElem = rtnElem.next();
		}
		
		System.out.println("index [" + idx + "] :: " + rtnElem.getValue());
		
		return rtnElem;
	}
	
	public ListElement<T> getLast() {
		ListElement<T> rtnElem = elem;
		
		while(rtnElem.next() != null) {
			rtnElem = rtnElem.next();
		}
		
		return rtnElem;
	}
	
	/**
	 * 
	 * <pre>
	 * list에 담긴 값을 출력한다.
	 * 순차 탐색을 위해 첫번째 element부터 순차적으로 꺼내서 값을 출력한다.
	 * 
	 * 2014. 7. 29. by zephyr
	 * </pre>
	 *
	 */
	public void printAllElem() {
		ListElement<T> tmpElem = elem;
		int idx = 0;
		
		System.out.println("\n\n");
		
		while(tmpElem != null) {
			System.out.println("idx [" + (idx++) + "] :: " + tmpElem.getValue());
			tmpElem = tmpElem.next();
		}
	}
	
	public int getSize() {
		ListElement<T> rtnElem = elem;
		int idx = 1;
		
		while(rtnElem.next() != null) {
			rtnElem = rtnElem.next();
			idx++;
		}
		
		return idx;
	}
	
	/**
	 * 
	 * <pre>
	 * list의 중간에 값을 추가한다.
	 * 추가되는 element의 다음을 지정된 index의 다음 element로 지정하고,
	 * 지정된 index의 다음을 추가되는 element로 지정한다.
	 * 
	 * 2014. 7. 29. by zephyr
	 * </pre>
	 *
	 * @param idx	추가될 위치
	 * @param value	추가될 값
	 */
	public void add(int idx, T value) {
		ListElement<T> tmpElem = elem;
		ListElement<T> addElem = new ListElement<T>(value);
		int i = 1;
		
		while(tmpElem.next() != null) {

			if( i == idx ) { 
				System.out.println("added " + i);
				addElem.setNext(tmpElem.next());
				tmpElem.setNext(addElem);
				System.out.println("addElem :: " + addElem.getValue() + ", tmpElem :: " + tmpElem.next().getValue());
				break;
			}

			i++;
			tmpElem = tmpElem.next();
		}
	}
	
	/**
	 * 
	 * <pre>
	 * List에서 element를 제거한다.
	 * 지정된 index의 next를 다음 다음 element로 연결한다.
	 * 
	 * 2014. 7. 29. by zephyr
	 * </pre>
	 *
	 * @param idx
	 */
	public void del(int idx) {
		ListElement<T> tmpElem = elem;
		int i = 1;
		
		while(tmpElem.next() != null) {
			if( i == idx ) {
				tmpElem.setNext(tmpElem.next().next());
				break;
			}
			
			i++;
			tmpElem = tmpElem.next();
		}
	}
}
