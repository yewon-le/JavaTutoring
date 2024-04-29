package week02;

import java.sql.*;

public class Jdbc1 {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 드라이버 클래스 불러오기

            String dbUrl = "jdbc:mysql://localhost:3306/studentdb"; // DB 연결 Url/스키마 이름
            String dbUser = "root"; // DB 사용자
            String dbPw = "Leeyewon0315!"; // DB 사용자 비밀번호

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","Leeyewon0315!"); // DB 연결
            System.out.println("DB 연결 성공!");

            conn.close(); // DB 연결 종료

        } catch (ClassNotFoundException e) {
            System.out.println("Jdbc 드라이버 로딩 실패");

        } catch (SQLException e) {
            System.out.println("DB 연결 오류");

        }
    }
}
