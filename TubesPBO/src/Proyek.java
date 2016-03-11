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
    private Programmer[] programmer = new Programmer[2];
    private Tugas[] tugas = new Tugas[5];
    private String judulProyek;
    
    public Proyek(Programmer program, Tugas tugas,String judulProyek){
        int i=0;
        this.programmer[i] = program;
        this.tugas[i] = tugas;
        i++;
        this.judulProyek = judulProyek;
    };
    public void addProgrammer(int index, String nama,String TanggalLahir, double NoHP, String JenisKelamin){
        int i=0;
        this.programmer[i] = new Programmer(nama, TanggalLahir, NoHP, JenisKelamin);
        i++;
    };
    public Programmer getProgrammer(int index){
       return this.programmer[index];
    };
    
    public void createTugas(Tugas t, Programmer pelaksana, String JudulTugas, boolean Status){
        int i = 0;
        this.tugas[i] = new Tugas(pelaksana, judulProyek, true);
        i++;
    };
    public void removeProgrammer(int index){
        this.programmer[index]= null;
    };
    public Tugas getTugas(int index){
        return this.tugas[index];
    };
    public void deleteTugas(int index){
        this.tugas[index] = null;
     
    };
}    
