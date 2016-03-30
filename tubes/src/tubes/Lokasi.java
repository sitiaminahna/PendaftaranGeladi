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
public class Lokasi {
    private Pembimbing pembimbing;
    private Kelompok[] kelompok = new Kelompok[10];
    private String namaPerusahaan;
    private String kota;
    private int jmlKelompok = 0;
    
    public Lokasi(String namaPerusahaan, String kota) {
        this.namaPerusahaan = namaPerusahaan;
        this.kota = kota;
    }
    
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }    
    
    public void setPembimbing(Pembimbing p) {
        this.pembimbing = p;
        
    }
    
    public void createKelompok(Mahasiswa mhs){
        this.kelompok[this.jmlKelompok] = new Kelompok(mhs);
        this.jmlKelompok++;    
    } 
    
    public Kelompok getKelompok(int n) {
        return kelompok[n];
    }
    
    public void removeKelompok (Mahasiswa mhs) {
        this.jmlKelompok--;
    }
    public String toString(){
        String Lokasi = "Nama Perusahaan : " + this.getNamaPerusahaan()+
                        "\n Nama Kota    : " + this.getKota();
        return Lokasi;
    }
}
