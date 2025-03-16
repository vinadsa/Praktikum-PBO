/* Nama File    : MBangunDatar.java
 * Deskripsi    : Main class BangunDatar
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 14 Maret 2025
 */
package Pertemuan4.BangunDatar;

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(12, "Merah", "Tipis");
        Lingkaran L1 = new Lingkaran(7, "Biru", "Tebal");

        System.out.println("Info Persegi:");
        P1.printInfo();

        System.out.println("\nInfo Lingkaran:");
        L1.printInfo();
        
        System.out.println("");
        BangunDatar.printCounterBangunDatar();
    }
}
