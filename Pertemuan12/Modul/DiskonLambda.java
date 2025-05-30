/* Nama File    : DiskonLambda.java
 * Deskripsi    : Contoh penggunaan lambda untuk perhitungan diskon
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 30 Mei 2025
 */

package Pertemuan12.Modul;


public class DiskonLambda {
    public static void main(String[] args) {
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };

        // dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        // dengan lambda blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        
        System.out.println("Diskon Merdeka : " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran : " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa : " + diskonBiasa.hitungDiskon(45000));

    }
}
