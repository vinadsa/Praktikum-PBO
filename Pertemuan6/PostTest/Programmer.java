package Pertemuan6.PostTest;

public class Programmer extends Pegawai {
    private int bonus = 450000;

    // Konstruktor
    public Programmer() {
        super();
    }

    public Programmer(String nama) {
        super(nama);
    }

    // Selektor 
    public int getBonus() {
        return bonus;
    }

    // Mutator 
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: " + bonus);
    }
}
