package impl;

import java.util.Iterator;

import core.Map;

public class TreeMap<T extends Comparable<T>> implements Iterable<T> {
//Type T refers to TreeEntry which Extends Comparable
	
	private BinarySearchTree<T> tree;
	
	protected class TreeEntry <K,V> implements Comparable<K> {

		@Override
		public int compareTo(K o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	public TreeMap() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
