/* Nama File    : MMahasiswa.java
 * Deskripsi    : Main class Mahasiswa
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 1 Maret 2025
 */
package Pertemuan2.Mahasiswa;

public class MMahasiswa {
    public static void main(String[] args){
        //Inisialisasi Objek
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("24060123130081", "Kevin Adi Santoso", "Informatika");
        Dosen D1 = new Dosen("123", "Rismiyati", "Informatika");
        Kendaraan K1 = new Kendaraan("H 1234 AB", "Motor");
        
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
        System.out.println("\nJumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
        
    }
}
