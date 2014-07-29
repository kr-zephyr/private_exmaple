package kr.pe.sz21c.exam01.linkedlist.singly;

/**
 * 
 * <pre>
 * 단순 연결 리스트 모델.
 * 
 * 2014. 7. 14. by zephyr
 * </pre>
 *
 * @param <T>
 */
public class ListElement<T> {
	private T value = null;
	private ListElement<T> nextElem = null;
	
	/**
	 * Constructor.
	 * 
	 * @param _elem
	 */
	ListElement (T _value) {
		this.value = _value;
	}
	
	public ListElement<T> next() {
		return this.nextElem;
	}
	
	protected void setNext(ListElement<T> _elem) {
		this.nextElem = _elem;
	}
	
	public T getValue() {
		return value;
	}
}
