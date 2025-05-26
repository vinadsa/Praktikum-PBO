/* Nama File    : TestProgram.java
 * Deskripsi    : Extended test program untuk testing semua method MysqlMahasiswaService
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 26 Mei 2025
 */
package jdbc.program;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 * Extended test program untuk menguji semua implementasi MysqlMahasiswaService
 * @author Kevin Adi Santoso
 */
public class TestProgram {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    
    /**
     * Method untuk menampilkan semua data mahasiswa
     */
    public static void displayAll() {
        service.displayAllMahasiswa();
        System.out.println();
    }
    
    public static void main(String[] args) {
        System.out.println("=== COMPREHENSIVE TESTING MYSQL MAHASISWA SERVICE ===\n");

        // Test 1: Insert
        System.out.println("=== TEST 1: INSERT ===");
        Mahasiswa mhsAdd = new Mahasiswa(0, "Test Student");
        service.add(mhsAdd);
        System.out.println("Berhasil insert: " + mhsAdd);
        displayAll();

        // Test 2: Get all and find the inserted record
        System.out.println("=== TEST 2: GET ALL & GET BY ID ===");
        var allMhs = service.getAll();
        if (!allMhs.isEmpty()) {
            Mahasiswa lastMhs = allMhs.get(allMhs.size() - 1);
            System.out.println("Data terakhir: " + lastMhs);
            
            // Test getById
            Mahasiswa foundMhs = service.getById(lastMhs.getId());
            System.out.println("Data yang dicari dengan ID " + lastMhs.getId() + ": " + foundMhs);
            
            // Test 3: Update
            System.out.println("\n=== TEST 3: UPDATE ===");
            foundMhs.setNama("Updated Test Student");
            service.update(foundMhs);
            System.out.println("Data setelah update:");
            displayAll();
            
            // Test 4: Delete
            System.out.println("=== TEST 4: DELETE ===");
            service.delete(foundMhs.getId());
            System.out.println("Data setelah delete:");
            displayAll();
        }
        
        // Test 5: Test getById dengan ID yang tidak ada
        System.out.println("=== TEST 5: GET BY ID (NON-EXISTENT) ===");
        Mahasiswa notFound = service.getById(9999);
        System.out.println("Mencari ID 9999: " + notFound);
        
        // Tutup koneksi
        service.closeConnection();
        System.out.println("\nSemua test selesai.");
    }
}
