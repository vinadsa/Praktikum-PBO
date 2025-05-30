/* Nama File    : LambdaList.java
 * Deskripsi    : Contoh penggunaan lambda pada List di Java
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 30 Mei 2025
 */

package Pertemuan12.Modul;

import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();

        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
