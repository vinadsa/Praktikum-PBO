package Pertemuan9.Tugas;

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran(2);
        Persegi P1 = new Persegi(4);
        PersegiPanjang PP1 = new PersegiPanjang(4, 5);
        Segitiga S1 = new Segitiga(4, 5);

        //=====================================================================//
        BangunDatarGeneric<Lingkaran> bdg =
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(L1);
        System.out.println("keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());

        //=====================================================================//
        BangunDatarGeneric<Persegi> bdg1 = 
                new BangunDatarGeneric<Persegi>();
        bdg1.set(P1);
        System.out.println("keliling persegi : " + bdg1.hitungKeliling());
        System.out.println("tipe generic : " + bdg1.get().getClass().getName());

        //=====================================================================//
        BangunDatarGeneric<PersegiPanjang> bdg2 = 
                new BangunDatarGeneric<PersegiPanjang>();
        bdg2.set(PP1);
        System.out.println("keliling persegi panjang : " + bdg2.hitungKeliling());
        System.out.println("tipe generic : " + bdg2.get().getClass().getName());

        //=====================================================================//
        BangunDatarGeneric<Segitiga> bdg3 = 
                new BangunDatarGeneric<Segitiga>();
        bdg3.set(S1);
        System.out.println("keliling segitiga : " + bdg3.hitungKeliling());
        System.out.println("tipe generic : " + bdg3.get().getClass().getName());
    }
}
