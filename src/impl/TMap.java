package impl;

import java.util.Iterator;

import core.Entry;
import core.Map;

public class TMap<K, V> implements Map<K, V> {

//	public class TreeEntry<K extends Comparable<K>, V> implements Comparable<Entry<K, V>> {

	protected class TreeEntry<K,V> implements Entry<K,V> {

		private K key;
		private V value;
		
		public TreeEntry() {
			this(null,null);
		}
		
		public TreeEntry(K k, V v) {
			key = k;
			value = v;
		}


		public K key() {
			return key;
		}

		public V value() {
			return value;
		}

		public K getKey() {
			return key;
		}
		
		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}
		
		public void setKey(K key) {
			this.key = key;
		}

		@Override
		public String toString() {
			return "{k" + key + ", " + value + "}";
		}

		public int compareTo(TreeEntry<K, V> o) {
			// TODO Auto-generated method stub
			return key.compareTo(o.key());
		}
		
		public int compareTo(Entry<K, V> o) {
			return key.compareTo(o.key());
		}
		
		//test function
		public static void main(String[] args) {
			TreeEntry<Integer,String> e1 = new TreeEntry<>(1,"Hey");
			TreeEntry<Integer,String> e2 = new TreeEntry<>(2,"Hey");
			
//			Entry<Integer,String> e1 = new TreeEntry<Integer,String>(1,"Hey");
//			Entry<Integer,String> e2 = new TreeEntry<Integer,String>(2,"Hey");
			
			System.out.println(e1.compareTo(e2));
		}
	}

	public TMap() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(K k) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V put(K k, V v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public V remove(K k) {
		// TODO Auto-generated method stub
		return null;
	}

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

}