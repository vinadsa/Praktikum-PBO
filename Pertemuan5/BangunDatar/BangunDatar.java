/* Nama File    : BangunDatar.java
 * Deskripsi    : Superclass BangunDatar
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 14 Maret 2025
 */
package Pertemuan5.BangunDatar;

public abstract class BangunDatar implements IResize{
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar;

    public BangunDatar(){
        warna = "";
        border = "";
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    public void setJmlSisi(int sisi) {
        this.jmlSisi = sisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    public abstract double getLuas();
    public abstract double getKeliling();
  
    
    // Soal 1
    // Apakah method yang dibuat pada langkah nomor 4 dapat digunakan untuk membandingkan objek
    // bangun datar yang berbeda?
    // Jawab: Bisa, karena method isEqualLuas() merupakan method yang dibuat pada superclass BangunDatar
    // yang dapat digunakan untuk membandingkan objek bangun datar yang berbeda.

    // Soal 2
    // Jika BangunDatar tidak dijadikan sebagai abstract class, dapatkah Anda membuat method isEqualLuas()
    // dan isEqualKeliling pada class BangunDatar? Mengapa?
    // Jawab: Tidak bisa, karena method isEqualLuas() dan isEqualKeliling() harus diimplementasikan pada subclass
    // karena setiap bangun datar memiliki rumus luas dan keliling yang berbeda-beda. Sehingga, BangunDatar harus
    // dijadikan sebagai abstract class agar method-method tersebut dapat diimplementasikan pada subclass.

    // Soal 3
    // Apakah kelebihan saat class BangunDatar dijadikan sebagai abstract class daripada non-abstract class?
    // Jawab: Banyak kelebihan yaitu memungkinkan method abstract untuk implementasi yang spesifik pada tiap subclassnya, mencegah instansiasi
    // BangunDatar karena merupakan suatu konsep(template), dan supaya subclass konsisten dalam implementasi method yang diwarisi dari superclass.

}
