
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class database {
    private Connection conn;
    
    public void connect(){
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/tubes", "root", "");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int doQuery(String query){
        try {
            PreparedStatement p = conn.prepareStatement(query);
            return p.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
    
    public ResultSet getData(String query){
        try {
            PreparedStatement p = conn.prepareStatement(query);
            return p.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
