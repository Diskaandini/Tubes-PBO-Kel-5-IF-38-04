/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Applikasi;
import View.jInsertProgrammer;
import View.jInsertProyek;

/**
 *
 * @author VELIA
 */
public class ControllerInsertProgrammer {
    jInsertProgrammer insert_prog;
    Applikasi a;
    
    public ControllerInsertProgrammer(Applikasi a) {
    insert_prog = new jInsertProgrammer();
    insert_prog.setVisible(true);
    this.a =a;
}
    
}
