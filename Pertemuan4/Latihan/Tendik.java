/* Nama File    : Tendik.java
 * Deskripsi    : Subclass Pegawai, Tenaga Pendidikan
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 16 Maret 2025
 */
package Pertemuan4.Latihan;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Tendik extends Pegawai{
    private String bidang;
    private LocalDate bup;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,
                String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
        this.bup = tanggalLahir.plusYears(55);
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public String getBup() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return bup.format(formatter);
    }

    public void setBup(LocalDate bup) {
        this.bup = bup.plusYears(55);
    }

    private int getMasaKerjaTahun() {
        Period period = Period.between(this.getTMT(), LocalDate.now());
        return period.getYears();
    }

    @Override
    public double getTunjangan() {
        // Tunjangan = 1% x masa kerja (tahun) x gajiPokok
        int masaKerjaTahun = getMasaKerjaTahun();
        return 0.01 * masaKerjaTahun * this.getGajiPokok();
    }

    @Override
    public void printInfo(){
        System.out.println("NIP             : " + super.getNIP());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + super.getTanggalLahir());
        System.out.println("TMT             : " + super.getTMTFormat());
        System.out.println("Jabatan         : Tenaga Pendidikan");
        System.out.println("Bidang          : " + getBidang());
        System.out.println("Masa Kerja      : " + super.getMasaKerja());
        System.out.println("BUP             : " + getBup());
        System.out.println("Gaji Pokok      : Rp " + super.getGajiPokok());
        System.out.println("Tunjangan       : 1% x " + getMasaKerjaTahun() + " x Rp " + super.getGajiPokok() + " = Rp " + getTunjangan());
    }
}
