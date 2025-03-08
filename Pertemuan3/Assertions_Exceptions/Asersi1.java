/* Nama File    : Asersi1.java
 * Deskripsi    : program untuk menunjukkan penggunaan asersi
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 7 Maret 2025
 */
package Pertemuan3.Assertions_Exceptions;
public class Asersi1 {
    public static void main(String[] args){
        int x = 0;
        if (x>0){
            System.out.println("x adalah bilangan positif");
        } else {
            assert(x<0):"Ada kesalahan kode";
            System.out.println("x adalah bilangan negatif");
        }
    }
}
