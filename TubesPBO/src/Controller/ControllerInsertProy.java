/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.Applikasi;
import Model.ManagerProyek;
import Model.Proyek;
import View.jInsertProyek;


/**
 *
 * @author VELIA
 */

class ControllerInsertProy {
    jInsertProyek insert_proy;
    Applikasi a;
    

    public ControllerInsertProy(Applikasi a) {
        String id = insert_proy.getTxtIdProyek().getText();
        String judul = insert_proy.getTxtJudulProyek().getText();
        Proyek proyek = new Proyek();
        insert_proy = new jInsertProyek();
        insert_proy.setVisible(true);
        //.createProyek(id, judul);
        this.a =a;
        
    }
    
}
