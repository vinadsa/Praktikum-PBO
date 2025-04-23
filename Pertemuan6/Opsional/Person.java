/* Nama File    : Person.java
 * Deskripsi    : Superclass Person
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 23 April 2025
 */
package Pertemuan6.Opsional;

public class Person {
    private String name;

    public Person(String name) { this.name = name; }
    public boolean isAsleep(int hr) { return 22 < hr || 7 > hr; }
    public String toString() { return name; }

    public void status(int hr)
    {
        if ( this.isAsleep(hr) )
            System.out.println("Now offline: " + this);
        else
            System.out.println("Now online: " + this);
    }
}
