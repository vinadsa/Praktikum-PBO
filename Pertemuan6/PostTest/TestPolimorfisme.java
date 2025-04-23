/* Nama File    : TestPolimorfisme.java
 * Deskripsi    : Main class TestPolimorfisme
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 23 April 2025
 */
package Pertemuan6.PostTest;

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);
        
        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

// SOAL 1: Jelaskan manfaat polimorfisme pada kasus ini!
// Manfaat polimorfisme pada kasus ini adalah memungkinkan objek Programmer dan Manajer disimpan dalam satu list tipe Pegawai,
// sehingga metode tampilData() bisa dipanggil secara dinamis sesuai jenis objeknya tanpa menggunakan casting atau checking tipe. 
// Akibatnya kode lebih ringkas, fleksibel, dan mudah dikembangkan.


// SOAL 2: Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa
// permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
// Tanpa polimorfisme, penambahan pegawai4 dan pegawai5 mengharuskan pembuatan list dan loop terpisah  
// untuk tiap jenis pegawai serta penggunaan instanceof dan casting. 
// Akibatnya membuat kode menjadi duplikatif, sulit dipelihara, dan tidak efisien.