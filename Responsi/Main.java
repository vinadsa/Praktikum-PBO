/* Nama File    : Main.java
 * Deskripsi    : Main class Universitas
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 28 Maret 2025
 */
package Responsi;

public class Main {
    public static void main(String[] args) {
        // Inisialisasi Fakultas
        Fakultas F1 = new Fakultas("Fakultas Sains dan Matematika", 6000000, 7000000);
        Fakultas F2 = new Fakultas("Fakultas Ilmu Sosial dan Ilmu Politik", 9000000, 7500000);
        Fakultas F3 = new Fakultas("Fakultas Teknik", 8000000, 8000000);

        // Inisialisasi Mahasiswa
        System.out.println("Menginstansiasi objek Mahasiswa...");
        Mahasiswa M1 = new Mahasiswa("Kevin Adi Santoso", "kevinadsantoso@gmail.com", "123130081", 4, F1);
        Mahasiswa M2 = new Mahasiswa("Ferdinand Aryanto", "ferdi@gmail.com", "32130012", 2, F2);
        Mahasiswa M3 = new Mahasiswa("Nada Syafa", "nada@gmail.com", "21140056", 6, F3);
        System.out.println("Jumlah mahasiswa: " + Mahasiswa.getCounterMahasiswa());

        // Inisialisasi Dosen
        System.out.println("Menginstansiasi objek Dosen...");
        Dosen D1 = new Dosen("Henry", "henryA@gmail.com", "268301", 16, F1);
        Dosen D2 = new Dosen("Kusumawati", "kusuma@gmail.com", "224781", 5, F2);
        Dosen D3 = new Dosen("Yohanes", "yohan123@gmail.com", "361890", 10, F3);
        System.out.println("Jumlah dosen: " + Dosen.getCounterDosen());

        // Inisialisasi Tenaga Pendidikan
        System.out.println("Menginstansiasi Tenaga Pendidikan...");
        TenagaPendidikan K1 = new TenagaPendidikan("Aryo", "aryano@gmail.com", "790192", 3);
        TenagaPendidikan K2 = new TenagaPendidikan("Dimas Aji", "aji@gmail.com", "123890", 7);
        System.out.println("Jumlah tenaga pendidikan: " + TenagaPendidikan.getCounterTenagaPendidikan());

        System.out.println("===============================================================");
        System.out.println("INFORMASI UNIVERSITAS");

        // Menampilkan informasi fakultas
        System.out.println("\nInformasi Fakultas:");
        F1.displayInfo();
        F2.displayInfo();
        F3.displayInfo();

        // Menampilkan informasi mahasiswa
        System.out.println("\nInformasi Mahasiswa:");
        M1.displayInfo();
        M2.displayInfo();
        M3.displayInfo();

        // Menampilkan informasi dosen
        System.out.println("\nInformasi Dosen:");
        D1.displayInfo();
        D2.displayInfo();
        D3.displayInfo();

        // Menampilkan informasi tenaga pendidikan
        System.out.println("\nInformasi Tenaga Pendidikan:");
        K1.displayInfo();
        K2.displayInfo();
    }
}
