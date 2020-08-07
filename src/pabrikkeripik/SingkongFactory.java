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
public class SingkongFactory extends AbstractFactory {


    @Override
    KeripikKentang getKentang(String keripikKentang) {
        return null;
        
    }

    @Override
    KeripikSingkong getSingkong(String keripikSingkong) {
        if(keripikSingkong.equals(VarianKeripikSingkong.SINGKONG_ORI)){
            return new keripikSingkongOriginal();
        }
        else
            if(keripikSingkong.equals(VarianKeripikSingkong.SINGKONG_MANIS)){
            return new keripikSingkongManis();
        }
        else
                if(keripikSingkong.equals(VarianKeripikSingkong.SINGKONG_PEDAS)){
            return new keripikSingkongPedas();
        }
        else
                    if(keripikSingkong.equals(VarianKeripikSingkong.SINGKONG_KEJU)){
            return new keripikSingkongKeju();        
    }
        return null;
    }
    
}
