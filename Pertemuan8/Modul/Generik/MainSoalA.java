/* Nama File    : Main.java
 * Deskripsi    : Main class Anabul
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 1 Mei 2025
 */
package Pertemuan8.Modul.Generik;

public class MainSoalA {
    public static void main(String[] args) {
        // Percobaan dengan Anabul (Anjing & Burung)
        Anjing a = new Anjing();
        Datum<Anabul> x = new Datum<>();
        x.setIsi(a);
        x.getIsi().bergerak();
        x.getIsi().bersuara();
        x.setIsi(new Burung());
        x.getIsi().bergerak();
        x.getIsi().bersuara();

        // Percobaan dengan Kucing
        Kucing k = new Kucing("Es Teh");
        Datum<Anabul> y = new Datum<>();
        y.setIsi(k);
        System.out.println("Nama kucing: " + y.getIsi().getNama());
        y.getIsi().bergerak();
        y.getIsi().bersuara();

        // Percobaan generik dengan tipe String
        Datum<String> z = new Datum<>();
        z.setIsi("String generik");
        System.out.println("Isi z: " + z.getIsi());

        // Percobaan generik dengan tipe Integer
        Datum<Integer> angka = new Datum<>();
        angka.setIsi(12345);
        System.out.println("Isi angka: " + angka.getIsi());
    }
}
