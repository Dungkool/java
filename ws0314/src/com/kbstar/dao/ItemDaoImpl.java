package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class ItemDaoImpl implements DAO<String, String, Item> {

	public ItemDaoImpl() { // 디폴트에서 Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return; // 오류나면 실행 종료
		}
		System.out.println("Driver Loading 성공");
	}

	@Override
	public void insert(Item v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemInsertSql)) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getPrice());
			pstmt.setDouble(4, v.getRate());
			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
			// e.printStackTrace();
		}
	}

	@Override
	public void delete(String k1) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemDeleteSql);) {
			pstmt.setString(1, k1); // id를 셋
			int result = pstmt.executeUpdate(); // 실행하고 반환 값을 result에 받는다.
			if (result == 0) {
				throw new Exception("해당 ID 없음");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public void update(Item v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemUpdateSql);) {
			pstmt.setString(1, v.getName());
			pstmt.setInt(2, v.getPrice());
			pstmt.setDouble(3, v.getRate());
			pstmt.setString(4, v.getId());
			int result = pstmt.executeUpdate();
			if (result == 0) {
				throw new Exception("ID 없음");
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	public Item select(String k) throws Exception {
		Item obj = null;
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemSelectSql)) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next(); // 한 칸 이동시켜야 select 가능
				String id = rset.getString("id");
				String name = rset.getString("name");
				int price = rset.getInt("price");
				Double rate = rset.getDouble("rate");
				Date regdate = rset.getDate("regdate");
				obj = new Item(id, name, price, rate, regdate); // 객체 생성
			} catch (SQLException e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return obj;
	}

	@Override
	public List<Item> selectAll() throws Exception {
		// 셀렉트all담을 바구니 만들기.
		List<Item> list = new ArrayList<>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.itemSelectAllSql);) {

			try (ResultSet rset = pstmt.executeQuery();) {
				// list바구니에 담은 것을 빼내기 위해 while문
				while (rset.next()) { // 데이터(rset) 다음칸으로 넘긴 뒤 실행문
					Item item = null; // DTO 초기화 하고
					String id = rset.getString("id"); // 끄집어낼 값 : "id"는 컬럼명.
					String name = rset.getString("name"); // 끄집어낼 값 : "name"는 컬럼명.
					int price = rset.getInt("price"); // 끄집어낼 값 : "price"는 컬럼명.
					double rate = rset.getDouble("rate"); // 끄집어낼 값 : "rate"는 컬럼명.
					Date regdate = rset.getDate("regdate"); // 끄집어낼 값 : "redate"는 컬럼명.
					item = new Item(id, name, price, rate, regdate); // item 객체 생성은 마지막이다.
					list.add(item); // 한바퀴 돌아서나온 값은 list에 넣자.
				}
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e; // 예외발생 시 서비스로 던진다.
		}
		return list;
	}

	@Override
	public List<Item> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}