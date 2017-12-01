/**
 * 
 */
package core;

import java.util.Comparator;

/**
 * @author 12312821
 *
 */
public class DefaultComparator<E extends Comparable<E>> implements Comparator<E>{

	/**
	 * 
	 */
	public DefaultComparator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(E a, E b) throws ClassCastException {
		// TODO Auto-generated method stub
//		return ((Comparable<E>)a).compareTo(b);
		return a.compareTo(b);

	}

}
