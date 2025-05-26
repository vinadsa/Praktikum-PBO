/* Nama File    : MysqlUtility.java
 * Deskripsi    : Utility class untuk koneksi MySQL database
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 26 Mei 2025
 */
package jdbc.utilities;

import java.sql.*;

/**
 * Utility class untuk mengelola koneksi database MySQL
 * @author Kevin Adi Santoso
 */
public class MysqlUtility {

    private static Connection koneksi;

    /**
     * Mendapatkan koneksi database MySQL menggunakan singleton pattern
     * @return Connection object
     */
    public static Connection getConnection() {
        if (koneksi == null) {
            try {
                // Menggunakan driver MySQL yang lebih baru
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs?useSSL=false&serverTimezone=UTC";
                // sesuaikan username dan password
                String user = "student";
                String password = "rahasia";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }

    /**
     * Menutup koneksi database
     */
    public static void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                koneksi = null;
                System.out.println("Koneksi ditutup");
            } catch (SQLException sqle) {
                System.out.println("Gagal menutup koneksi : " + sqle.getMessage());
            }
        }
    }

    /**
     * Mendapatkan koneksi baru (bukan singleton)
     * @return Connection object baru
     * @throws Exception jika terjadi error saat membuat koneksi
     */
    public static Connection getNewConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbc_mhs?useSSL=false&serverTimezone=UTC";
        String user = "student";
        String password = "rahasia";
        return DriverManager.getConnection(url, user, password);
    }
}
