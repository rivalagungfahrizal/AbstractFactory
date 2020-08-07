/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pabrikkeripik;

/**
 *
 * @author Rival-PC
 */
public class FactoryProduksi {
    public static final String PILIH_KENTANG = "Pilih Varian Keripik Kentang";
    public static final String PILIH_SINGKONG = "Pilih Varian Keripik Singkong";
    
public static AbstractFactory getFactory(String pilihan){
    if(pilihan.equals(PILIH_KENTANG)){
        return new KentangFactory();
    }
    else
        if(pilihan.equals(PILIH_SINGKONG)){
        return new SingkongFactory();
    }
        return null;
}
    
}
