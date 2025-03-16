/* Nama File    : BangunDatar.java
 * Deskripsi    : Superclass BangunDatar
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 14 Maret 2025
 */
package Pertemuan4.BangunDatar;

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar;

    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    public void setJmlSisi(int sisi) {
        this.jmlSisi = sisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
    

    // Soal 1
    // Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas Persegi dan Lingkaran?
    // Jawaban: Menambahkan final pada kelas BangunDatar membuatnya tidak dapat menggunakan inheritance, 
    ///         sehingga subclass Persegi dan Lingkaran tidak dapat mewarisi class BangunDatar

    //Soal 2
    //Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method
    //printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method printInfo() pada
    //kelas Persegi dan Lingkaran?
    //Jawaban: Setelah printInfo() diberikan keyword final, dampaknya adalah method tersebut tidak dapat 
    //         di override pada subkelas yang mencoba override method tersebut.
}
