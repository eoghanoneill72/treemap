package book;

import java.util.Iterator;

public abstract interface Tree<E> extends Iterable<E> {
	public abstract Position<E> root();

	public abstract Position<E> parent(Position<E> paramPosition) throws IllegalArgumentException;

	public abstract Iterable<Position<E>> children(Position<E> paramPosition) throws IllegalArgumentException;

	public abstract int numChildren(Position<E> paramPosition) throws IllegalArgumentException;

	public abstract boolean isInternal(Position<E> paramPosition) throws IllegalArgumentException;

	public abstract boolean isExternal(Position<E> paramPosition) throws IllegalArgumentException;

	public abstract boolean isRoot(Position<E> paramPosition) throws IllegalArgumentException;

	public abstract int size();

	public abstract boolean isEmpty();

	public abstract Iterator<E> iterator();

	public abstract Iterable<Position<E>> positions();
}
