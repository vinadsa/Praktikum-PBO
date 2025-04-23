/* Nama File    : Percobaan.java
 * Deskripsi    : Class Percobaan, untuk ngetes penggunaan Coercion
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 23 April 2025
 */
package Pertemuan6.Coercion;

public class Percobaan {
    public static void main(String[] args) {
        // 1. int output = 'a';
        int output1 = 'a';
        System.out.println("1: " + output1); // Output: 97

        // 2. double x = 15.5;
        // int output = x; --> Error, tidak bisa coercion dari double ke int tanpa casting
        // double x = 15.5;
        // int output2 = x;
        // System.out.println("2: " + output2);

        // 3. int y = 25;
        // double output = y; --> Berhasil, coercion dari int ke double dilakukan otomatis
        int y = 25;
        double output3 = y;
        System.out.println("3: " + output3); // Output: 25.0

        // 4. int z = 78;
        // char output = (char) z; --> Berhasil, explicit casting dari int ke char
        int z = 78;
        char output4 = (char) z;
        System.out.println("4: " + output4); // Output: N (karena ASCII 78 adalah 'N')

        // 5. char a = 'a';
        // double output = a; --> Berhasil, char ke double dilakukan secara implisit (ASCII value)
        char a = 'a';
        double output5 = a;
        System.out.println("5: " + output5); // Output: 97.0
    }
}

