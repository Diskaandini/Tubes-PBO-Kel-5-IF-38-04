/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Applikasi;
import Model.Applikasi;
import View.*;
//import View.jDeleteMP;
//import View.jInsertMP;
//import View.jUpdateMP;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author VELIA
 */
class ControllerMProyek implements ActionListener {

    MenuManagerProyek mproy;
    jInsertMP insert;
    jUpdateMP update;
    jDeleteMP del;
    Applikasi a;

    public ControllerMProyek(Applikasi a) {
        mproy = new MenuManagerProyek();
        mproy.setVisible(true);
        mproy.getBtnInsertTugas().addActionListener(this);
        this.a =a;
    }

    

    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o.equals(mproy.getBtnInsertTugas())) {
            JOptionPane.showMessageDialog(null, "Masuuukkkk");
            new ControllerInsertMP(a);
            mproy.dispose();
        } else if (o.equals(mproy.getBtnUpdateTugas())) {
            new ControllerUpdMP(a);
            mproy.dispose();
        } else if (o.equals(mproy.getBtnDeleteTugas())) {
            new ControllerDelMP(a);
            mproy.dispose();
        } else {
            System.out.println("salaaahhh");
        }
    }

}
