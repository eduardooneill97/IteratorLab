package arrayIterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardArrayIterator<E> implements Iterator<E> {

	private E[] arr;    // the array to iterate over
	// other internal fields...
	private int current;
	
	public ForwardArrayIterator(E[] arr) { 
		this.arr = arr; 
		// initialize other internal fields as needed
		this.current = -1;
	}
	
	public boolean hasNext() {
		// rewrite...
		return current != arr.length-1 ;   
	}

	public E next() throws NoSuchElementException {
		if (!hasNext())
			throw new 
				NoSuchElementException("No more elements to iterate over."); 
		// rewrite
		current++;
		return arr[current];
	}

	public void remove() throws UnsupportedOperationException {
		throw new UnsupportedOperationException(
				"Remove peration not implemented.");
		// do not implement
	}
}
