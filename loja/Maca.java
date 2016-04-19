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
public class Maca extends Produto {
    private final double preco = 2.78;

    @Override
    public String toString ( ) {
        return "Maca";
    }

    public double getPreco ( ) {
        return preco;
    }
}
