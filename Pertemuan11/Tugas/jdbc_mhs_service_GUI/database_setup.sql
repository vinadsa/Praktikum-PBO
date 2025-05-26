-- Database setup untuk JDBC Mahasiswa Service
-- Nama File    : database_setup.sql
-- Deskripsi    : Script SQL untuk membuat database dan tabel mahasiswa
-- Pembuat      : Kevin Adi Santoso/24060123130081
-- Tanggal      : 26 Mei 2025

-- Membuat database (jika belum ada)
CREATE DATABASE IF NOT EXISTS jdbc_mhs;

-- Menggunakan database
USE jdbc_mhs;

-- Membuat tabel mahasiswa
CREATE TABLE IF NOT EXISTS mahasiswa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- Insert data sample (opsional)
INSERT INTO mahasiswa (nama) VALUES 
('John Doe'),
('Jane Smith'),
('Bob Johnson');

-- Membuat user untuk koneksi (sesuaikan dengan konfigurasi di MysqlUtility)
-- CREATE USER IF NOT EXISTS 'student'@'localhost' IDENTIFIED BY 'rahasia';
-- GRANT ALL PRIVILEGES ON jdbc_mhs.* TO 'student'@'localhost';
-- FLUSH PRIVILEGES;

-- Menampilkan struktur tabel
DESCRIBE mahasiswa;

-- Menampilkan data yang ada
SELECT * FROM mahasiswa;
