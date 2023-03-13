package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateTest {

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
		String updateSql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";
		// Statement 생성 - SQL
		// SQL 전송
		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(updateSql);) {
			pstmt.setString(1, "pwd22");
			pstmt.setString(2, "조현손");
			pstmt.setInt(3, 29);
			pstmt.setString(4, "id03");
			int result = pstmt.executeUpdate(); // 빈칸으로 업데이트 -> 위에꺼 삭제됨
			System.out.println(result);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
