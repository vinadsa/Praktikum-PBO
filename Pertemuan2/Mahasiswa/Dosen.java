/* Nama File    : Dosen.java
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 1 Maret 2025
 */
package Pertemuan2.Mahasiswa;

public class Dosen {
    //Atribut
    private String nip;
    private String nama;
    private String prodi;

    public Dosen(){
        nip = "";
        nama = "";
        prodi = "";
    }
    
    public Dosen(String Nip, String Nama, String Prodi){
        nip = Nip;
        nama = Nama;
        prodi = Prodi;
    }

    //Selektor
    public String getNip(){
        return nip;
    }
    public String getNama(){
        return nama;
    }
    public String getProdi(){
        return prodi;
    }

    //Mutator
    public void setNip(String Nip){
        nip = Nip;
    }
    public void setNama(String Nama){
        nama = Nama;
    }
    public void setProdi(String Prodi){
        prodi = Prodi;
    }

}
