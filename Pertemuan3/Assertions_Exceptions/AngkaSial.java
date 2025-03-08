/* Nama File    : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri, pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 7 Maret 2025
 */
package Pertemuan3.Assertions_Exceptions;
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }    

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}

// Jawaban: Ketika terjadi eksepsi, baris ke-12 tidak akan dieksekusi karena program akan langsung melompat ke blok catch. 
// Baris ke-21 akan dieksekusi ketika terjadi eksepsi, masuk ke blok catch.