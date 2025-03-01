/* Nama File    : Kendaraan.java
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 1 Maret 2025
 */
package Pertemuan2.Mahasiswa;

public class Kendaraan {
    //Atribut
    private String noPlat;
    private String jenis;

    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }
    
    public Kendaraan(String Plat, String Jenis){
        noPlat = Plat;
        jenis = Jenis;
    }

    //Selektor
    public String getNoPlat(){
        return noPlat;
    }
    public String getJenis(){
        return jenis;
    }

    //Mutator
    public void setNoPlat(String Plat){
        noPlat = Plat;
    }
    public void setJenis(String Jenis){
        jenis = Jenis;
    }


}
