package impl;

import core.Entry;

public class TreeEntry<K, V> implements Entry<K, V> {

	private K key;
	private V value;
	
	public TreeEntry() {
		this(null,null);
	}
	
	public TreeEntry(K k, V v) {
		setKey(k);
		value = v;
	}


	@Override
	public K key() {
		return key;
	}

	@Override
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
	
	

}
