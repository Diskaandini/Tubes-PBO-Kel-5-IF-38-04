/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Applikasi;
import View.jUpdateProyek;

/**
 *
 * @author VELIA
 */
class controllerUpdProy {
    jUpdateProyek update_proy;
    Applikasi a;

    public controllerUpdProy(Applikasi a) {
        update_proy = new jUpdateProyek();
        update_proy.setVisible(true);
        this.a =a;
    }
    
}
