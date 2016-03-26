
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VELIA
 */
public class Aplikasi {

    private Proyek[] proyek = new Proyek[10];
    private Programmer[] programmer = new Programmer[10];
    private Tugas[] tugas = new Tugas[10] ;
    private ManagerProyek[] mp = new ManagerProyek[10];
    int n = 0, cpm = 0, cpro = 0,ct = 0,cpy = 0;
    
    
    private String username = "admin";
    private String sandi = "admin";
    private String Nama;
    private String TanggalLahir;
    private String NoHP;
    private String JenisKelamin;
    private String id;
    
    
    public void addMP(ManagerProyek mp){
        if(cpm <11){
            this.mp[cpm] = mp;
            cpm++;
        }
    }
    public ManagerProyek getMP(int index){
        return mp[index];
    }
    public void addProy(Proyek proy){
        if(cpy<11){
            this.proyek[cpy] = proy;
            cpy++;
        }
    }
    public Proyek getProy(int index){
        return proyek[index];
    }
    public void addProgrammer(Programmer pro){
        if(cpro<11){
            this.programmer[cpro] = pro;
            cpro++;
        }
    }
    public Programmer getPro(int index){
        return programmer[index];
    }
    public void addTugas(Tugas tugas){
        if(ct<11){
            this.tugas[ct] = tugas;
            ct++;
        }
    }
    public Tugas getTugas(int index){
        return tugas[index];
    }
    
    public void login(){
        Scanner input = new Scanner(System.in);
        System.out.print("ID    : ");
        String username = input.nextLine();
        System.out.print("Sandi : ");
        String sandi = input.nextLine();
        if(username.equals(this.username) && sandi.equals(this.sandi)){
           // menu();
        }else
            login();   
    }
    public void menuSatu(){
        Scanner input = new Scanner (System.in);
        System.out.println("Tambah Manager Proyek");
        System.out.println("=====================");
        System.out.print("Nama   : " ); Nama = input.nextLine();
        System.out.print("ID     : "); id = input.nextLine();
        System.out.println("Tanggal Lahir   : ");TanggalLahir = input.nextLine();
        System.out.println("No HP :");NoHP = input.nextLine();
        System.out.println("Jenis Kelamin : ");JenisKelamin = input.nextLine();
        System.out.println("");
        System.out.println("");
        ManagerProyek mp1 = new ManagerProyek(id,Nama, TanggalLahir, NoHP, JenisKelamin);
        addMP(mp1);
    }
   
    public void menuDua(){
        Scanner input = new Scanner (System.in);
        System.out.println("Buat Proyek ");
        System.out.println("============");
        System.out.println("ID Proyek : "); id = input.nextLine();
        System.out.println("Judul Proyek :"); Nama = input.nextLine();
        System.out.println("Deadline : ");String deadline = input.nextLine();
        Proyek proy = new Proyek(getMP(0), id, Nama, deadline);
        addProy(proy);
        
    }
    public void menuTiga(){
        Scanner input = new Scanner (System.in);
        System.out.println("Tambah Programmer");
        System.out.println("=================");
        System.out.println("ID Programmer : ");id = input.nextLine();
        System.out.println("Nama Programmer :");Nama = input.nextLine();
        System.out.println("Tanggal Lahir   : ");TanggalLahir = input.nextLine();
        System.out.println("No HP :");NoHP = input.nextLine();
        System.out.println("Jenis Kelamin : ");JenisKelamin = input.nextLine();
        System.out.println("");
        
        Programmer pro = new Programmer(id, Nama, TanggalLahir, NoHP, JenisKelamin);
        addProgrammer(pro);  
    }
    public void menuEmpat(){
        Scanner input = new Scanner (System.in);
        System.out.println("Tambah Tugas");
        System.out.println("============");
        System.out.println("Index Programmer :");int id = input.nextInt();
        System.out.println("Judul Tugas :");String judul = input.nextLine();
        System.out.println("Deskripsi : ");String deskripsi = input.nextLine();
        System.out.println("Status : ");boolean status = input.nextBoolean();
        Tugas tugas = new Tugas(getPro(id), judul, deskripsi, status);
        addTugas(tugas);
    }
    public void menuLima(){
        System.out.println("List Manager Proyek");
        System.err.println("===================");
        System.out.println("Index | ID Manager | Nama");
        for (int i = 0; i < mp.length; i++) {
            System.out.println(i+" | "+mp[i].getId()+" | "+mp[i].getNama());
            
        }
    }
    public void menuEnam(){
        System.out.println("List Proyek");
        System.err.println("===================");
        System.out.println("Index | Manager Proyek | ID Proyek | Judul");
        for (int i = 0; i < proyek.length; i++) {
            System.out.println(i+" . "+proyek[i].getMP().getNama()+" | "+proyek[i].getID()+" | "+proyek[i].getJudul());
            
        }
    }
    public void menuTujuh(){
        System.out.println("List Programmer");
        System.out.println("===============");
       System.out.println("Index | ID Programmer | Nama");
        for (int i = 0; i < programmer.length; i++) {
            System.out.println(i+" | "+programmer[i].getId()+" | "+programmer[i].getNama()); 
        }    
    }
    public void menuDelapan(){
        System.out.println("List Tugas");
        System.out.println("==========");
        System.out.println("Index | Programmer | judul | Deskripsi | status");
        for (int i = 0; i < tugas.length; i++) {
            System.out.println(i+" | "+tugas[i].getPro().getNama()+" | "+tugas[i].getJudultugas()+" | "+tugas[i].getDeskripsi()+" | "+tugas[i].getStatus());
            
        }
    }
    public void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("      Menu Aplikasi    ");
        System.out.println("=======================");
        System.out.println("1. Tambah Manager Proyek");
        System.out.println("2. Tambah Proyek");
        System.out.println("3. Tambah Programmer");
        System.out.println("4. Tambah Tugas");
        System.out.println("5. List Manager Proyek");
        System.out.println("6. List Proyek");
        System.out.println("7. List Programmer");
        System.out.println("8. List Tugas");
        
        System.out.println("Masukkan nomor menu : ");n = input.nextInt();
        if (n == 1){
            menuSatu();
        }
        else if (n==2){
            menuDua();
        }
        else if (n==3){
            menuTiga();
        }
        else if (n==4){
            menuEmpat();
        }
        else if (n==5){
            menuLima();
        }
        else if (n==6){
            menuEnam();
        }
        else if (n==7){
            menuTujuh();
        }
        else if (n==8){
            menuDelapan();
        }
        System.out.println("");
    }

    
    
    
    public static void main(String[] args) {
      Aplikasi app = new Aplikasi();
      app.login();
      app.menu();
      
    }
}
