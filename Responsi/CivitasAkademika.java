package Responsi;

public abstract class CivitasAkademika {
    protected String nama;
    protected String email;

    // Konstruktor
    public CivitasAkademika() {
        this.nama = "";
        this.email = "";
    }

    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }

    // Selector
    public String getNama() {
        return nama;
    }
    public String getEmail() {
        return email;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Method
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}
