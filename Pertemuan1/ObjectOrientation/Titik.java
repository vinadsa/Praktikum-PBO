/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 19 Februari 2025
 */
package Pertemuan1.ObjectOrientation;
public class Titik{
    /**********Atribut**********/
    double absis;
    double ordinat;
    static int counterTitik;

    /**********METHOD**********/
    //Konstruktor untuk membuat titik(0, 0)
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //Konstruktor berparameter
    Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    //Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }

    //Mengembalikan nilai ordinat
    double getOrdinat(){
        return ordinat;
    }

    //Mengembalikan nilai counter titik
    static int getCounterTitik(){
        return counterTitik;
    }

    //Mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }

    //Mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y){
        ordinat = y;
    }

    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    
    //Mencetak koordinat titik
    void PrintTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    //Mengembalikan kuadran titik
    int getKuadran(){
        if (getAbsis() >= 0 && getOrdinat() >= 0){
            return 1;
        }
        else if (getAbsis() < 0 && getOrdinat() >= 0) {
            return 2;
        } 
        else if (getAbsis() < 0 && getOrdinat() < 0) {
            return 3;
        } 
        else {
            return 4;
        }
    }

    //Mengembalikan nilai jarak titik ke pusat
    double getJarakPusat(){
        return Math.sqrt(getAbsis()*getAbsis() + getOrdinat()*getOrdinat()); //akar(x**2 + y**2)
    }

    //Mengembalikan nilai jarak antara dua titik
    double getJarak(Titik T) {
        double dx = getAbsis() - T.getAbsis();
        double dy = getOrdinat() - T.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    } //Euclidean = akar((x1 - x2)**2 + (y1 - y2)**2)

    //Mengeset absis titik menjadi refleksinya
    void refleksiX(){
        setAbsis(getAbsis() * -1);
    }

    //Mengeset ordinat titik menjadi refleksinya
    void refleksiY(){
        setOrdinat(getOrdinat() * -1);
    }

    //Membuat titik baru yang berisi titik yang sudah di refleksikan X nya
    Titik getRefleksiX(){
        Titik T = new Titik(this.getAbsis()*-1, this.getOrdinat());
        return T;
    }

    //Membuat titik baru yang berisi titik yang sudah di refleksikan Y nya
    Titik getRefleksiY(){
        Titik T = new Titik(this.getAbsis(), this.getOrdinat()*-1);
        return T;
    }

} //end class titik


