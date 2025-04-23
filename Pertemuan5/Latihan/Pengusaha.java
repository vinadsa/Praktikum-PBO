/* Nama File    : Pengusaha.java
 * Deskripsi    : Class Pengusaha, subclass Manusia
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 24 Maret 2025
 */
package Pertemuan5.Latihan;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia {
    private String npwp;
    private static int counterPengusaha;

    // Konstruktor
    public Pengusaha() {
        super();
        npwp = "";
        counterPengusaha++;
    }

    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // Selektor (getter)
    public String getNpwp() {
        return npwp;
    }
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Mutator (setter)
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
    public static void setCounterPengusaha(int counterPengusaha) {
        Pengusaha.counterPengusaha = counterPengusaha;
    }

    // 24060123130081
    public int hitungMasaKerja() {
        return (int) ChronoUnit.DAYS.between(tgl_mulai_kerja, LocalDate.now()) + 8;
    }

    @Override
    public void cetakInfo() {
        System.out.println("=====================================");
        super.cetakInfo();
        System.out.println("NPWP                : " + getNpwp());
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " hari");
        System.out.println("=====================================");
    }

    public double hitungPajak() {
        return this.getPendapatan() * 0.15;
    }
}
