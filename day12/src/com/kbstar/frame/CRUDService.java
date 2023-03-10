package com.kbstar.frame;

import java.util.List;

public interface CRUDService<K, V> {
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v)   throws Exception;
	public V get(K k) throws Exception; // Key 값을 넣으면 모든 정보(V)가 return
	public List<V> get() throws Exception;	   // 모든 사용자 모든 정보(V)를 List에 담아서 return;
}
