/* Nama File    : IResize.java
 * Deskripsi    : Interface IResize
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 22 Maret 2025
 */
package Pertemuan5.BangunDatar;

public interface IResize {
    //menambah ukuran 10%
    public void zoomIn();

    //mengurangi ukuran 10%
    public void zoomOut();

    //menskalakan ukuran sesuai dengan input percent
    public void zoom(int percent);
}

// Soal Interface:
// Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize
// dibanding dijadikan sebagai abstract method dalam class BangunDatar?
// Jawab: Memberikan fleksibilitas yang lebih dibandingkan dgn membuatnya abstract method karena kita
// dapat mengimplementasikannya tanpa harus menjadi subclass BangunDatar. Ini juga mendukung multiple inheritance
// dan pemeliharaan code yang lbih baik.