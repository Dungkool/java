package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CustDaoImpl implements DAO<String, String, Cust> {

	public CustDaoImpl() { // 디폴트에서 Driver Loading
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
	public void insert(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			int result = pstmt.executeUpdate(); // 빈칸으로 업데이트 -> 위에꺼 삭제됨
		} catch (SQLException e1) {
			throw e1;
			// e1.printStackTrace();
		}
	}

	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);) {
			pstmt.setString(1, k);
			int result = pstmt.executeUpdate(); // 빈칸으로 업데이트 -> 위에꺼 삭제됨
			if (result == 0) {
				throw new Exception("ID 없음");
			}
		} catch (SQLException e1) {
			throw e1;
		}

	}

	@Override
	public void update(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);) {
			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId());

			int result = pstmt.executeUpdate(); // 빈칸으로 업데이트 -> 위에꺼 삭제됨
			if (result == 0) {
				throw new Exception("없음");
			}
		} catch (SQLException e1) {
			throw e1;
		}

	}

	@Override
	public Cust select(String k) throws Exception {
		Cust cust = null; // Cust tpye이므로 Cust 선언 및 return
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);) {
			pstmt.setString(1, k);
			try (ResultSet rset = pstmt.executeQuery()) {
				rset.next(); // 한 칸 이동시켜야 select 가능
				String id = rset.getString("id");
				String pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				cust = new Cust(id, pwd, name, age); // 객체 생성
			} catch (SQLException e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}
		return cust;
	}

	@Override
	public List<Cust> selectAll() throws Exception {
		List<Cust> list = new ArrayList<>();
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql);) {
			try (ResultSet rset = pstmt.executeQuery();) {
				while (rset.next()) { // 데이터가 없을 때까지
					Cust cust = null;
					String id = rset.getString("id");
					String pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					cust = new Cust(id, pwd, name, age);
					list.add(cust);
				}
			} catch (Exception e) {

			}
		} catch (Exception e) {
			throw e;
		}
		return list;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
