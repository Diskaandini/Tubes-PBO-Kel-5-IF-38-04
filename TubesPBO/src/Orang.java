/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VELIA
 */
public abstract class Orang {
    private String Nama;
    private String TanggalLahir;
    private double NoHP;
    private String JenisKelamin;
	
    public Orang (String Nama, String TanggalLahir, double NoHP, String JenisKelamin){
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.NoHP = NoHP;
        this.JenisKelamin = JenisKelamin;
    }
    
    public Orang(String Nama){
        this.Nama= Nama;
    }
    
    public void setNama (String nama){
        this.Nama = Nama;
    }
    public void setTanggalLahir(String TanggalLahir){
        this.TanggalLahir = TanggalLahir;
    }
    public void setNoHP (double NoHP){
        this.NoHP = NoHP;
    }
    public void setJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }
    public String getNama(){
        return Nama;
    }
    public String getTanggalLahir(){
        return TanggalLahir;
    }
    public double getNoHP(){
        return NoHP;
    }
    public String getJenisKelamin(){
        return JenisKelamin;
    }
    public void Display(){
      }
}