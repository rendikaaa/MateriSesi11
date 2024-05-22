/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author KOPUTER JARKOM 19
 */
public class Mobil {
    String merk;
    int harga, kecepatan;
    
    void setMerk (String brand){
        merk = brand;
    }
    
    void setHargaKecepatan (int harga, int kecepatan){
        this.harga = harga;
        this.kecepatan = kecepatan;
    }
    
    String getMerk(){ 
        return merk;
    }
    
    int getHarga (){
        return harga;
    }
    
    int getKecepatan (){
        return kecepatan;
    }
    
    void infoMobil(){
        System.out.println("Merk Mobil :" + merk);
        System.out.println("Harga      :" + getHarga());
        System.out.println("Kecepatan  :" + getKecepatan());
        System.out.println("---------------------------");
    }
}
