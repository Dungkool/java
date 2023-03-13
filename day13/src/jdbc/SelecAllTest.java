package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelecAllTest {

	public static void main(String[] args) {
		// Driver Loading
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 없습니다.");
			e.printStackTrace();
			return; // 오류나면 실행 종료
		}
		System.out.println("Driver Loading 성공");

		// Connect
		String id = "bank";
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.20.53:1521:XE";
		String selectAllSql = "SELECT * FROM cust";
		// Statement 생성 - SQL
		// SQL 전송
		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(selectAllSql);) {
			try (ResultSet rset = pstmt.executeQuery()) {

				while (rset.next()) {
					String db_id = rset.getString("id");
					String db_pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					System.out.println(db_id + "" + name + "" + age);
				}
				// 한 칸 이동시켜야 select 가능
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
