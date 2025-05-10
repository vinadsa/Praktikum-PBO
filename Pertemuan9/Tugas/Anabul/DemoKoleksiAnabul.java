/* Nama File    : DemoKoleksiAnabul.java
 * Deskripsi    : Mainclass DemoKoleksiAnabul
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 10 Mei 2025
 */
package Pertemuan9.Tugas.Anabul;

import java.util.Random;

public class DemoKoleksiAnabul {
    public static void main(String[] args) {
        // inisialisasi objek KoleksiAnabul
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>();
        Random random = new Random();

        System.out.println("Menambahkan 10 anabul acak ke dalam koleksi...");
        for (int i = 0; i < 10; i++) {
            int jenisAnabul = random.nextInt(3); // 0: Kucing, 1: Anjing, 2: Burung
            String nama = "Anabul" + String.format(" %02d", i + 1);
            Anabul anabulBaru = null;

            switch (jenisAnabul) {
                case 0:
                    anabulBaru = new Kucing(nama);
                    System.out.println("Menambahkan Kucing: " + nama);
                    break;
                case 1:
                    anabulBaru = new Anjing(nama);
                    System.out.println("Menambahkan Anjing: " + nama);
                    break;
                case 2:
                    anabulBaru = new Burung(nama);
                    System.out.println("Menambahkan Burung: " + nama);
                    break;
            }
            if (anabulBaru != null) {
                koleksiAnabul.addItem(anabulBaru);
            }
        }
        System.out.println("Penambahan 10 anabul acak selesai.\n");

        koleksiAnabul.showAll();
    }
}
