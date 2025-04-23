/* Nama File    : Main.java
 * Deskripsi    : Main class Anabul
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 23 April 2025
 */
package Pertemuan6.TugasLanjutan;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Membuat objek Anabul
        Anabul anabul1 = new Kucing("Milo");
        Anabul anabul2 = new Anjing("Budi");
        Anabul anabul3 = new Burung("Cici");

        // Membuat array dari objek Anabul
        ArrayList<Anabul> daftarAnabul = new ArrayList<Anabul>();
        daftarAnabul.add(anabul1);
        daftarAnabul.add(anabul2);
        daftarAnabul.add(anabul3);
        
        // Menampilkan suara dan gerakan setiap Anabul
        System.out.println("Demonstrasi Polimorfisme pada Anabul:");
        System.out.println("====================================");
        
        for(Anabul anabul : daftarAnabul) {
            System.out.println("Nama: " + anabul.getNama());
            anabul.bersuara();
            anabul.bergerak();
            System.out.println();
        }
    }
}
