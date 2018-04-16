package llPositionalList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import interfaces.Position;
import interfaces.PositionalList;

public class PositionalListElemBackwardsIterator<E> implements Iterator<E> {
	
	PositionalList<E> list;
	Position<E> current, recent;
	
	public PositionalListElemBackwardsIterator(PositionalList<E> list) {
		this.list = list;
		this.current = list.last();
		this.recent = null;
	}

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public E next() throws NoSuchElementException{
		if (!hasNext()) 
			throw new NoSuchElementException("No more elements to iterate over.");
		E etr = current.getElement();
		recent = current; 
		current = list.before(current);
		return etr;
	}

}
