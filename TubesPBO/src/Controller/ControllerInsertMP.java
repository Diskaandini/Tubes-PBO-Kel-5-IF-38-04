/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Applikasi;
import View.jInsertMP;

/**
 *
 * @author VELIA
 */
class ControllerInsertMP {

    private jInsertMP view;
    Applikasi a;
    
    public ControllerInsertMP(Applikasi a) {
        view = new jInsertMP();
        view.setVisible(true);
        this.a =a;
    }
    
}
