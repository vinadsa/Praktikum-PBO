/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 19 Februari 2025
 */
package Pertemuan2.TitikGaris;
public class Titik{
    /**********Atribut**********/
    private double absis;
    private double ordinat;
    private static int counterTitik;

    /**********METHOD**********/
    //Konstruktor untuk membuat titik(0, 0)
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //Konstruktor berparameter
    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        counterTitik++;
    }

    //Mengembalikan nilai absis
    public double getAbsis(){
        return absis;
    }

    //Mengembalikan nilai ordinat
    public double getOrdinat(){
        return ordinat;
    }

    //Mengembalikan nilai counter titik
    public static int getCounterTitik(){
        return counterTitik;
    }

    //Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x){
        absis = x;
    }

    //Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y){
        ordinat = y;
    }

    //Menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }
    
    //Mencetak koordinat titik
    public void PrintTitik(){
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    //Mengembalikan kuadran titik
    public int getKuadran(){
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
    public double getJarakPusat(){
        return Math.sqrt(getAbsis()*getAbsis() + getOrdinat()*getOrdinat()); //akar(x**2 + y**2)
    }

    //Mengembalikan nilai jarak antara dua titik
    public double getJarak(Titik T) {
        double dx = getAbsis() - T.getAbsis();
        double dy = getOrdinat() - T.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    } //Euclidean = akar((x1 - x2)**2 + (y1 - y2)**2)

    //Mengeset absis titik menjadi refleksinya
    public void refleksiX(){
        setAbsis(getAbsis() * -1);
    }

    //Mengeset ordinat titik menjadi refleksinya
    public void refleksiY(){
        setOrdinat(getOrdinat() * -1);
    }

    //Membuat titik baru yang berisi titik yang sudah di refleksikan X nya
    public Titik getRefleksiX(){
        Titik T = new Titik(this.getAbsis()*-1, this.getOrdinat());
        return T;
    }

    //Membuat titik baru yang berisi titik yang sudah di refleksikan Y nya
    public Titik getRefleksiY(){
        Titik T = new Titik(this.getAbsis(), this.getOrdinat()*-1);
        return T;
    }

} //end class titik

