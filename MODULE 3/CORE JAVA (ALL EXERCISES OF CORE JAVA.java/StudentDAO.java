import java.sql.*;

public class StudentDAO {
    public void insertStudent(int id, String name) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:students.db");
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.executeUpdate();
        conn.close();
    }

    public void updateStudent(int id, String newName) throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:sqlite:students.db");
        String sql = "UPDATE students SET name = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, newName);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        conn.close();
    }
}
