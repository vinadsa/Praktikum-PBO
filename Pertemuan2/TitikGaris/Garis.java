/* Nama File    : Garis.java
* Deskripsi    : berisi atribut dan method dalam class Garis
* Pembuat      : Kevin Adi Santoso/24060123130081
* Tanggal      : 19 Februari 2025
*/
package Pertemuan2.TitikGaris;
public class Garis {
    /**********Atribut**********/
    private Titik T_awal;
    private Titik T_akhir;
    private static int counterGaris;
    
    /**********METHOD**********/
    //Konstruktor objek garis
    public Garis(){
        T_awal = new Titik();
        T_akhir = new Titik(1, 1);
        counterGaris++;
    }

    //Konstruktor berparameter
    public Garis(Titik T1, Titik T2){
        T_awal = T1;
        T_akhir = T2;
        counterGaris++;
    }

    //SELECTOR
    public Titik getTitik_Awal(){ //Mengembalikan titik awal
        return this.T_awal;
    }
    
    public Titik getTitik_Akhir(){ //Mengembalikan titik akhir
        return this.T_akhir;
    }

    public static int getcounterGaris(){ //Mengembalikan nilai counter garis
        return counterGaris;
    }

    //MUTATOR
    public void setTitik_Awal(double x, double y){ //Mengeset titik awal dengan nilai x dan y
        T_awal.setAbsis(x);
        T_awal.setOrdinat(y);
    }

    public void setTitik_Akhir(double x, double y){ //mengeset titik akhir dengan nilai x dan y
        T_akhir.setAbsis(x);
        T_akhir.setOrdinat(y);
    }

    public double getPanjang(){ //Mengembalikan nilai panjang garis
        return T_akhir.getJarak(T_awal);
    }

    public double getGradien(){ //Mengembalikan gradien garis
        if (T_awal.getAbsis() != T_akhir.getAbsis()){
            return (double) (T_akhir.getOrdinat() - T_awal.getOrdinat()) / (T_akhir.getAbsis() - T_awal.getAbsis());
        }
        else{
            throw new ArithmeticException("Garis vertikal, gradien tidak terdefinisi.");
        }
    }

    public Titik getTitikTengah() { //Mengembalikan sebuat titik yang merupakan titik tengah garis
        double xTengah = (T_awal.getAbsis() + T_akhir.getAbsis()) / 2.0;
        double yTengah = (T_awal.getOrdinat() + T_akhir.getOrdinat()) / 2.0;
        return new Titik(xTengah, yTengah);
    }

    public boolean isSejajar(Garis G){ //Mengembalikan true bila sejajar dengan garis G dan false jika sebaliknya
        return this.getGradien() == G.getGradien();
    }

    public boolean isTegakLurus(Garis G){ //Mengembalikan true bila tegak lurus dengan garis G dan false jika sebaliknya
        return this.getGradien() * G.getGradien() == -1;
    }

    public void printGaris(){ //Mencetak garis(titik awal dan akhir)
        System.out.println("Titik awal:");
        T_awal.PrintTitik();
        System.out.println("Titik akhir:");
        T_akhir.PrintTitik();
    }

    public void printPersamaanGaris(){ //Mencetak string persamaan garis
        double m = this.getGradien();
        double c = T_awal.getOrdinat() - (m * T_awal.getAbsis()); //menggunakan titik 1
        System.out.println("y = " + m + "x + " + c);
    }

} //end class garis