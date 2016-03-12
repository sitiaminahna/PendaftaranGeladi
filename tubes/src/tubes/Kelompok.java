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
public class Kelompok {
    private Mahasiswa[] anggota = new Mahasiswa[5];    
    private int jmlMhs = 0;            

    public Kelompok(Mahasiswa mhs) {
        this.anggota[this.jmlMhs] = mhs; 
        this.jmlMhs ++;
    }
  
    public void addAnggota(Mahasiswa m) {
        anggota[jmlMhs] = m;
        jmlMhs++;
    }
    public void getAnggota(){
        for(int i = 0; i < anggota.length; i++){
            System.out.println(anggota[i].getNama());
        }
        //System.out.println(anggota.length);
        
    }
    public Mahasiswa getAnggotabyIndex(int n) {
        return anggota[n];
    }
    
    public Mahasiswa getAnggotabyId(String nim) {
        int i;
        for (i=0; i<jmlMhs; i++) {
            if (anggota[i].getNim() == nim) {
                //System.out.println(this.getAnggota(i).getNama());
                return anggota[i];
                               
            }
        }         
        return anggota[i];      
    }                
}
