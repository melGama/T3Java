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
public abstract class Produto {
    private int qtde;

    public Produto ( ) {
        this.qtde = 1;
    }

    public abstract double getPreco ( );

    public void setQtde (int qtde) {
        this.qtde = qtde;
    }

    public int getQtde ( ) {
        return qtde;
    }
}
