package impl;

import core.Entry;

public class TreeEntry<K extends Comparable<K>, V> implements Comparable<Entry<K, V>> {

	private K key;
	private V value;
	
	public TreeEntry() {
		this(null,null);
	}
	
	public TreeEntry(K k, V v) {
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

	@Override
	public int compareTo(Entry<K, V> o) {
		// TODO Auto-generated method stub
		return key.compareTo(o.key());
	}
	
	

}
