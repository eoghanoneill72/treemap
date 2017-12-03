package impl;

import java.util.Iterator;

import core.Entry;
import core.Map;


public class TreeMap1<K extends Comparable<K>,V> implements Map<K,V>{


	private static class TreeEntry<K extends Comparable<K>,V> implements Comparable<TreeEntry<K,V>>{
		private K key;
		private V value;
		
//		public TreeEntry() {
//			this(null,null);
//		}
		
		public TreeEntry(K k, V v) {
			key = k;
			value = v;
		}
		
		public K key() {
			// TODO Auto-generated method stub
			return key;
		}

		public V value() {
			// TODO Auto-generated method stub
			return value;
		}

		public String toString() {
			return "{" + key + ", " + value + "}";
		}
	
		public int compareTo(TreeEntry<K, V> o) {
			return key.compareTo(o.key());

	    }
				
	}
	
	//<--------end of tree entry--------->//
	
	private BinarySearchTree<TreeEntry<K,V>> tree;

	private int size;
	
	public TreeMap1() {
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

	public TreeEntry<K,V> getEntry(K k, V v){
		TreeEntry<K,V> temp = new TreeEntry<>(k,v);
		TreeEntry<K,V> entry = tree.find(temp);
		return entry;
	}
	
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
		//returns the value if the entry already existed, otherwise, null
		if (old == null) {
			return null;
		}else {
			return old.value();
		}
	}

	@Override
	public V remove(K k) {
		//create temporary dummy entry with the key to remove
		TreeEntry<K,V> temp = new TreeEntry<>(k,null);
		//remove any entry with that key
		//is removal based on key or entire entry?
		//get
		TreeEntry<K,V> entry = tree.remove(temp);
		if (entry == null) {
			return null;
		}else {
			return entry.value();
		}
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
		//<--------start of part (d)--------->//
		TreeMap1<Integer,String> t = new TreeMap1<>();
		t.put(24, "");
		System.out.println(t);
		t.put(12, "");
		System.out.println(t);
		t.put(36, "");
		System.out.println(t);
		t.put(5, "");
		System.out.println(t);
		t.put(7, "");
		System.out.println(t);
		t.put(2, "");
		System.out.println(t);
		t.put(76, "");
		System.out.println(t);
		t.remove(24);
		System.out.println(t);
		t.put(18, "");
		System.out.println(t);
		t.put(24, "");
		System.out.println(t);
		//<--------end of part (d)--------->//
	}
}
