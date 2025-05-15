/* Nama File    : ReadSerializedPerson.java
 * Deskripsi    : MainClass ReadSerializedPerson, untuk membaca data Person yang sudah diserialisasi
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 14 Mei 2025
 */
package Pertemuan10.Modul;

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person) s.readObject();
            s.close();
            System.out.println("serialized person name = " + person.getName());
        } catch (Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
