/* Nama File    : ExceptionOnArray.java
 * Deskripsi    : program penggunaan eksepsi menggunakan class library java
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 7 Maret 2025
 */
package Pertemuan3.Assertions_Exceptions;
public class ExceptionOnArray{
    public static void main(String[] args){
        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("Clean up code...");
        }
    }
}