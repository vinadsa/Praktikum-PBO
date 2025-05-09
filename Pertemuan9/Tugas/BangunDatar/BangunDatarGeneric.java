/* Nama File    : BangunDatarGeneric.java
 * Deskripsi    : Class BangunDatarGeneric
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 9 Mei 2025
 */

package Pertemuan9.Tugas.BangunDatar;

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public T get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }

    public double hitungLuas() {
        return bangunDatar.hitungLuas();
    }
}
