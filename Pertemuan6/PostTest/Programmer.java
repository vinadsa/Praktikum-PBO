package Pertemuan6.PostTest;

public class Programmer extends Pegawai {
    private int bonus = 450000;

    // Constructor tanpa parameter
    public Programmer() {
        super();
    }

    // Constructor dengan parameter
    public Programmer(String nama) {
        super(nama);
    }

    // Selektor (getter) untuk bonus
    public int getBonus() {
        return bonus;
    }

    // Mutator (setter) untuk bonus
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void tampilData() {
        super.tampilData(); // Memanggil metode tampilData() dari kelas Pegawai
        System.out.println("Bonus: " + bonus);
    }
}
