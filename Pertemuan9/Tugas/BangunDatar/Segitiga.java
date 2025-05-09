/* Nama File    : Segitiga.java
 * Deskripsi    : Class Segitiga, subclass BangunDatar
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 9 Mei 2025
 */

package Pertemuan9.Tugas.BangunDatar;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return 3 * alas;
    }
    
}
