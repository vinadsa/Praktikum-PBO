/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanTutorial;

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
    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
    }
    
    private void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    private void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }
    
    private String getBunyi() {
        return this.bunyi;
    }
    
    private boolean isMenusuk() {
        return this.menusuk;
    }

    public void menembak(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.print(getBunyi() + " ");
        }
        System.out.println("");
    }
    
    public String menusuk() {
        if(isMenusuk()) {
            return "Jleb!";
        }
        else{
            return "Gagal, belum terpasang bayonet";
        }
    }
    
    public void pasangBayonet() {
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}

