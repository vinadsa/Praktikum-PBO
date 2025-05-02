/* Nama File    : Main.java
 * Deskripsi    : Main class Anabul
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 23 April 2025
 */
package Pertemuan8.Modul.Generik;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Anjing a = new Anjing();
        Datum<Anabul> x = new Datum<>();
        x.setIsi(a);
        x.getIsi().bergerak();
        x.getIsi().bersuara();
        x.setIsi(new Burung());
        x.getIsi().bergerak();
        x.getIsi().bersuara();
    }
}
