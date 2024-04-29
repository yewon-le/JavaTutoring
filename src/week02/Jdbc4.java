package week02;
import java.sql.*;

public class Jdbc4 {

    public static void main(String[] args) throws SQLException {
        Connection conn = DBConn.getDBConn();
        Statement stmt = conn.createStatement();
        ResultSet rs;

        // 삽입
        String insertQuery1 = "insert into student values ('20202222','김철수',3,'컴정')";
        int result1 = stmt.executeUpdate(insertQuery1);

        // 조회
        String selectQuery1 = "select * from student";
        rs = stmt.executeQuery(selectQuery1);

        while (rs.next()) {
            System.out.println("ID : "+rs.getInt("id"));
            System.out.println("Name : "+rs.getString("name"));
            System.out.println("ID : "+rs.getInt("grade"));
            System.out.println("ID : "+rs.getString(4));
            System.out.println();

        }
        // 갱신
        String insertQuery2 = "UPDATE student SET grade=1, name='손흥민' WHERE id=20202222";
        int updateRs1 = stmt.executeUpdate(insertQuery2);

        // 조회
        String selectQuery2 = "select * from student";
        rs = stmt.executeQuery(selectQuery2);
        while (rs.next()) {
            System.out.println("ID : "+rs.getInt("id"));
            System.out.println("Name : "+rs.getString("name"));
            System.out.println("ID : "+rs.getInt("grade"));
            System.out.println("ID : "+rs.getString(4));
            System.out.println();

        }

        // 삭제
        String deleteQuery = "DELETE FROM student WHERE id =20202222";
        int delete = stmt.executeUpdate(deleteQuery);
        System.out.println("삭제결과: "+ delete);

        conn.close();
        stmt.close();
    }


}
