package com.kbstar.frame;

public interface DAO<K,V> {		// generic : 들어올 값으 type을 예상
	public void insert(V v);
	public void delete(K k);
	public void update(V v);
}
