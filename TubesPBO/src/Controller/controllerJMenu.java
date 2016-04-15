/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.jMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USER
 */
public class controllerJMenu implements ActionListener{
    jMenu menu;
    

    String status="";
    
    public controllerJMenu(String status) {
        menu = new jMenu();
        menu.setVisible(true);
        this.status = status;
        menu.getmnLogout().addActionListener(this);
        menu.getmnProyek().addActionListener(this);
        menu.getmnTugas().addActionListener(this);
        if (status.equals("programmer")) {
            menu.getmnProyek().setEnabled(false);
        }   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = new Object();
        if(obj.equals(menu.getmnProyek())){
            ControllerProyek proy = new ControllerProyek();
        }
        else if(obj.equals(menu.getmnTugas())){
            ControllerTugas tugas = new ControllerTugas();
        }
        
    }
    
    
    
}
