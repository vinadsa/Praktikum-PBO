/* Nama File    : Datum.java
 * Deskripsi    : Class Datum, class generik
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 1 Mei 2025
 */
package Pertemuan8.Modul.Generik;

class Datum<X>{
    X isi;
    public X getIsi(){
        return this.isi;
    }

    public void  setIsi(X x){
        this.isi = x;
    }
}
