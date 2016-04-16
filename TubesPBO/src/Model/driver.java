package Model;


import Controller.ControllerLogin;
import Controller.database;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class driver {
    public static void main(String[] args) throws SQLException {
//        database db = new database();
//        db.connect();
//        
//        String s = "select * from akun";
//        ResultSet rs =  db.getData(s);
//        System.out.println(rs);
//        while(rs.next()){
//            System.out.println(rs.getString(1));
//        }
//        System.out.println(rs.getString("username"));
            Applikasi a = new Applikasi();
            ControllerLogin c = new ControllerLogin(a);
    }
}
