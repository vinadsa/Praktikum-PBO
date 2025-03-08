/* Nama File    : Tiket.java
 * Deskripsi    : class Tiket, berisi method untuk memesan tiket dan memilih e-wallet
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 8 Maret 2025
 */
package Pertemuan3.Soal_Tambahan.Asersi;

public class Tiket {
   public static void pesanJumlahTiket(int jumlahTiket) {
      // Asumsi jumlah tiket yang tersedia (boleh diganti)
      int tiketTersedia = 100;

      // Assertion untuk memastikan jumlah pemesanan lebih dari 0
      assert(jumlahTiket > 0): "Jumlah pemesanan tidak boleh nol!";

      // Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
      assert(jumlahTiket <= tiketTersedia): "Jumlah pemesanan melebihi tiket yang tersedia!";
      System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
   }

   public static void isEWallet(int EWallet) {
      // Memeriksa apakah index e-wallet yang dipilih valid
      if (EWallet > 0 && EWallet <= 4) {
         System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
      // Assertion untuk memastikan e-wallet yang dipilih valid
      } else {
         assert(EWallet > 0 && EWallet <= 4): "Pilihan e-wallet tidak valid!";
      }
   }

   private static String getEWallet(int index) {
      switch (index) {
         case 1:
            return "OVO";
         case 2:
            return "GoPay";
         case 3:
            return "DANA";
         case 4:
            return "LinkAja";
         default:
            return "";
      }
   }
}
