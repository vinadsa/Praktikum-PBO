/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 1 Maret 2025
 */
package Pertemuan2.Mahasiswa;

import java.util.ArrayList;
public class Mahasiswa {
    /*********Atribut*********/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*********METHOD*********/
    
    //Konstruktor untuk membuat mahasiswa tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();

    }
    //Parameter sebagian
    public Mahasiswa(String NIM, String NAMA, String PRODI) {
        this.nim = NIM;
        this.nama = NAMA;
        this.prodi = PRODI;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }
    //Full Parameter
    public Mahasiswa(String NIM, String NAMA, String PRODI, Dosen dosenwali, Kendaraan kendaraan){
        this.nim = NIM;
        this.nama = NAMA;
        this.prodi = PRODI;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = dosenwali;
        this.kendaraan = kendaraan;
    }

    //Selektor
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getProdi(){
        return prodi;
    }
    public Dosen getDosenwali(){
        return dosenWali;
    }
    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    //Mutator
    public void setNim(String NIM){
        nim = NIM;
    }
    public void setNama(String NAMA){
        nama = NAMA;
    }
    public void setProdi(String PRODI){
        prodi = PRODI;
    }
    public void setDosenWali(Dosen dosenwali){
        dosenWali = dosenwali;
    }
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    //Menambahkan mata kuliah ke dalam listMatkul
    public void addMatkul (MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    //Menghitung jumlah SKS dari listMatkul
    public int getJumlahSKS(){
        int sum = 0;
        for(MataKuliah m : listMatkul){
            sum += m.getSks();
        }
        return sum;
    }

    //Menghitung jumlah mata kuliah yang diambil
    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    //Menampilkan data mahasiswa
    public void printMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    //Menampilkan detail mahasiswa
    public void printDetailMhs(){
        System.out.println("Detail Mahasiswa: ");
        printMhs();
        int i;
        // for (MataKuliah matkul : listMatkul) {
        //     System.out.println(matkul.getNama());
        // }
        System.out.println("Mata Kuliah yang diambil: ");
        for(i = 0 ; i < listMatkul.size() ; i++){
            System.out.println(listMatkul.get(i).getNama());
        }
        System.out.println("Data Dosen Wali: ");
        System.out.println("NIP: " + dosenWali.getNip());
        System.out.println("Nama: " + dosenWali.getNama());
        System.out.println("Prodi: " + dosenWali.getProdi());
        System.out.println("Data Kendaraan: ");
        System.out.println("No Plat: " + kendaraan.getNoPlat());
        System.out.println("Jenis: " + kendaraan.getJenis());
    }
}
