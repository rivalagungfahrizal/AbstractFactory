/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pabrikkeripik;
import java.lang.*;
/**
 *
 * @author Rival-PC
 */
public class PabrikKeripik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //pilih varian kentang
        AbstractFactory kentangFactory = FactoryProduksi.getFactory(FactoryProduksi.PILIH_KENTANG);
        
        KeripikKentang order1 = kentangFactory.getKentang(VarianKeripikKentang.KENTANG_ORI);
        order1.varianKentang();
        
        KeripikKentang order2 = kentangFactory.getKentang(VarianKeripikKentang.KENTANG_PEDAS);
        order2.varianKentang();
        
        KeripikKentang order3 = kentangFactory.getKentang(VarianKeripikKentang.KENTANG_KEJU);
        order3.varianKentang();
        
        //pilih varian singkong
        AbstractFactory singkongFactory = FactoryProduksi.getFactory(FactoryProduksi.PILIH_SINGKONG);
        
        KeripikSingkong order4 = singkongFactory.getSingkong(VarianKeripikSingkong.SINGKONG_ORI);
        order4.varianSingkong();
        
        KeripikSingkong order5 = singkongFactory.getSingkong(VarianKeripikSingkong.SINGKONG_MANIS);
        order5.varianSingkong();
        
        KeripikSingkong order6 = singkongFactory.getSingkong(VarianKeripikSingkong.SINGKONG_PEDAS);
        order6.varianSingkong();
        
        KeripikSingkong order7 = singkongFactory.getSingkong(VarianKeripikSingkong.SINGKONG_KEJU);
        order7.varianSingkong();
    }
    
}
