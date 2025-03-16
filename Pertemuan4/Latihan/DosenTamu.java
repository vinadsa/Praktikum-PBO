/* Nama File    : DosenTamu.java
 * Deskripsi    : Subclass Dosen
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 16 Maret 2025
 */
package Pertemuan4.Latihan;

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tanggalBerakhirKontrak;

    public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok,
            String fakultas, String nidk, LocalDate tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }
    
    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public LocalDate getTanggalBerakhirKontrak() {
        return tanggalBerakhirKontrak;
    }

    public void setTanggalBerakhirKontrak(LocalDate tanggalBerakhirKontrak) {
        this.tanggalBerakhirKontrak = tanggalBerakhirKontrak;
    }

    @Override
    public double getTunjangan(){
        // Tunjangan = 2,5% x gajiPokok
        return 0.025 * this.getGajiPokok();
    }

    @Override
    public void printInfo(){
        System.out.println("NIP                     : " + super.getNIP());
        System.out.println("NIDK                    : " + getNidk());
        System.out.println("Nama                    : " + getNama());
        System.out.println("Tanggal Lahir           : " + super.getTanggalLahir());
        System.out.println("TMT                     : " + super.getTMTFormat());
        System.out.println("Jabatan                 : Dosen Tamu");
        System.out.println("Fakultas                : " + super.getFakultas());
        System.out.println("Masa Kerja              : " + super.getMasaKerja());
        System.out.println("Tanggal Berakhir Kontrak: " + getTanggalBerakhirKontrak());
        System.out.println("Gaji Pokok              : Rp " + super.getGajiPokok());
        System.out.println("Tunjangan               : 2,5% x " + "Rp " + super.getGajiPokok() + " = Rp " + getTunjangan());
    }
}