/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Applikasi;
import View.jUpdateProgrammer;

/**
 *
 * @author VELIA
 */
public class ControllerUpdProgrammer {
    jUpdateProgrammer update_prog;
    Applikasi a;
    
    public ControllerUpdProgrammer(Applikasi a) {
        update_prog = new jUpdateProgrammer();
        update_prog.setVisible(true);
        this.a =a;
    }
    
}
