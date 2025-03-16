/* Nama File    : DosenTetap.java
 * Deskripsi    : Subclass Dosen
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 16 Maret 2025
 */
package Pertemuan4.Latihan;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class DosenTetap extends Dosen {
    private String nidn;
    private LocalDate bup;
    
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,
                String fakultas, String nidn) {
            super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
            this.nidn = nidn;
            this.bup = tanggalLahir.plusYears(65);
    }
    
    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getBup() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        return bup.format(formatter);
    }

    public void setBup(LocalDate bup) {
        this.bup = bup.plusYears(65);
    }

    private int getMasaKerjaTahun() {
        Period period = Period.between(this.getTMT(), LocalDate.now());
        return period.getYears();
    }

    @Override
    public double getTunjangan(){
        // Tunjangan = 2% x masa kerja (tahun) x gajiPokok
        int masaKerjaTahun = getMasaKerjaTahun();
        return 0.02 * masaKerjaTahun * this.getGajiPokok();
    }

    @Override
    public void printInfo(){
        System.out.println("NIP          : " + super.getNIP());
        System.out.println("NIDN         : " + getNidn());
        System.out.println("Nama         : " + getNama());
        System.out.println("Tanggal Lahir: " + super.getTanggalLahir());
        System.out.println("TMT          : " + super.getTMTFormat());
        System.out.println("Jabatan      : Dosen Tetap");
        System.out.println("Fakultas     : " + super.getFakultas());
        System.out.println("Masa Kerja   : " + super.getMasaKerja());
        System.out.println("BUP          : " + getBup());
        System.out.println("Gaji Pokok   : Rp " + super.getGajiPokok());
        System.out.println("Tunjangan    : 2% x " + getMasaKerjaTahun() + " x Rp " + super.getGajiPokok() + " = Rp " + getTunjangan());
    }
}
