/* Nama File    : SerializePerson.java
 * Deskripsi    : Class SerializePerson, untuk menyimpan objek Person ke dalam file
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 14 Mei 2025
 */
package Pertemuan10.Modul;
import java.io.*;

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Serialized data is saved in person.ser");
            s.close(); 
            f.close(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
