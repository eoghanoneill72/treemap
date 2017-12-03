package impl;

import java.util.Iterator;

import core.Entry;
import core.Map;


/**
 * @author 12312821
 *
 * @param <K> Must be comparable
 * @param <V> Can be anything
 * 
 * Part 2 (a), (b), (c) and (d)
 */
public class TreeMap<K extends Comparable<K>,V> implements Map<K,V>{


	/**
	 * @param <K> Must be comparable
	 * @param <V> Can be anything
	 * Creates an special private Tree Entry object to store key-value pairs
	 */
	private static class TreeEntry<K extends Comparable<K>,V> implements Comparable<TreeEntry<K,V>>{
		
		private K key;
		private V value;
		
		/**
		 * Constructor
		 */
		public TreeEntry(K k, V v) {
			key = k;
			value = v;
		}
		
		/**
		 * @return Key
		 */
		public K key() {
			// return key
			return key;
		}

		/**
		 * @return
		 */
		public V value() {
			//  return key
			return value;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		public String toString() {
			return "{" + key + ", " + value + "}";
		}
	
		/* (non-Javadoc)
		 * @see java.lang.Comparable#compareTo(java.lang.Object)
		 */
		public int compareTo(TreeEntry<K, V> o) {
			return key.compareTo(o.key());

	    }
				
	}
	
	//<--------end of tree entry--------->//
	
	/**
	 * Create private BST to store entries as elements
	 */
	private BinarySearchTree<TreeEntry<K,V>> tree;

	/**
	 * size of the TreeMap
	 */
	private int size;
	
	/**
	 * TreeMap constructor initializes empty BST
	 */
	public TreeMap() {
		tree = new BinarySearchTree<TreeEntry<K,V>>();
		size = 0;
	}
	
	//<--------start of part (a)--------->//

	/* (non-Javadoc)
	 * @see core.Map#size()
	 */
	@Override
	public int size() {
		return size;
	}

	/* (non-Javadoc)
	 * @see core.Map#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return size==0;
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return tree.toString();

	}
	
	//<--------end of part (a)--------->//

	//<--------start of part (b)--------->//

	/**
	 * @param k
	 * @param v
	 * @return TreeEntry Object
	 */
	public TreeEntry<K,V> getEntry(K k, V v){
		TreeEntry<K,V> temp = new TreeEntry<>(k,v);
		TreeEntry<K,V> entry = tree.find(temp);
		return entry;
	}
	
	/* (non-Javadoc)
	 * @see core.Map#get(java.lang.Object)
	 */
	@Override
	public V get(K k) {
		//find entry in tree based on key. Create temp entry to search with
		TreeEntry<K,V> temp = new TreeEntry<>(k,null);
		TreeEntry<K,V> entry = tree.find(temp);
		//extract value from entry
		return entry.value();
	}

	/* (non-Javadoc)
	 * @see core.Map#put(java.lang.Object, java.lang.Object)
	 */
	@Override
	public V put(K k, V v) {
		//create entry
		TreeEntry<K,V> entry = new TreeEntry<>(k,v);
		//insert it into the tree
		TreeEntry<K,V> old = tree.insert(entry);
		//returns the value if the entry already existed, otherwise, null
		if (old == null) {
			//new entry added therefore increase TreeMap size
			size++;
			return null;
		}else {
			return old.value();
		}
	}

	/* (non-Javadoc)
	 * @see core.Map#remove(java.lang.Object)
	 */
	@Override
	public V remove(K k) {
		//create temporary dummy entry with the key to remove
		TreeEntry<K,V> temp = new TreeEntry<>(k,null);
		//remove any entry with that key
		TreeEntry<K,V> entry = tree.remove(temp);
		if (entry == null) {
			return null;
		}else {
			size--;
			return entry.value();
		}
	}

	//<--------end of part (b)--------->//

	//<--------start of part (c)--------->//
	
	/* (non-Javadoc)
	 * @see core.Map#keys()
	 */
	@Override
	public Iterator<K> keys() {
		// Creates and returns anonymous Iterator through TreeEntry keys
				return new Iterator<K>() {
					Iterator<TreeEntry<K, V>> iterator = treeEntries();

					@Override
					public boolean hasNext() {
						// checks if there is a sucessive element and thereby key
						return iterator.hasNext();
					}

					@Override
					public K next() {
						// returns the successive key
						return iterator.next().key();
					}
				};
			}

	/* (non-Javadoc)
	 * @see core.Map#values()
	 */
	@Override
	public Iterator<V> values() {
		// Creates and returns anonymous Iterator through TreeEntry values
		return new Iterator<V>() {
			Iterator<TreeEntry<K, V>> iterator = treeEntries();

			@Override
			public boolean hasNext() {
				// checks if there is a successive element and thereby value
				return iterator.hasNext();
			}

			@Override
			public V next() {
				// returns the successive value
				return iterator.next().value();
			}
		};
	}

	/**
	 * @return
	 * Alternative to entries()
	 */
	public Iterator<TreeEntry<K, V>> treeEntries() {
		// return an iterator through the elements in the tree which are entries
		return tree.iterator();
	}
		
	/* (non-Javadoc)
	 * @see core.Map#entries()
	 * Must be implemented to satisfy interface
	 * cannot return type Iterator<Entry<K, V>>
	 * can only return Iterator<TreeEntry<K, V>>
	 * Casting challenging
	 */
	@Override
	public Iterator<Entry<K, V>> entries() {
		// TODO Return iterator of type entry not TreeEntry
//		return (Iterator<Entry<K, V>>)tree.iterator();
		return null;
	}
	
	public static void main(String[] args) {	
		//<--------start of part (d)--------->//
		TreeMap<Integer,String> t = new TreeMap<>();
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
