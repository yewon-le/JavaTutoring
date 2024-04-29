package week02;
import java.sql.*;
public final class Jdbc2 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String dbUrl = "jdbc:mysql://localhost:3306/studentdb";
            String dbUser = "root";
            String dbPw = "Leeyewon0315!";

            Connection conn = DriverManager.getConnection(dbUrl,dbUser,dbPw);
            Statement stmt = conn.createStatement();

            String query = " INSERT INTO student VALUES ( 20231643, '이예원', 2, '컴소' ) "; // 실행할 쿼리 작성, 쌍 따옴표 오류 -> 작은 따옴표 써야함.
            int result = stmt.executeUpdate(query); // 쿼리 실행 후 반영 된 행 개수 리턴 받음

            System.out.println("데이터 삽입 성공! " + result);

            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Jdbc 드라이버 로딩 실패");

        } catch (SQLException e) {
            System.out.println("DB 연결 오류");
        }

    }

}