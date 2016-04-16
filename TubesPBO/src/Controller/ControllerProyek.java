/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Applikasi;
import Model.Applikasi;
import View.jDaftarProyek;
import View.jDelProyek;
import View.jInsertProyek;
import View.jUpdateProyek;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class ControllerProyek implements ActionListener{
    jDaftarProyek proyek;
    jInsertProyek insert;
    jUpdateProyek update;
    jDelProyek del;    
    Applikasi a;

    public ControllerProyek(Applikasi a) {
        proyek = new jDaftarProyek();
        proyek.setVisible(true);
        proyek.getBtnInsertProyek().addActionListener(this);
        proyek.getBtnUpdateProyek().addActionListener(this);
        proyek.getBtnDeleteProyek().addActionListener(this);
        this.a =a;
    
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Object o = e.getSource();
        if (o.equals(proyek.getBtnInsertProyek())) {
            JOptionPane.showMessageDialog(null, "");
            new ControllerInsertProy(a);
            proyek.dispose();
        } else if (o.equals(proyek.getBtnUpdateProyek())) {
            new controllerUpdProy(a);
            proyek.dispose();
        } else if (o.equals(proyek.getBtnDeleteProyek())) {
            new ControllerDelProy(a);
            proyek.dispose();
        } else {
            System.out.println("salaaahhh");
        }
    }
    
    
}
