/* Nama File    : ContohMetodeGenerik.java
 * Deskripsi    : Class ContohMetodeGenerik, metode generik utk mengendalikan kelas Datum dgn main
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 02 Mei 2025
 */

package Pertemuan8.Modul.Generik; 

public class ContohMetodeGenerik {

    /**
     * Metode generik untuk menampilkan informasi dan aksi dari Anabul
     * yang disimpan dalam objek Datum.
     * Menggunakan Bounded Type Parameter (T harus merupakan Anabul atau turunannya).
     *
     * @param <T>   Tipe generik yang merupakan turunan dari Anabul
     * @param datum Objek Datum yang berisi Anabul atau turunannya
     */
    public <T extends Anabul> void kendalikanDanTampilkanInfo(Datum<T> datum) {
        // 1. Mengambil isi dari Datum
        T hewan = datum.getIsi();

        // Memastikan isi tidak null sebelum digunakan
        if (hewan != null) {
            // 2. Menampilkan informasi dasar
            System.out.println("\n--- Mengendalikan Datum ---");
            System.out.println("Isi Datum adalah objek dari kelas: " + hewan.getClass().getSimpleName());
            // Jika ingin menampilkan nama (jika ada)
            // System.out.println("Nama Anabul: " + hewan.getNama());

            // 3. Memanggil metode dari Anabul (bergerak dan bersuara)
            System.out.print("Aksi: ");
            hewan.bergerak();
            System.out.print("Suara: ");
            hewan.bersuara();
            System.out.println("---------------------------");
        } else {
            System.out.println("\n--- Datum Kosong ---");
        }
    }

    // Program aplikasi (main method) untuk kelas ContohMetodeGenerik
    public static void main(String[] args) {
        // Membuat instance dari ContohMetodeGenerik untuk memanggil metode non-statis
        ContohMetodeGenerik controller = new ContohMetodeGenerik();

        // Membuat objek Kucing, Anjing, dan Burung
        Kucing oyen = new Kucing("Oyen");
        Anjing herder = new Anjing("Herder");
        Burung pipit = new Burung("Pipit");

        // Membuat objek Datum untuk masing-masing Anabul
        Datum<Kucing> datumKucing = new Datum<>();
        datumKucing.setIsi(oyen);

        Datum<Anjing> datumAnjing = new Datum<>();
        datumAnjing.setIsi(herder);

        Datum<Burung> datumBurung = new Datum<>();
        datumBurung.setIsi(pipit);

        // Membuat objek Datum dengan tipe Anabul (lebih umum)
        Datum<Anabul> datumCampuran = new Datum<>();

        // Menggunakan metode generik 'kendalikanDanTampilkanInfo'
        System.out.println("=== Memanggil Metode Generik ===");

        // Mengendalikan Datum Kucing
        controller.kendalikanDanTampilkanInfo(datumKucing);

        // Mengendalikan Datum Anjing
        controller.kendalikanDanTampilkanInfo(datumAnjing);

        // Mengendalikan Datum Burung
        controller.kendalikanDanTampilkanInfo(datumBurung);

        // Mengendalikan Datum Campuran (diisi Kucing lalu Anjing)
        System.out.println("\n=== Mengendalikan Datum<Anabul> ===");
        datumCampuran.setIsi(new Kucing("Milo"));
        controller.kendalikanDanTampilkanInfo(datumCampuran);

        datumCampuran.setIsi(new Anjing("Doggo"));
        controller.kendalikanDanTampilkanInfo(datumCampuran);
    }
}