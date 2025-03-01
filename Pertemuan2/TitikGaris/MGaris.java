/* Nama File    : MGaris.java
 * Deskripsi    : Main class garis
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 19 Februari 2025
 */
package Pertemuan2.TitikGaris;
public class MGaris {
    public static void main(String[] args) {
        //Inisialisasi G1, G2, G3
            //Inisialisasi test konstruktor berparameter Garis(T1, T2)
            Titik T1 = new Titik(0, 0); //Untuk G2
            Titik T2 = new Titik(7, 7); //Untuk G2
            Titik T3 = new Titik(2, 5); //Untuk G3
            Titik T4 = new Titik(6, 1); //Untuk G3

        Garis G1 = new Garis();
        Garis G2 = new Garis(T1, T2); //Garis sejajar dengan G1
        Garis G3 = new Garis(T3, T4); //Garis tegak lurus dengan G1

        //Mutator
        G1.setTitik_Awal(2, 3);
        G1.setTitik_Akhir(4, 5);

        System.out.println("Garis 1: ");
        G1.printGaris();
        System.out.println("\nGaris 2: ");
        G2.printGaris();
        System.out.println("\nGaris 3: ");
        G3.printGaris();


        System.out.println("\nTest Selektor:");
        System.out.println("Memasukkan Titik awal dan akhir G1 ke T5 dan T6: ");
        Titik T5 = G1.getTitik_Awal();
        Titik T6 = G1.getTitik_Akhir();
        T5.PrintTitik();
        T6.PrintTitik();
        System.out.println("Counter garis: " + Garis.getcounterGaris());


        System.out.println("\nTest Methods:");
        
        System.out.println("Panjang dari garis G1: " + G1.getPanjang());
        System.out.println("Gradien dari G1: " + G1.getGradien());
        
        Titik T7 = G1.getTitikTengah();
        System.out.println("Titik Tengah G1: ");
        T7.PrintTitik();

        System.out.println("\nApakah G1 dan G2 sejajar?: " + G1.isSejajar(G2));
        System.out.println("Apakah G1 dan G2 tegak lurus?: " + G1.isTegakLurus(G2));
        System.out.println("\nApakah G1 dan G3 sejajar?: " + G1.isSejajar(G3));
        System.out.println("Apakah G1 dan G3 tegak lurus?: " + G1.isTegakLurus(G3));
    }   
}