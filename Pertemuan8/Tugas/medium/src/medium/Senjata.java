/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/* Nama File    : Senjata.java
 * Deskripsi    : Class Senjata
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 1 Mei 2025
 */

/**
 *
 * @author asus
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
    }
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    public String getBunyi() {
        return this.bunyi;
    }
    
    public int getPeluru() {
        return this.peluru;
    }
    
    public boolean isMenusuk() {
        return this.menusuk;
    }

}

