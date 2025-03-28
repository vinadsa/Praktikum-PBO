package Responsi;

public class Mahasiswa extends CivitasAkademika{
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int counterMahasiswa = 0;

    // Konstruktor
    public Mahasiswa() {
        super();
        nim = "";
        semester = 0;
        fakultas = new Fakultas();
        counterMahasiswa++;
    }

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counterMahasiswa++;
    }

    // Selektor
    public String getNim() {
        return nim;
    }
    public int getSemester() {
        return semester;
    }
    public Fakultas getFakultas() {
        return fakultas;
    }

    // Mutator
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    // Method menghitung UKT mahasiswa
    public double hitungUKT() {
        double persenan = (semester - 1) * 0.05;
        return fakultas.getTarifUKT() - (fakultas.getTarifUKT() * persenan);
    }

    // Method untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("=====================================");
        super.displayInfo();
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("UKT: " + hitungUKT());
    }

    // Selektor counter
    public static int getCounterMahasiswa() {
        return counterMahasiswa;
    }
}
