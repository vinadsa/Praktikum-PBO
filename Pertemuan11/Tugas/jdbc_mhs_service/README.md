# JDBC Mahasiswa Service

Proyek ini adalah implementasi layanan (service) untuk mengelola data mahasiswa menggunakan Java Database Connectivity (JDBC) dengan MySQL database.

## Struktur Proyek

```
jdbc_mhs_service/
├── src/
│   └── jdbc/
│       ├── model/
│       │   └── Mahasiswa.java        # Model/Entity class
│       ├── utilities/
│       │   └── MysqlUtility.java     # Database connection utility
│       ├── service/
│       │   └── MysqlMahasiswaService.java  # Service layer untuk operasi database
│       └── program/
│           └── Program.java          # Main program untuk testing
├── database_setup.sql                # Script SQL untuk setup database
└── README.md                         # Dokumentasi ini
```

## Komponen Utama

### 1. Mahasiswa.java (Model)
- Model class untuk entitas Mahasiswa
- Atribut: `id`, `nama`
- Constructor, getter, setter, dan toString method

### 2. MysqlUtility.java (Database Utility)
- Utility class untuk mengelola koneksi database MySQL
- Menggunakan singleton pattern untuk koneksi
- Support untuk koneksi baru (non-singleton)
- Method untuk menutup koneksi

### 3. MysqlMahasiswaService.java (Service Layer)
- Service class untuk operasi CRUD mahasiswa
- Method yang tersedia:
  - `add(Mahasiswa mhs)` - Menambah data mahasiswa
  - `update(Mahasiswa mhs)` - Update data mahasiswa
  - `delete(int id)` - Hapus data berdasarkan ID
  - `getById(int id)` - Ambil data berdasarkan ID
  - `getAll()` - Ambil semua data mahasiswa
  - `displayAllMahasiswa()` - Tampilkan semua data
  - `makeMhsObject(ResultSet rs)` - Konversi ResultSet ke objek Mahasiswa

### 4. Program.java (Main Program)
- Program utama untuk testing semua fitur service
- Contoh implementasi semua operasi CRUD

## Setup Database

### 1. Konfigurasi MySQL
Pastikan MySQL server berjalan dengan konfigurasi:
- Host: `localhost`
- Port: `3306`
- Database: `jdbc_mhs`
- Username: `student`
- Password: `rahasia`

### 2. Jalankan Script SQL
Jalankan file `database_setup.sql` di MySQL Workbench atau command line:

```sql
source database_setup.sql;
```

### 3. Struktur Tabel
```sql
CREATE TABLE mahasiswa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nama VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
```

## Cara Menjalankan

### 1. Prerequisites
- Java Development Kit (JDK) 8 atau lebih baru
- MySQL Server
- MySQL JDBC Connector (sudah include dalam project dependencies)

### 2. Compile dan Run
```bash
# Compile
javac -cp "mysql-connector-java-8.0.33.jar" src/jdbc/program/Program.java

# Run
java -cp ".:mysql-connector-java-8.0.33.jar:src" jdbc.program.Program
```

### 3. Testing dengan NetBeans
1. Buka project di NetBeans
2. Pastikan MySQL connector sudah ditambahkan ke classpath
3. Run file `Program.java`

## Fitur yang Diimplementasi

### ✅ CRUD Operations
- **Create**: Menambah data mahasiswa baru
- **Read**: Membaca data mahasiswa (single/all)
- **Update**: Mengubah data mahasiswa
- **Delete**: Menghapus data mahasiswa

### ✅ Database Connection Management
- Singleton pattern untuk koneksi efisien
- Error handling yang proper
- Resource management (closing connections)

### ✅ Object-Oriented Design
- Separation of concerns (Model-Service-Utility)
- Encapsulation dan abstraction
- Clean code practices

### ✅ Exception Handling
- SQL exception handling
- User-friendly error messages
- Graceful error recovery

## Pola Arsitektur

Proyek ini menggunakan pola arsitektur berlapis (layered architecture):

1. **Model Layer** (`jdbc.model`): Entitas/model data
2. **Service Layer** (`jdbc.service`): Business logic dan operasi database
3. **Utility Layer** (`jdbc.utilities`): Helper classes dan utilities
4. **Presentation Layer** (`jdbc.program`): User interface/main program

## Dependencies

- **MySQL Connector/J 8.0.33**: Driver JDBC untuk MySQL
- **Java SQL API**: Standard JDBC interfaces

## Author

**Kevin Adi Santoso / 24060123130081**  
Praktikum PBO - Pertemuan 11  
Tanggal: 26 Mei 2025
