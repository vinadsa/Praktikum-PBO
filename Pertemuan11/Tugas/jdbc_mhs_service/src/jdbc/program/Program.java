/* Nama File    : Program.java
 * Deskripsi    : Main program untuk testing MysqlMahasiswaService
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 26 Mei 2025
 */
package jdbc.program;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 * Main program untuk menguji implementasi MysqlMahasiswaService
 * @author Kevin Adi Santoso
 */
public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    
    /**
     * Method untuk menampilkan semua data mahasiswa
     * Menggunakan method displayAllMahasiswa() dari service
     */
    public static void displayAll() {
        service.displayAllMahasiswa();
        System.out.println();
    }
      public static void main(String[] args) {
        System.out.println("=== TESTING MYSQL MAHASISWA SERVICE ===\n");

        // insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(0, "Haryo"); // ID 0 karena auto-increment
        service.add(mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();

        // update - ambil data terakhir yang ada
        System.out.println("===update");
        // Dapatkan semua data dan ambil yang terakhir
        java.util.List<Mahasiswa> allMhs = service.getAll();
        if (!allMhs.isEmpty()) {
            Mahasiswa mhsUpdate = allMhs.get(allMhs.size() - 1); // Ambil data terakhir
            System.out.println("Akan diupdate data lama: " + mhsUpdate);
            mhsUpdate.setNama("Dinaya");
            System.out.println("dengan data baru: " + mhsUpdate);
            service.update(mhsUpdate);
            displayAll();

            // delete - hapus data yang sama
            System.out.println("===delete");
            System.out.println("akan di delete: " + mhsUpdate);
            service.delete(mhsUpdate.getId());
            displayAll();
        } else {
            System.out.println("Tidak ada data untuk diupdate dan dihapus");
        }
        
        // Tutup koneksi
        service.closeConnection();
        System.out.println("Program selesai.");
    }
}
