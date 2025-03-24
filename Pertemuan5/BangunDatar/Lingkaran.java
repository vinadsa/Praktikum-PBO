/* Nama File    : Lingkaran.java
 * Deskripsi    : Subclass BangunDatar, Lingkaran
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 22 Maret 2025
 */
package Pertemuan5.BangunDatar;

public class Lingkaran extends BangunDatar {
    private double jari;

    // Konstruktor
    public Lingkaran() {
        super();
        this.jari = 0;
    }

    public Lingkaran(double jari, String warna, String border) {
        super(1, warna, border);
        this.jari = jari;
    }

    // Selektor
    public double getJari() {
        return jari;
    }

    // Mutator
    public void setJari(double jari) {
        this.jari = jari;
    }

    
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Jari: " + jari);
    }

    //menambah ukuran 10%
    public void zoomIn(){
        this.jari = this.jari + this.jari * 10/100;
    }

    //mengurangi ukuran 10%
    public void zoomOut(){
        this.jari = this.jari - this.jari * 10/100;
    }

    //menskalakan ukuran sesuai dengan input percent
    public void zoom(int percent){
        this.jari = this.jari + this.jari * percent/100;
    }
}
