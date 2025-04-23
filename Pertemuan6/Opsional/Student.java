/* Nama File    : Student.java
 * Deskripsi    : Class Student, subclass Person
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 23 April 2025
 */
package Pertemuan6.Opsional;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public boolean isAsleep(int hr) // override
    {
        return 2 < hr && 8 > hr;
    }
}
