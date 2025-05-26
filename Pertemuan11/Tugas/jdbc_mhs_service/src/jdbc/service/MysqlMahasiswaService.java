/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;
import java.sql.Connection;
import java.util.List;
import java.util.ArrayList; // Diperlukan untuk return value getAll()

/**
 *
 * @author asus
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        // Isi konstruktor (misalnya: inisialisasi koneksi)
        // this.koneksi = MysqlUtility.getConnection(); // Contoh
    }

    /**
     * Membuat objek mahasiswa dari ResultSet.
     * (Asumsi berdasarkan konteks, Anda bisa sesuaikan)
     * @return Objek Mahasiswa
     */
    public Mahasiswa makeMhsObject() {
        // Implementasi untuk membuat objek Mahasiswa
        return null; // Template: return null
    }

    /**
     * Menambahkan data mahasiswa ke database.
     * @param mhs Objek Mahasiswa yang akan ditambahkan.
     */
    public void add(Mahasiswa mhs) {
        // Implementasi untuk menambahkan data
    }

    /**
     * Update data mahasiswa di database.
     * @param mhs Objek Mahasiswa yang akan diupdate.
     */
    public void update(Mahasiswa mhs) {
        // Implementasi untuk update data
    }

    /**
     * Delete data mahasiswa sesuai id dari database.
     * @param id ID Mahasiswa yang akan dihapus.
     */
    public void delete(int id) {
        // Implementasi untuk menghapus data
    }

    /**
     * Ambil mahasiswa sesuai id dari database.
     * @param id ID Mahasiswa yang dicari.
     * @return Objek Mahasiswa atau null jika tidak ditemukan.
     */
    public Mahasiswa getById(int id) {
        // Implementasi untuk mengambil data berdasarkan ID
        return null; // Template: return null
    }

    /**
     * Ambil semua isi tabel mahasiswa dari database.
     * @return List yang berisi semua objek Mahasiswa.
     */
    public List<Mahasiswa> getAll() {
        // Implementasi untuk mengambil semua data
        return new ArrayList<>(); // Template: return list kosong
    }
}
