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
public abstract class AbstractFactory {
    abstract KeripikKentang getKentang(String keripikKentang);
    abstract KeripikSingkong getSingkong(String keripikSingkong);
    
}
