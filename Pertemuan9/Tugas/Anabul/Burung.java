/* Nama File    : Burung.java
 * Deskripsi    : Class Burung, subclass dari Anabul
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 10 Mei 2025
 */
package Pertemuan9.Tugas.Anabul;

class Burung extends Anabul {
    public Burung() {
        super();
    }

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println("Burung bersuara: cuit");
    }
    
    @Override
    public void bergerak() {
        System.out.println("Burung bergerak dengan terbang");
    }
}
