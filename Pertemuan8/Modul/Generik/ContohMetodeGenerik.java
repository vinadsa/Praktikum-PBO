/* Nama File    : ContohMetodeGenerik.java
 * Deskripsi    : Class ContohMetodeGenerik, metode generik utk mengendalikan kelas Datum dgn main
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 2 Mei 2025
 */

package Pertemuan8.Modul.Generik; 

public class ContohMetodeGenerik {
    public <T extends Anabul> void kontrolDanPrintInfo(Datum<T> datum) {
        // ambil isi
        T anabul = datum.getIsi();

        if (anabul != null){
            // Menampilkan info dasar
            System.out.println("\n--- Mengendalikan Datum ---");
            System.out.println("Isi Datum adalah objek dari kelas: " + anabul.getClass().getSimpleName());
            System.out.println("Nama Anabul: " + anabul.getNama());

            // Panggil method
            anabul.bergerak();
            anabul.bersuara();
            System.out.println("============================");
        } 
        else{
            System.out.println("\n--- Datum Kosong ---");
        }
    }

    // main ContohMetodeGenerik
    public static void main(String[] args) {
        ContohMetodeGenerik controller = new ContohMetodeGenerik();

        // inisialisasi Kucing, Anjing, dan Burung
        Kucing oyen = new Kucing("Oyen");
        Anjing bleki = new Anjing("Bleki");
        Burung cicit = new Burung("Cicit");

        // assign ke datum
        Datum<Kucing> datumKucing = new Datum<>();
        datumKucing.setIsi(oyen);

        Datum<Anjing> datumAnjing = new Datum<>();
        datumAnjing.setIsi(bleki);

        Datum<Burung> datumBurung = new Datum<>();
        datumBurung.setIsi(cicit);

        Datum<Anabul> datumCampuran = new Datum<>();

        System.out.println("=== Memanggil Metode Generik ===");

        // Kontrol Datum Kucing
        controller.kontrolDanPrintInfo(datumKucing);

        // Kontrol Datum Anjing
        controller.kontrolDanPrintInfo(datumAnjing);

        // Kontrol Datum Burung
        controller.kontrolDanPrintInfo(datumBurung);

        // Kontrol Datum Campuran (kucing and anjing)
        System.out.println("=== Kontrol Datum Campuran ===");
        datumCampuran.setIsi(new Kucing("Teh Anget"));
        controller.kontrolDanPrintInfo(datumCampuran);

        datumCampuran.setIsi(new Anjing("Budi"));
        controller.kontrolDanPrintInfo(datumCampuran);
    }
}