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
public class KentangFactory extends AbstractFactory{

    @Override
    KeripikKentang getKentang(String keripikKentang) {
        if(keripikKentang.equals(VarianKeripikKentang.KENTANG_ORI)){
            return new keripikKentangOriginal();
        }
        else
            if(keripikKentang.equals(VarianKeripikKentang.KENTANG_PEDAS)){
            return new keripikKentangPedas();
        }
        else
                if(keripikKentang.equals(VarianKeripikKentang.KENTANG_KEJU)){
            return new keripikKentangKeju();
        }
        return null;
    }

    @Override
    KeripikSingkong getSingkong(String keripikSingkong) {
        return null;
        
    }
    
}
