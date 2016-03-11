/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lalu Oldi Alfitra
 */
public class ManagerProyek extends Orang {
    private Proyek[] proyek = new Proyek[5];
    private Programmer program ;
    private String idMP;
    private String deadline;
    
    public ManagerProyek(String Nama, String TanggalLahir, double NoHP, String JenisKelamin) {
        super(Nama, TanggalLahir, NoHP, JenisKelamin);
    }
    
    public void createProyek(String deadline, Programmer program, Tugas tugas,String judulProyek) {
        int i = 0;
        this.proyek[i] = new Proyek(program, tugas, judulProyek);
        i++;
    }
    
    public void setIdMP(String idMP) {
        this.idMP = idMP;
    }
    
    public String getIdMP() {
        return idMP;
    }
    
    public Proyek getProyek(int index) {
        return proyek[index];
    }
    
    public void deleteProyek(Proyek P, int i) {
        /*if((i>P.length) && (i<0)) {
            P[i] = null;
            System.out.println("Proyek ke-"+(i+1)+" telah dihapus");
        } else {
            System.out.println("Proyek tidak dapat dihapus");
        }*/
        this.proyek[i] = null;
    };
    public void Display() {
        System.out.println("ID Manager Proyek: "+getIdMP());
        System.out.println("Nama: " + super.getNama());
        System.out.println("Tanggal Lahir: " + super.getTanggalLahir());
        System.out.println("No HP: " + super.getNoHP());
        System.out.println("Jenis Kelamin: " + super.getJenisKelamin());
        int i = 0;
        System.out.println("Proyek: " + getProyek(i));
        i++;
    }
}
