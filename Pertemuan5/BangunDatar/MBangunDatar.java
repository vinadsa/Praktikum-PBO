/* Nama File    : MBangunDatar.java
 * Deskripsi    : Main class BangunDatar
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 22 Maret 2025
 */
package Pertemuan5.BangunDatar;

public class MBangunDatar {
    public static void main(String[] args) {
        //BangunDatar B1 = new BangunDatar() {};
        BangunDatar P1 = new Persegi(10, "hitam", "tebal");
        Persegi P2 = new Persegi(5, "hitam", "tebal");
        BangunDatar L1 = new Lingkaran(7, "hitam", "tebal");
        Lingkaran L2 = new Lingkaran (14, "hitam", "tebal");

        
        P1.printInfo();
        L1.printInfo();

        System.out.println(P1.isEqualLuas(L2));


        P2.zoomIn();
        System.out.println(P2.getSisi());
    }
}
