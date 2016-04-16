/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Applikasi;
import View.MenuManagerProyek;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USER
 */
public class ControllerJMenu implements ActionListener {

    jMenu menu;
    jLogin login;
    MenuManagerProyek mp;
    Applikasi a;
    
    
    ControllerJMenu cm;
   
//    private Object jMP;
//    private Object jProyek;
//    private Object jTugas;
//    private Object jProgrammer;

    public ControllerJMenu(Applikasi a) {
        menu = new jMenu();
        
        login = new jLogin();
        menu.setVisible(true);
        menu.getjMP().addActionListener(this);
        menu.getjProyek().addActionListener(this);
        menu.getjTugas().addActionListener(this);
        menu.getjProgrammer().addActionListener(this);
        this.a = a;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object x =  e.getSource() ;
        if (x.equals(menu.getjMP())){
            new ControllerMProyek(a);
            menu.dispose();
        } 
        else if (x.equals(menu.getjProyek())){
            new ControllerProyek(a);
        }       
        else if(x.equals(menu.getjTugas())){
            new ControllerTugas(a);
        }
        else if(x.equals(menu.getjProgrammer())){
            new ControllerProgrammer(a);
        }
   
    }

    

    

}
