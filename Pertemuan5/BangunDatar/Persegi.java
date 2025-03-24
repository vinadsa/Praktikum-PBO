/* Nama File    : Persegi.java
 * Deskripsi    : Subclass BangunDatar, Persegi
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 22 Maret 2025
 */
package Pertemuan5.BangunDatar;

public class Persegi extends BangunDatar {
    private double sisi;

    // Konstruktor
    public Persegi() {
        super();
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // Selektor
    public double getSisi() {
        return sisi;
    }

    // Mutator
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

    //menambah ukuran 10%
    public void zoomIn(){
        this.sisi = this.sisi + this.sisi * 10/100;
    }

    //mengurangi ukuran 10%
    public void zoomOut(){
        this.sisi = this.sisi - this.sisi * 10/100;
    }

    //menskalakan ukuran sesuai dengan input percent
    public void zoom(int percent){
        this.sisi = this.sisi + this.sisi * percent/100;
    }
}
