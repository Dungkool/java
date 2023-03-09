package com.kbstar.frame;

import java.util.List;

public interface DAO<K, V> {
	public void insert(V v) throws Exception;
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	public V select(K k) throws Exception; // Key 값을 넣으면 모든 정보(V)가 return
	public List<V> select() throws Exception;	   // 모든 사용자 모든 정보(V)를 List에 담아서 return;
}
