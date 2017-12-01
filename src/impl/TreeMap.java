package impl;

import java.util.Iterator;

import core.Entry;
import core.Map;

//TreeMap should be take parameters which are comparable
//public class TreeMap<K extends comparable<K>,V> extends comparable<TreeEntry<K,V>>> implements Iterable<TreeEntry<K,V>>{
public class TreeMap<K extends Comparable<K>,V> implements Map<K,V>{
	
	protected class TreeEntry<K extends Comparable<K>, V> implements Comparable<TreeEntry<K, V>>, Entry<K,V>{

//	protected class TreeEntry<K extends Comparable<K>, V> implements Comparable<TreeEntry<K, V>>, Entry<K,V>{

		private K key;
		private V value;
		
		public TreeEntry() {
			this(null,null);
		}
		
		public TreeEntry(K k, V v) {
			key = k;
			value = v;
		}
		
		@Override
		public K key() {
			// TODO Auto-generated method stub
			return key;
		}

		@Override
		public V value() {
			// TODO Auto-generated method stub
			return value;
		}

		public int compareTo(TreeMap<K, V>.TreeEntry<K, V> o) {
			// TODO Auto-generated method stub
			return this.key().compareTo(o.key());
		}
		
		public String toString() {
			return "{k" + key + ", " + value + "}";
		}

//		@Override
//		public int compareTo(TreeMap<K, V>.TreeEntry<K, V> o) {
//			// TODO Auto-generated method stub
//			return 0;
//		}

		
	}
	//<--------end of tree entry--------->//
	
	private BinarySearchTree<TreeEntry<K,V>> tree;
	private int size;
	
	//<--------start of part (a)--------->//

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size==0;
	}
	
	
	@Override
	public String toString() {
//		return super.toString();
		return tree.toString();

	}
	
	//<--------end of part (a)--------->//

	//<--------start of part (b)--------->//

	@Override
	public V get(K k) {
		//find entry in tree
		//extract value from entry
		return null;
	}

	@Override
	public V put(K k, V v) {
		//create entry
		TreeEntry<K,V> entry = new TreeEntry<>();
		//insert it into the tree
		TreeEntry<K,V> old = tree.insert(entry);
		return old.value();
	}

	@Override
	public V remove(K k) {
		// TODO Auto-generated method stub
		return null;
	}

	//<--------end of part (b)--------->//

	//<--------start of part (c)--------->//
	@Override
	public Iterator<K> keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator<Entry<K, V>> entries() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public static void main(String[] args) {
//		TreeEntry<Integer,String> e1 = new TreeEntry<>(1,"Hey");
//		TreeEntry<Integer,String> e2 = new TreeEntry<>(2,"Hey");
//		
////		Entry<Integer,String> e1 = new TreeEntry<Integer,String>(1,"Hey");
////		Entry<Integer,String> e2 = new TreeEntry<Integer,String>(2,"Hey");
//		
//		System.out.println(e1.compareTo(e2));
//	}
}
























//public class TreeMap<TreeEntry<K,V> extends BinarySearchTree<TreeEntry<K,V>>


//import java.util.Iterator;
//
//import core.Map;
//
//public class TreeMap<T extends Comparable<T>> implements Iterable<T> {
////Type T refers to TreeEntry which Extends Comparable
//	
//	private BinarySearchTree<T> tree;
//	
//	protected class TreeEntry <K,V> implements Comparable<K> {
//
//		@Override
//		public int compareTo(K o) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//		
//	}
//	
//	public TreeMap() {
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public Iterator<T> iterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
