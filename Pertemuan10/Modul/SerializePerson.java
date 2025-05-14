package Pertemuan10.Modul;
import java.io.*;

// class SerializePerson
public class SerializePerson {
    // Person person = new Person("Panji"); // Remove this line or comment it out
    public static void main(String[] args) {
        Person person = new Person("Panji"); // Declare and initialize person here
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Serialized data is saved in person.ser");
            s.close(); // Closing ObjectOutputStream will also close the underlying FileOutputStream
            f.close(); // Explicitly closing f is also an option, but s.close() should handle it.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
