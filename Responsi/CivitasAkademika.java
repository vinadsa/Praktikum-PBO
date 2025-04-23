/* Nama File    : CivitasAkademika.java
 * Deskripsi    : Class CivitasAkademika, superclass dari Mahasiswa dan Karyawan
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 28 Maret 2025
 */
package Responsi;

public abstract class CivitasAkademika {
    protected String nama;
    protected String email;

    // Konstruktor
    public CivitasAkademika() {
        this.nama = "";
        this.email = "";
    }

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    // Selector
    public String getNama() {
        return nama;
    }
    public String getEmail() {
        return email;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Method
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}
