package impl;

import core.Entry;

public class TEntry<K, V> implements Comparable<TEntry<K, V>>, Entry<K, V> {

	
	private K key;
	private V value;
	
	public TEntry() {
		this(null,null);
	}
	
	public TEntry(K k, V v) {
		setKey(k);
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

	public int compareTo(TEntry<K, V> o) {
		// TODO Auto-generated method stub
		return key.compareTo(o.key());
	}
	
//	public int compareTo(Entry<K, V> o) {
//		return key.compareTo(o.key());
//	}
	
	//test function
	public static void main(String[] args) {
		TEntry<Integer,String> e1 = new TEntry<>(1,"Hey");
		TEntry<Integer,String> e2 = new TEntry<>(2,"Hey");
		
//		Entry<Integer,String> e1 = new TreeEntry<Integer,String>(1,"Hey");
//		Entry<Integer,String> e2 = new TreeEntry<Integer,String>(2,"Hey");
		
		System.out.println(e1.compareTo(e2));
	}
}
