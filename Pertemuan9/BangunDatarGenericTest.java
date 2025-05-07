package Pertemuan9;

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg =
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : "
                + bdg.hitungKeliling());
        System.out.println("tipe generic : "
                + bdg.get().getClass().getName());
    }
}
