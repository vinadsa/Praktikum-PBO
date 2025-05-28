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
     */
    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }

    /**
     * Menambahkan data mahasiswa ke database
     */
    public void add(Mahasiswa mhs) {
        String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());
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
     * Reset indeks ID mahasiswa di database agar berurutan mulai dari 1
     * dan update ID pada tabel mahasiswa.
     */
    public void resetIndeks() {
        try {
            // ambil semua data mahasiswa terurut ID lama
            List<Mahasiswa> listMahasiswa = new ArrayList<>();
            String selectQuery = "SELECT * FROM mahasiswa ORDER BY id ASC";
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject(rs);
                listMahasiswa.add(mhs);
            }
            rs.close();
            stmt.close();

            // update id mahasiswa satu per satu
            int newId = 1;
            for (Mahasiswa mhs : listMahasiswa) {
                PreparedStatement ps = koneksi.prepareStatement("UPDATE mahasiswa SET id = ? WHERE id = ?");
                ps.setInt(1, newId);
                ps.setInt(2, mhs.getId());
                ps.executeUpdate();
                ps.close();
                newId++;
            }

            System.out.println("Indeks ID mahasiswa berhasil direset dan diurutkan ulang.");
        } catch (SQLException e) {
            System.out.println("Error saat reset indeks: " + e.getMessage());
        }
    }

    /**
     * Menutup koneksi database
     */
    public void closeConnection() {
        MysqlUtility.closeConnection();
    }
}
