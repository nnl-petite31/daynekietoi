package DAO;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
public class connDB {
    public static void Connect() {
        Connection conn = null;
        try {
            String url = "jdbc:sqliteC:\\Sqlite/Detai.db";
            conn = DriverManager.getConnection(url);
            
            System.out.println("Kết nối thành công");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        Connect();
    }
}
