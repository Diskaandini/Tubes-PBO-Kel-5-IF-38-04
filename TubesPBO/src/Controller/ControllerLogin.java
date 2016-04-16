/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.jLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ControllerLogin implements ActionListener{
    jLogin login;
    database db;
    
    public ControllerLogin() {
        db = new database();
        db.connect();
        
        login = new jLogin();
        
        login.setVisible(true);
        login.getBtnLogin().addActionListener(this);
        
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o.equals(login.getBtnLogin())){
            
            String usrN = login.getjUsername().getText();
            String pass = login.getjPassword().getText();
            if (usrN.equals("admin") && pass.equals("admin")){
                login.dispose();
                new controllerJMenu();
                JOptionPane.showMessageDialog(null, "Anda berhasil login");
            } else {
                JOptionPane.showMessageDialog(null, "Anda gagal login");
            }
//            try {
//                String usrN = login.getjUsername().getText();
//                String pass = login.getjPassword().getText();
//                String query = "select * from akun where username ='"+usrN+"';";
//                ResultSet rs = db.getData(query);
//                while(rs.next()){
//                    if(pass.equals(rs.getString("password"))){
//                        if(rs.getString("role").equals("programmer")){
//                            controllerJMenu cmenu = new controllerJMenu("programmer");
//                        }
//                    }
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(ControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
//            }
        }
    }
    
    
}
