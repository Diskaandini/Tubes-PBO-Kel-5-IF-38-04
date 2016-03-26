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
    private String NoHP;
    private String JenisKelamin;
    String id;
	
    public Orang (String id,String Nama, String TanggalLahir,String NoHP, String JenisKelamin){
        this.id = id;
        this.Nama = Nama;
        this.TanggalLahir = TanggalLahir;
        this.NoHP = NoHP;
        this.JenisKelamin = JenisKelamin;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setNama (String nama){
        this.Nama = Nama;
    }
    public void setTanggalLahir(String TanggalLahir){
        this.TanggalLahir = TanggalLahir;
    }
    public void setNoHP (String NoHP){
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
    public String getNoHP(){
        return NoHP;
    }
    public String getJenisKelamin(){
        return JenisKelamin;
    }
    public void Display(){
    }
}