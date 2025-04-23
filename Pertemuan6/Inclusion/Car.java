/* Nama File    : Car.java
 * Deskripsi    : Class Car, subclass Vehicle
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 23 April 2025
 */
package Pertemuan6.Inclusion;

public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("Harga sewa mobil = " + fare);
    }
}
