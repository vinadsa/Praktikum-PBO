/* Nama File    : Kucing.java
 * Deskripsi    : Class Kucing, subclass dari Anabul
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 1 Mei 2025
 */
package Pertemuan8.Modul.Generik;

public class Kucing extends Anabul{
    public Kucing() {
        super();
    }

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println("Kucing bersuara: meong");
    }
    
    @Override
    public void bergerak() {
        System.out.println("Kucing bergerak dengan melata");
    }
}
