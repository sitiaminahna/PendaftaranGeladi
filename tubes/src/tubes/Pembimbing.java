/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author Fitrilia
 */
public class Pembimbing extends Orang {
    private long nip;
    private String kodeDosen;   
    
    public Pembimbing(String nama, String jenisKelamin,  String alamat, String telp, long nip, String kodeDosen) {
        super(nama,jenisKelamin,alamat,telp);
        this.nip = nip;
        this.kodeDosen = kodeDosen;
    }

    public long getNip() {
        return nip;
    }

    public void setNip(long nip) {
        this.nip = nip;
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }  
    public String toString(){
        return super.getNama();
    }
}
