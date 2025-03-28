/* Nama File    : Fakultas.java
 * Deskripsi    : Class Fakultas
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 28 Maret 2025
 */
package Responsi;

public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    // Konstruktor
    public Fakultas() {
        this.nama = "";
        this.tarifUKT = 0.0;
        this.gajiPokok = 0.0;
    }

    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    // Selektor 
    public String getNama() {
        return nama;
    }
    public double getTarifUKT() {
        return tarifUKT;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }

    // Mutator 
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan informasi fakultas
    public void displayInfo() {
        System.out.println("=====================================");
        System.out.println("Nama Fakultas: " + nama);
        System.out.println("Tarif UKT: " + tarifUKT);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
