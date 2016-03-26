/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lalu Oldi Alfitra
 */
public class ManagerProyek extends Orang{
     private String IdManager;
     
     private Proyek[] proyek = new Proyek[10];
     private int i = 0;
    
     
    public ManagerProyek(String id,String Nama, String TanggalLahir, String NoHP, String JenisKelamin) {
        super(id,Nama, TanggalLahir, NoHP, JenisKelamin);
    }
     public void createProyek(ManagerProyek manager,String id,String judul,String deadline){
          if(i<10){
            proyek[i]=new Proyek(manager,id, judul, deadline);
            i++;
	}
     }
     public Proyek getProyek(int index){
         return proyek[index];
     }
     public void setIdMP(String idMP) {
        this.IdManager = idMP;
    }
    
    public String getIdMP() {
        return IdManager;
    }
    public void RemoveProyek(int index){
        proyek[index] = null;
        for (int a=0;a<5;a++) {
            if (proyek[a] == null) {
                while(a<(5-a)){
                    proyek[a] = proyek[a+1];
                    a++;
                }                
            }
        }
    }
}
