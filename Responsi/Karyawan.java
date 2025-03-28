/* Nama File    : Karyawan.java
 * Deskripsi    : Class Karyawan, subclass dari CivitasAkademika, superclass dari Dosen dan TenagaPendidikan
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 28 Maret 2025
 */
package Responsi;

public abstract class Karyawan extends CivitasAkademika {
    protected String nip;
    protected int masaKerja;

    // Konstruktor
    public Karyawan() {
        super();
        nip = "";
        masaKerja = 0;
    }

    public Karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
    }

    // Selektor
    public String getNip() {
        return nip;
    }
    public int getMasaKerja() {
        return masaKerja;
    }

    // Mutator
    public void setNip(String nip) {
        this.nip = nip;
    }
    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }
    
    // Method
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIP: " + nip);
        System.out.println("Masa Kerja: " + masaKerja);
    }

    public abstract double hitungGaji();

}
