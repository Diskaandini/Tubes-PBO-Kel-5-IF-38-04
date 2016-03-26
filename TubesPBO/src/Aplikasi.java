
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

    private ManagerProyek[] daftarManajerProyek = new ManagerProyek[5];
    private Programmer[] daftarProgrammer = new Programmer[20];
    private Proyek[] daftarProyek = new Proyek[10];
    private int nManagerProyek = 0;
    private int nProgrammer=0;
    private int nProyek=0;
    private int n;
    private String namaProgrammer;
    private String idProgrammer;
    private String namaManagerProyek;
    private String idMP;
    private String id = "admin";
    private String sandi = "admin";

//    private Tugas[] tugas;
//    private Proyek[] proyek;
    public void addManajerProyek(String nama, String ttl, double no, String jk) {
        if (nManagerProyek < daftarManajerProyek.length) {
            daftarManajerProyek[nManagerProyek] = new ManagerProyek(nama, ttl, no, jk);
            nManagerProyek++;
        }
    }
    
    public void addProgrammer(String nama, String ttl, double no, String jk) {
        if (nProgrammer < daftarProgrammer.length) {
            daftarProgrammer[nProgrammer] = new Programmer(nama, ttl, no, jk);
            nProgrammer++;
        }
    }
    
   // public void addProyek(String nama, String tugas) {
   //     if (nProyek < daftarProyek.length) {
   //         daftarProyek[nProyek] = new Proyek(nama, tugas);
   //         nProyek++;
   //     }
   // }
    
    public Programmer getProgrammer(int n){
        if (n<nProgrammer){
        return daftarProgrammer[n] ;
        }
        else return null;
    }    
    
    public void deleteManajerProject(int nManajerProyek){
        for (int i = nManagerProyek+1; i < this.nManagerProyek; i++) {
            this.daftarManajerProyek[i-1] = daftarManajerProyek[i];
        }
        this.nManagerProyek--;
    }
    public void deleteProgrammer(int nProgrammer){
        for (int i = nProgrammer+1; i < this.nProgrammer; i++) {
            this.daftarProgrammer[i-1] = daftarProgrammer[i];
        }
        this.nProgrammer--;
    }
    
    public void login(){
        Scanner input = new Scanner(System.in);
        System.out.print("ID    : ");String id = input.nextLine();
        System.out.print("Sandi : ");String sandi = input.nextLine();
        if(id.equals(this.id) && sandi.equals(this.sandi)){
            menu();
        }else
            login();
       
    }
    
    public void menuSatu(){
        Scanner input = new Scanner (System.in);
        System.out.println("Tambah Manager Proyek");
        System.out.println("=====================");
        System.out.print("Nama   : " ); namaManagerProyek = input.nextLine();
        System.out.print("ID     : "); idMP = input.nextLine();
        System.out.println("");
    }
    
    public void menuDua(){
        Scanner input = new Scanner (System.in);
        System.out.println("Tambah Programmer");
        System.out.println("================== ");
        System.out.print("Nama   : "); namaProgrammer = input.nextLine();
        System.out.print("ID     : "); idProgrammer = input.nextLine();
        System.out.println("");
    }
    
    public void menuTiga(){
        Scanner input = new Scanner (System.in);
        System.out.println("Hapus Manager Proyek");
        System.out.println("====================");
        System.out.println("Masukkan index yang akan dihapus : ");int idxHapus= input.nextInt();
        deleteManajerProject(idxHapus);
    }
    
    public void menuEmpat(){
        Scanner input = new Scanner (System.in);
        System.out.println("Hapus Programmer");
        System.out.println("");
        System.out.println("Masukkan index yang akan dihapus : ");int idxHapus= input.nextInt();
        deleteProgrammer(idxHapus);
    }
    
    public void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("      Menu Aplikasi    ");
        System.out.println("=======================");
        System.out.println("1. Tambah Manager Proyek");
        System.out.println("2. Tambah Programmer");
        System.out.println("3. Hapus Manager Proyek");
        System.out.println("4. Hapus Programmer");
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
        System.out.println("");
    }

    
    public static void main(String[] args) {
      Aplikasi app = new Aplikasi();
      app.menu();
    }
}
