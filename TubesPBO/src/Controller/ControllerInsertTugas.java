/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Applikasi;
import View.jInsertTugas;


/**
 *
 * @author VELIA
 */
public class ControllerInsertTugas {
    jInsertTugas insert_tugas;
    Applikasi a;
    
    public ControllerInsertTugas() {
    insert_tugas = new jInsertTugas();
    insert_tugas.setVisible(true);
    this.a =a;
}
    
}
