/* Nama File    : MTitik.java
 * Deskripsi    : Main class titik
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 19 Februari 2025
 */
package Pertemuan1.ObjectOrientation;
public class MTitik{
    public static void main(String[] args){
        
        //Inisialisasi T1
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        
        //Inisialisasi T2
        Titik T2 = new Titik(3, 5);
        
        System.out.println("T1:");
        T1.PrintTitik();
        System.out.println("Menggeser T1:");
        T1.geser(3, 4);
        T1.PrintTitik();

        System.out.println("\nT2:");
        T2.PrintTitik();
        System.out.println("Overwrite T2 dengan (10, 10): ");
        T2.setAbsis(10);
        T2.setOrdinat(10);
        T2.PrintTitik();

        System.out.println("\nJumlah objek Titik = " + Titik.getCounterTitik());
        System.out.println("Kuadran Titik T1 = " + T1.getKuadran());
        System.out.println("Jarak T1 ke pusat = " + T1.getJarakPusat());
        System.out.println("Jarak T1 ke T2 = " + T1.getJarak(T2));


        System.out.println("\nMerefleksikan X T1:");
        T1.refleksiX();
        T1.PrintTitik();

        System.out.println("\nMerefleksikan Y T2:");
        T2.refleksiY();
        T2.PrintTitik();

        System.out.println("\nTitik baru T3 hasil dari refleksi X titik T1: ");
        Titik T3 = T1.getRefleksiX();
        T3.PrintTitik();

        System.out.println("\nTitik baru T4 hasil dari refleksi Y titik T1: ");
        Titik T4 = T1.getRefleksiY();
        T4.PrintTitik();

    }
}