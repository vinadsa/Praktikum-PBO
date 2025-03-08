/* Nama File    : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 7 Maret 2025
 */
package Pertemuan3.Assertions_Exceptions;

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial!");
    }
}
