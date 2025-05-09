/* Nama File    : Koleksi.java
 * Deskripsi    : Class Koleksi, implementasi koleksi karakter
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 9 Mei 2025
 */
package Pertemuan9.Tugas.Koleksi;

import java.util.ArrayList;

public class Koleksi {
    private ArrayList<Character> wadah; 
    private int nbelm; 

    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public Koleksi(int n) {
        wadah = new ArrayList<>(n); // kapasitas sebanyak n
        nbelm = 0;
    }

    public Character getIsi(int X) { // ambil elemen pada indeks tertentu
        if (X >= 0 && X < nbelm) {
            return wadah.get(X);
        } 
        else {
            System.err.println("Error: Indeks " + X + " di luar batas.");
            return null;
        }
    }


    public void setIsi(int X, Character Char) { // ubah elemen pada indeks tertentu
        if (X >= 0 && X < nbelm) {
            wadah.set(X, Char);
        } 
        else {
            System.err.println("Error: Indeks " + X + " di luar batas.");
        }
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int newSize) { // mengubah ukuran koleksi
        // jika newSize lebih kecil dari nbelm, hapus elemen dari belakang
        if (newSize < 0) {
            System.err.println("Error: Ukuran tidak boleh negatif.");
            return;
        }

        if (newSize < this.nbelm) {
            while (wadah.size() > newSize) {
                wadah.remove(wadah.size() - 1);
            }
        } 
        
        else if (newSize > this.nbelm) {
            while (wadah.size() < newSize) {
                wadah.add('\0'); // null sebagai placeholder
            }
        }
        this.nbelm = newSize;
    }


    public void add(Character Char) {
        wadah.add(Char);
        nbelm = wadah.size();
    }

 
    public void delete(Character Char) {
        boolean removed = wadah.remove(Char);
        if (removed) {
            nbelm = wadah.size();
        }
    }

    public void showAll() {
        if (nbelm == 0) {
            System.out.println("Koleksi kosong.");
        }
        else {
            System.out.print("Isi koleksi: [");
            for (int i = 0; i < nbelm; i++) {
                System.out.print(wadah.get(i));
                if (i < nbelm - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}