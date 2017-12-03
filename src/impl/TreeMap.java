package impl;

import java.util.Iterator;

import core.Entry;
import core.Map;

//TreeMap should be take parameters which are comparable
//public class TreeMap<K extends comparable<K>,V> extends comparable<TreeEntry<K,V>>> implements Iterable<TreeEntry<K,V>>{
//Tree map of types of generic types K and V where K extends is comparable and the tree map implements the interface map.
public class TreeMap<K extends Comparable<K>,V> implements Map<K,V>{
//public class TreeMap<K,V> implements Comparable<TreeMap<K,V>>,  Map<K,V>{

	
	//The key must be comparable for the TreeEntry to be comparable
	
//	class Item<T extends Comparable<T>> implements Comparable<Item<T>>


	protected class TreeEntry<K,V> implements Entry<K,V>, Comparable<TreeEntry<K,V>>{

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

//		public int compareTo(TreeMap<K, V>.TreeEntry<K, V> o) {
//			// TODO Auto-generated method stub
//			return this.key().compareTo(o.key());
//		}
		
		public String toString() {
			return "{k" + key + ", " + value + "}";
		}

		@Override
		public int compareTo(TreeMap<K, V>.TreeEntry<K, V> o) {
			return 0;
		}

//		public int compareTo(TreeMap<K, V>.TreeEntry<K, V> o) {
//			// TODO Auto-generated method stub
//			return 0;
//		}

//		@Override
//		public int compareTo(TreeMap<K, V>.TreeEntry<K, V> o) {
//			// TODO Auto-generated method stub
//			return 0;
//		}

		
	}
	//<--------end of tree entry--------->//
	
	private BinarySearchTree<TreeEntry<K,V>> tree;
	private BinarySearchTree<K extends Comparable<K>> tree;

	private int size;
	
	public TreeMap() {
		tree = new BinarySearchTree<TreeEntry<K,V>>();
		size = 0;
	}
	
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
		//find entry in tree based on key. Create temp entry to search with
		TreeEntry<K,V> temp = new TreeEntry<>(k,null);
		TreeEntry<K,V> entry = tree.find(temp);
		//extract value from entry
		return entry.value();
	}

	@Override
	public V put(K k, V v) {
		//create entry
		TreeEntry<K,V> entry = new TreeEntry<>(k,v);
		//insert it into the tree
		TreeEntry<K,V> old = tree.insert(entry);
		return old.value();
	}

	@Override
	public V remove(K k) {
		// TODO Auto-generated method stub
		TreeEntry<K,V> temp = new TreeEntry<>(k,null);
		TreeEntry<K,V> entry = tree.remove(temp);
		return entry.value();
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
	
	public static void main(String[] args) {
//		TreeEntry<Integer,String> e1 = new TreeEntry<>(1,"Hey");
//		TreeEntry<Integer,String> e2 = new TreeEntry<>(2,"Hey");
//		
////		Entry<Integer,String> e1 = new TreeEntry<Integer,String>(1,"Hey");
////		Entry<Integer,String> e2 = new TreeEntry<Integer,String>(2,"Hey");
//		
//		System.out.println(e1.compareTo(e2));
		
		TreeMap<Integer,String> t1 = new TreeMap<>();
		System.out.println(t1.size());
		t1.put(3, "Boy");
		System.out.println(t1);
	}
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
