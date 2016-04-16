/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Applikasi;
import View.jDaftarTugas;
import View.jInsertTugas;
import View.jUpdateTugas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USER
 */
public class ControllerTugas implements ActionListener {
    jDaftarTugas tugas;
    database db;
    jInsertTugas insert_tugas;
    jUpdateTugas update_tugas;
    Applikasi a;
   

    public ControllerTugas(Applikasi a) {
        tugas = new jDaftarTugas();
        tugas.setVisible(true);
        tugas.getBtnInsertTugas().addActionListener(this);
        tugas.getBtnDeleteTugas().addActionListener(this);
        tugas.getBtnDeleteTugas().addActionListener(this);
        this.a =a;
    
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o.equals(tugas.getBtnInsertTugas())){
            new jInsertTugas();
        }
        else if(o.equals(tugas.getBtnUpdateTugas())){
        new jUpdateTugas();
        }
        else if(o.equals(tugas.getBtnDeleteTugas())){
           
        }
    }
    
    
}
