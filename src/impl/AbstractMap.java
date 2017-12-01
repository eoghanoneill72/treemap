/**
 * 
 */
package impl;

import java.util.Iterator;

import core.Entry;
import core.Map;

/**
 * @author 12312821
 * @param <K>
 *
 */
public class AbstractMap<K,V> implements Map<K,V> {

	protected static class MapEntry<K, V> implements Entry<K,V>{
		
		private K k;
		private V v;
		public MapEntry(K key, V value) {
			k = key;
			v = value;
		}
	
		
		@Override
		public K key() {
			// TODO Auto-generated method stub
			return k;
		}

		@Override
		public V value() {
			// TODO Auto-generated method stub
			return v;
		}


		public K getK() {
			return k;
		}


		public void setK(K k) {
			this.k = k;
		}


		public V getV() {
			return v;
		}


		public void setV(V v) {
			this.v = v;
		}
		
		
		
	}
	
	public AbstractMap() {
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
