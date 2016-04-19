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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cesta c = new Cesta ( );
        c.adicionarItem (new Maca ( ));
        c.adicionarItem (new Maca ( ));
        c.adicionarItem (new Banana ( ));
        c.adicionarItem (new Banana ( ));
        c.adicionarItem (new Maca ( ));
        c.listarCesta( );
        
        System.out.println (c.calcularTotal());
    }
    
}
