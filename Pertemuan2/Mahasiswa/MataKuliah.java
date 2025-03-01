/* Nama File    : MataKuliah.java
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 1 Maret 2025
 */
package Pertemuan2.Mahasiswa;

public class MataKuliah {
    //Atribut
    private String idMatkul;
    private String nama;
    private int sks;

    //Konstruktor
    public MataKuliah(){
        idMatkul = "";
        nama = "";
        sks = 0;
    }

    public MataKuliah(String ID, String name, int SKS){
        idMatkul = ID;
        nama = name;
        sks = SKS;
    }

    //Selektor
    public String getIdMatkul(){
        return idMatkul;
    }
    public String getNama(){
        return nama;
    }
    public int getSks(){
        return sks;
    }

    //Mutator
    public void setIdMatkul(String ID){
        idMatkul = ID;
    }
    public void setNama(String name){
        nama = name;
    }
    public void setSks(int SKS){
        sks = SKS;
    }
}
