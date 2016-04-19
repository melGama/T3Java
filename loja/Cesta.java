/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

public class Cesta {
    private int total = 0;
    final int cheio   = 12;
    private Produto[ ] prods = new Produto[ 12 ];
    
    public boolean adicionarItem (Produto prod) {
        boolean sucesso = false;
        
        for (int indice = 0; indice < cheio; indice += 1) {
            if (prods[ indice ] == null) {
                if (total == cheio) {
                    break;
                }
                
                prods[ indice ] = prod;
                total += 1;
                sucesso = true;
                break;
            }

            if (prods[ indice ].toString ( ).equals (prod.toString ( ))) {
                prods[ indice ].setQtde (prods[ indice ].getQtde() + 1);
                total += 1;
                break;
            }
        }
        
        return sucesso;
    }

    public double calcularTotal ( ) {
        double preco = 0.0;

        for (int i = 0; i < total; i++) {
            if (prods[ i ] == null) {
                break;
            }

            preco += (prods[ i ].getPreco ( ) * prods[ i ].getQtde ( ));
        }
        
        return preco;
    }

    public void listarCesta ( ) {
        String temp = "";

        for (int i = 0; i < total; i++) {
            if (prods[ i ] == null) {
                break;
            }

            temp = temp + "Tipo: " + prods[ i ].toString ( ) + "\n";
            temp = temp + "Qtde: " + prods[ i ].getQtde ( ) + "\n";
            temp = temp + "Preco: " + prods[ i ].getPreco( ) + "\n\n";
        }

        System.out.println (temp);
    }
}
