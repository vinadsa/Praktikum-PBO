/* Nama File    : Dosen.java
 * Deskripsi    : Subclass dari Pegawai, abstrak Dosen
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 16 Maret 2025
 */
package Pertemuan4.Latihan;

import java.time.LocalDate;

public abstract class Dosen extends Pegawai{
    private String fakultas;

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    
}
