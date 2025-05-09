/* Nama File    : Lingkaran.java
 * Deskripsi    : Class Lingkaran, subclass BangunDatar
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 9 Mei 2025
 */

package Pertemuan9.Tugas.BangunDatar;

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    
    public double getJejari() {
        return jejari;
    }
    
    public void setJejari(double jejari) {
        this.jejari = jejari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
    
    @Override
    public double hitungLuas() {
        return jejari * jejari * 3.14;
    }
}
