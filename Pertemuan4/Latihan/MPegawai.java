/* Nama File    : MPegawai.java
 * Deskripsi    : Main class Pegawai
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 16 Maret 2025
 */
package Pertemuan4.Latihan;

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap DT1 = new DosenTetap("1457", "Hadyan Kholish", LocalDate.of(1990, 5, 5), 
                        LocalDate.of(2020, 7, 2), 6000000, "Sains dan Matematika", "42361352");
        DosenTamu DTam1 = new DosenTamu("1632", "Azka Subhan", LocalDate.of(1995, 2, 23), 
                        LocalDate.of(2022,10,27), 5500000, "Hukum", "23523136", LocalDate.of(2025, 10, 9));
        Tendik Ten1 = new Tendik("5231", "Indro Purwanto", LocalDate.of(2000, 1, 28), 
                        LocalDate.of(2023, 6, 4), 4500000, "Akademik");
        
        DT1.printInfo();
        System.out.println("\n===========================================================\n");
        DTam1.printInfo();
        System.out.println("\n===========================================================\n");
        Ten1.printInfo();
    }
}
