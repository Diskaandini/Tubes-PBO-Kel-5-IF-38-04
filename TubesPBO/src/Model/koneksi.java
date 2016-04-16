package Model;

import java.sql.*;

public class koneksi {
    
    public koneksi() { // merupakan construktor (ingat, nama construktor harus sama dengan nama Class 
        
    }
    
    public Connection getConnection() throws SQLException {
        Connection cn;
        try {
            String server = "jdbc:mysql://localhost/db_osd";
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            cn = DriverManager.getConnection ("jdbc:mysql://127.0.0.1:3306/tubes","root","");
            return cn;
        } catch (SQLException se) {
            System.out.println(se.toString());
            return null;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
    
}
