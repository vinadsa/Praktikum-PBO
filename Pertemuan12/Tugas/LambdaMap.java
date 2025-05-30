/* Nama File    : LambdaMap.java
 * Deskripsi    : Contoh penggunaan lambda pada Map di Java
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 30 Mei 2025
 */

package Pertemuan12.Tugas;

import java.util.*;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("001", "Adi");
        mahasiswaMap.put("002", "Bambang");
        mahasiswaMap.put("003", "Cici");
        mahasiswaMap.put("004", "Didi");

        //lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + ": " + nama));
    }
}
