/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lalu Oldi Alfitra
 */
public class Tugas {
    private Programmer programmer;
    private ManagerProyek Manager;
    private String judul,deskripsi;
    private boolean status;
    
    public Tugas(Programmer pro, String judul,String deskripsi, boolean status){
        setProgrammer(pro);
        setJudul(judul);
        setDeskripsi(deskripsi);
        setStatus(status);
    }
    public void setProgrammer(Programmer pro){
        this.programmer = pro;
    }
    public void setJudul(String judul){
        this.judul=judul;
    }
    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public Programmer getPro(){
        return programmer;
    }
    public String getJudultugas(){
        return this.judul;
    }
    public String getDeskripsi(){
        return this.deskripsi;
    }
    public boolean getStatus(){
        return this.status;
    }
    
    
}
