/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Applikasi;
import View.jUpdateTugas;

/**
 *
 * @author VELIA
 */
class controllerUpdTugas {
    jUpdateTugas update_tugas;
    Applikasi a;

    public controllerUpdTugas(Applikasi a) {
        update_tugas = new jUpdateTugas();
        update_tugas.setVisible(true);
        this.a =a;
    }
    
}
