/* Nama File    : Koleksi.java
 * Deskripsi    : Class Koleksi untuk menyimpan koleksi Anabul
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 10 Mei 2025
 */
package Pertemuan9.Tugas.Anabul;

import java.util.ArrayList;
import java.util.List;

public class Koleksi<T extends Anabul> {
    private List<T> items;

    public Koleksi() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        this.items.add(item);
    }

    public void showAll() {
        System.out.println("=== Informasi Semua Anabul dalam Koleksi ===");
        if (items.isEmpty()) {
            System.out.println("Koleksi masih kosong.");
            return;
        }
        for (T item : items) {
            System.out.println("Nama   : " + item.getNama());
            item.bersuara();
            item.bergerak();
            System.out.println("--------------------------------------");
        }
    }
}
