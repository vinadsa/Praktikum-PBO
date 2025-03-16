/* Nama File    : Persegi.java
 * Deskripsi    : Subclass BangunDatar, Persegi
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 14 Maret 2025
 */
package Pertemuan4.BangunDatar;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);;
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * sisi;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }

}
