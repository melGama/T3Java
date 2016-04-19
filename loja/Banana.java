/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author 1410478300060
 */
public class Banana extends Produto {
    private final double preco = 1.54;
    
    @Override
    public String toString ( ) {
        return "Banana";
    }

    public double getPreco ( ) {
        return preco;
    }
}
