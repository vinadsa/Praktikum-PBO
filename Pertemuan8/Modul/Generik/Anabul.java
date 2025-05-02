/* Nama File    : Anabul.java
 * Deskripsi    : Superclass Anabul
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 23 April 2025
 */
package Pertemuan8.Modul.Generik;

public abstract class Anabul {
    protected String nama;

    public Anabul() {
        nama = "";
    }

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method abstrak
    public abstract void bersuara();
    public abstract void bergerak();
}
