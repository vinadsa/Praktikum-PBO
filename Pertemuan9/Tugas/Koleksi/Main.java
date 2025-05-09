/* Nama File    : Main.java
 * Deskripsi    : MainClass Main, uji coba Koleksi
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 9 Mei 2025
 */
package Pertemuan9.Tugas.Koleksi;

public class Main {
    public static void main(String[] args) {
        // inisialisasi objek Koleksi dengan kapasitas awal 10
        Koleksi koleksi = new Koleksi(10); // n = 10, nbelm masih 0

        System.out.println("--- Inisialisasi ---");
        System.out.println("Ukuran awal: " + koleksi.getSize());
        koleksi.showAll();

        System.out.println("\n--- Menambah Elemen ---");
        koleksi.add('K');
        koleksi.add('E');
        koleksi.add('V');
        koleksi.add('I');
        koleksi.add('N');
        koleksi.add('G');
        koleksi.add('T');
        koleksi.add('G');
        System.out.println("Ukuran setelah menambah 8 elemen: " + koleksi.getSize());
        koleksi.showAll();

        
        koleksi.add('#');
        koleksi.add('$');
        System.out.println("Ukuran setelah menambah total 10 elemen: " + koleksi.getSize());
        koleksi.showAll();


        System.out.println("\n--- Mengambil Elemen (getIsi) ---");
        System.out.println("Elemen ke-0: " + koleksi.getIsi(0)); 
        System.out.println("Elemen ke-3: " + koleksi.getIsi(3)); 
        System.out.println("Elemen ke-9: " + koleksi.getIsi(9)); 
        System.out.println("Elemen ke-10 (salah): " + koleksi.getIsi(10));


        System.out.println("\n--- Mengubah Elemen (setIsi) ---");
        koleksi.setIsi(2, 'P');
        koleksi.setIsi(9, '!');
        System.out.println("Setelah setIsi(2, 'P') dan setIsi(9, '!'):");
        koleksi.showAll();
        koleksi.setIsi(10, 'Y'); // test salah


        System.out.println("\n--- Menghapus Elemen (delete) ---");
        koleksi.delete('#');
        System.out.println("Setelah delete('#'):");
        koleksi.showAll();
        System.out.println("Ukuran: " + koleksi.getSize());

        koleksi.delete('Z');
        System.out.println("Setelah delete('Z') (tidak ada perubahan):");
        koleksi.showAll();
        System.out.println("Ukuran: " + koleksi.getSize());


        System.out.println("\n--- Mengatur Ukuran (setSize) ---");
        koleksi.setSize(12); 
        System.out.println("Setelah setSize(12):");
        koleksi.showAll();
        System.out.println("Ukuran: " + koleksi.getSize());
        System.out.println("Elemen ke-10 (placeholder): " + koleksi.getIsi(10));


        koleksi.add('N');
        System.out.println("Setelah add('N'):");
        koleksi.showAll();
        System.out.println("Ukuran: " + koleksi.getSize());


        koleksi.setSize(5); 
        System.out.println("Setelah setSize(5):");
        koleksi.showAll();
        System.out.println("Ukuran: " + koleksi.getSize());

        System.out.println("Test setSize(-1):");
        koleksi.setSize(-1); // test salah

    }
}