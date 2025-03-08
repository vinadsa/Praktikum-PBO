/* Nama File    : Menu.java
 * Deskripsi    : class Menu berisi atribut nama, harga, dan stok
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 8 Maret 2025
 */
package Pertemuan3.Soal_Tambahan.Exception;

public class Menu {
    private String nama;
    private double harga;
    private int stok;

    public Menu(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void kurangiStok(int jumlah) {
       // TO DO 1: Tambahkan metode untuk mengurangi stok
       this.stok -= jumlah;
    }
}

