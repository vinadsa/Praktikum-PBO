/* Nama File    : Vehicle.java
 * Deskripsi    : Superclass Vehicle
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 23 April 2025
 */
package Pertemuan6.Inclusion;

public class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("Vehicle price = " + fare);
    }
}
