/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KOPUTER JARKOM 19
 */
public class ObjekMobil {
    public static void main(String[] args){
        Mobil mobilku = new Mobil();
        mobilku.setMerk("Honda");
        mobilku.setHargaKecepatan(200, 0);
        
        Mobil mobilmu = new Mobil();
        mobilmu.setMerk("Avanza");
        mobilmu.setHargaKecepatan(200, 0);
        
        String merk = mobilku.getMerk();
        int harga = mobilku.getHarga();
        int kecepatan = mobilku.getKecepatan();
        
//        System.out.println("Merk Mobik: "+ merk);
//        System.out.println("Harga: "+ harga);
//        System.out.println("Kecepatan: "+kecepatan);

        mobilku.infoMobil();
        mobilmu.infoMobil();
    }
}
