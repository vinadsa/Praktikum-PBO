/* Nama File    : Pegawai.java
 * Deskripsi    : Superclass Pegawai
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 16 Maret 2025
 */
package Pertemuan4.Latihan;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Pegawai {
private String nip;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate tmt;
    private double gajiPokok;
    
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }
    public String getNIP() {
        return nip;
    }

    public void setNIP(String NIP) {
        this.nip = NIP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return tanggalLahir.format(formatter);
    }

    public void settanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTMT(){
        return tmt;
    }

    public String getTMTFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return tmt.format(formatter);
    }

    public void setTMT(LocalDate TMT) {
        this.tmt = TMT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setgajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public String getMasaKerja(){
        LocalDate now = LocalDate.now();
        Period waktu = Period.between(this.tmt, now);
        return waktu.getYears() + " tahun " + waktu.getMonths() + " bulan.";
    }

    public abstract double getTunjangan();
    public abstract void printInfo();
}
