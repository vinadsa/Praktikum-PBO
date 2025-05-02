/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medium;

/* Nama File    : KontrolSenjata.java
 * Deskripsi    : Class KontrolSenjata
 * Pembuat      : Kevin Adi Santoso/24060123130081
 * Tanggal      : 1 Mei 2025
 */

/**
 *
 * @author asus
 */
public class KontrolSenjata {
    protected Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return this.senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumlah) {
        this.senjata.setPeluru(this.senjata.getPeluru() + jumlah);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
        
    }
    
    public void menembak(int jumlah) {
        if(this.senjata.getPeluru() > 0){
            System.out.println(">> Siap menembak " + jumlah + " kali");
            for (int i = 0; i < jumlah; i++) {
                if(this.senjata.getPeluru() <= 0){
                    System.out.println("Gagak tembak, Peluru Habis");
                }
                else{
                    System.out.println(this.senjata.getBunyi());
                    this.senjata.setPeluru(this.senjata.getPeluru() - 1);
                }
            }
            System.out.println(">> Peluru sisa: " + this.senjata.getPeluru());
        }
        else{
            System.out.println(">> Siap menembak " + jumlah + " kali");
            System.out.println("Peluru Habis");
        }
    }
    
    public String menusuk() {
        if(this.senjata.isMenusuk()) {
            return "Jleb!";
        }
        else{
            return "Gagal, belum terpasang bayonet";
        }
    }
    
    public void pasangBayonet() {
        this.senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}

