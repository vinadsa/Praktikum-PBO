/* Nama File    : Anabul.java
 * Deskripsi    : Superclass Anabul
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 10 Mei 2025
 */
package Pertemuan9.Tugas.Anabul;

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
