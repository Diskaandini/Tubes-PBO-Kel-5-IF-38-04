package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Proyek {

    private Programmer[] programmer = new Programmer[10];
//    private ManagerProyek Manager;
    private String id, judul;
    private Tugas[] tugas = new Tugas[10];

    private int i = 0;

    public Proyek() {
//         setMP(m);
        setId(id);
        setJudul(judul);
       
    }
    public Proyek(String id, String judul){
        setId(id);
        setJudul(judul);
    }
//     public void setMP(ManagerProyek m){
//         this.Manager = m;
//     }

   

    public void setId(String id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

 
//     public ManagerProyek getMP(){
//         return Manager;
//     }

    public String getID() {
        return this.id;
    }

    public String getJudul() {
        return this.judul;
    }



    public void addProgrammer(String id, String Nama, String TanggalLahir, String NoHP, String JenisKelamin) {
        if (i < 10) {
            programmer[i] = new Programmer(id, Nama, TanggalLahir, NoHP, JenisKelamin);
            i++;
        }
    }

    public Programmer getProgrammer(int index) {
        return programmer[index];
    }

    public void createTugas(String judul, String deskripsi, boolean status) {
        if (i < 10) {
            tugas[i] = new Tugas(judul, deskripsi, status);
            i++;
        }
    }

    public void removeTugas(int index) {
        tugas[index] = null;
        for (int a = 0; a < 5; a++) {
            if (tugas[a] == null) {
                while (a < (5 - a)) {
                    tugas[a] = tugas[a + 1];
                    a++;
                }
            }
        }
    }

    public Tugas getTugas(int index) {
        return tugas[index];
    }

    public int getNTugas() {
        return i;
    }
    
    

}
