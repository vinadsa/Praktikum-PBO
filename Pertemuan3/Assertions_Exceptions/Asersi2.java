/* Nama File    : Asersi2.java
 * Deskripsi    : program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 7 Maret 2025
 */
package Pertemuan3.Assertions_Exceptions;

public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0): "Jari-jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

// Jawaban: Penggunaan asersi pada kasus ini salah karena yang seharusnya jadi tool deteksi kesalahan logika dan debugging,
// malah menjadi alat validasi input. Hal ini salah karena jika asersi tidak diaktifkan, maka input yang salah tidak akan terdeteksi.