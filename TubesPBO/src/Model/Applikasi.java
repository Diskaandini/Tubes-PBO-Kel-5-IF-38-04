package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VELIA
 */
public class Applikasi {
    private ManagerProyek[] daftarManagerProyek;
    private int nDaftarManagerProyek;
    private Programmer[] daftarProgrammer;
    private int nDaftarProgrammer;

    public Applikasi() {
        this.daftarManagerProyek = new ManagerProyek[10];
        this.daftarProgrammer = new Programmer[10];
        this.nDaftarManagerProyek=0;
        this.nDaftarProgrammer=0;
    }

    public ManagerProyek[] getDaftarManagerProyek() {
        return daftarManagerProyek;
    }

    public Programmer[] getDaftarProgrammer() {
        return daftarProgrammer;
    }
    
    
    
    public void addManagerProyek(ManagerProyek mp){
        if(this.nDaftarManagerProyek < 10){
            this.daftarManagerProyek[this.nDaftarManagerProyek++] = mp;
        }
        
    }
    
    public void addProgrammer(Programmer p){
        if(this.nDaftarProgrammer < 10){
            this.daftarProgrammer[this.nDaftarProgrammer++] = p;
        }
    }
    
    public Programmer getProgrammer(String id){//get by id programmer
        for (int i = 0; i < this.nDaftarProgrammer; i++) {
            if(this.daftarProgrammer[i].getId().equalsIgnoreCase(id)){
                return this.daftarProgrammer[i];
            }
        }
        return null;
    }
    
    public void deleteProgrammer(String id){
        int index = -1;
        for (int i = 0; i < this.nDaftarProgrammer; i++) {
            if(this.daftarProgrammer[i].getId().equalsIgnoreCase(id)){
                index = i;
                break;
            }
        }
        
        for (int i = index+1; i < this.nDaftarProgrammer; i++) {
            daftarProgrammer[i-1] = daftarProgrammer[i];
        }
        this.nDaftarProgrammer--;
    }
    
}
