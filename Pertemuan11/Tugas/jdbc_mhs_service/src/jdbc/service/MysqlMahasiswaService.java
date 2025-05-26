/* Nama File    : MysqlMahasiswaService.java
 * Deskripsi    : Service class untuk mengelola database mahasiswa
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 26 Mei 2025
 */
package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Service class untuk mengelola operasi database mahasiswa
 * @author Kevin Adi Santoso
 */
public class MysqlMahasiswaService {
    private Connection koneksi;

    /**
     * Constructor - inisialisasi koneksi database
     */
    public MysqlMahasiswaService() {
        this.koneksi = MysqlUtility.getConnection();
    }

    /**
     * Membuat objek mahasiswa dari ResultSet
     * @param rs ResultSet dari query database
     * @return Objek Mahasiswa
     * @throws SQLException jika terjadi error saat mengakses ResultSet
     */
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }

    /**
     * Menambahkan data mahasiswa ke database
     * @param mhs Objek Mahasiswa yang akan ditambahkan
     */
    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (nama) VALUES (?)";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Data mahasiswa berhasil ditambahkan");
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error saat menambah data: " + e.getMessage());
        }
    }

    /**
     * Update data mahasiswa di database
     * @param mhs Objek Mahasiswa yang akan diupdate
     */
    public void update(Mahasiswa mhs) {
        String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Data mahasiswa berhasil diupdate");
            } else {
                System.out.println("Data mahasiswa dengan ID " + mhs.getId() + " tidak ditemukan");
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error saat update data: " + e.getMessage());
        }
    }

    /**
     * Delete data mahasiswa sesuai id dari database
     * @param id ID Mahasiswa yang akan dihapus
     */
    public void delete(int id) {
        String query = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            int result = ps.executeUpdate();
            if (result > 0) {
                System.out.println("Data mahasiswa berhasil dihapus");
            } else {
                System.out.println("Data mahasiswa dengan ID " + id + " tidak ditemukan");
            }
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error saat hapus data: " + e.getMessage());
        }
    }

    /**
     * Ambil mahasiswa sesuai id dari database
     * @param id ID Mahasiswa yang dicari
     * @return Objek Mahasiswa atau null jika tidak ditemukan
     */
    public Mahasiswa getById(int id) {
        String query = "SELECT * FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                rs.close();
                ps.close();
                return mhs;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Error saat mengambil data: " + e.getMessage());
        }
        return null;
    }

    /**
     * Ambil semua isi tabel mahasiswa dari database
     * @return List yang berisi semua objek Mahasiswa
     */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMahasiswa = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                listMahasiswa.add(mhs);
            }
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Error saat mengambil semua data: " + e.getMessage());
        }
        return listMahasiswa;
    }

    /**
     * Menampilkan semua data mahasiswa
     */
    public void displayAllMahasiswa() {
        List<Mahasiswa> listMahasiswa = getAll();
        if (listMahasiswa.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa");
        } else {
            System.out.println("=== DAFTAR MAHASISWA ===");
            for (Mahasiswa mhs : listMahasiswa) {
                System.out.println(mhs.toString());
            }
        }
    }

    /**
     * Menutup koneksi database
     */
    public void closeConnection() {
        MysqlUtility.closeConnection();
    }
}
