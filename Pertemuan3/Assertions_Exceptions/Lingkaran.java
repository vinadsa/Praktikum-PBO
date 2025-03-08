/* Nama File    : Lingkaran.java
 * Deskripsi    : program pembantu Asersi2
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 7 Maret 2025
 */
package Pertemuan3.Assertions_Exceptions;

public class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        return 2 * Math.PI * jariJari;
    }
}


