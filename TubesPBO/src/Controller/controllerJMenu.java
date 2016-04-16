/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MenuManagerProyek;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USER
 */
public class controllerJMenu implements ActionListener {

    jMenu menu;
    jLogin login;
    MenuManagerProyek mp;
    
    
    
    controllerJMenu cm;
   
//    private Object jMP;
//    private Object jProyek;
//    private Object jTugas;
//    private Object jProgrammer;

    public controllerJMenu() {
        menu = new jMenu();
        mp= new MenuManagerProyek();
        login = new jLogin();
        menu.setVisible(true);
        menu.getjMP().addActionListener(this);
        menu.getjProyek().addActionListener(this);
        menu.getjTugas().addActionListener(this);
        menu.getjProgrammer().addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x =  e.getSource() ;
        if (x.equals(menu.getjMP())){
            System.out.println("a");
            //new ControllerMProyek();
            mp.setVisible(true);
            menu.dispose();
        } 
        else if (x.equals(menu.getjProyek())){
            new ControllerProyek();
        }       
        else if(x.equals(menu.getjTugas())){
            new ControllerTugas();
        }
        else if(x.equals(menu.getjProgrammer())){
            new ControllerProgrammer();
        }
   
    }

    private Object getjMP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
