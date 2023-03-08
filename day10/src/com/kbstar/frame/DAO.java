package com.kbstar.frame;

public interface DAO<K,V> {		// generic : 들어올 값을 type을 예상
	String IP = "127.0.0.1";	// 변수 아닌 상수, 변경 불가 / public static final 자동 생략
	public void insert(V v) throws Exception;	// public abstract 생략
	public void delete(K k) throws Exception;
	public void update(V v) throws Exception;
	
	default void connect() {
		System.out.println(IP + "에 접속하였습니다.");
	}
	default void close() {
		System.out.println(IP + "에 접속을 해제하였습니다.");
	}
}