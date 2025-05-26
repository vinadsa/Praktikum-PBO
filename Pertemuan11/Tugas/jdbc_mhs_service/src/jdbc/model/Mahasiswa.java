w/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;

/**
 *
 * @author asus
 */
public class Mahasiswa {

    // atribut
    private int id;
    private String nama;

    // Constructor
    public Mahasiswa() {
        // Konstruktor default
        this.id = 0; // Contoh inisialisasi default
        this.nama = ""; // Contoh inisialisasi default
    }

    public Mahasiswa(int id, String nama) {
        // Konstruktor dengan parameter
        this.id = id;
        this.nama = nama;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama=" + nama + '}';
    }
}
