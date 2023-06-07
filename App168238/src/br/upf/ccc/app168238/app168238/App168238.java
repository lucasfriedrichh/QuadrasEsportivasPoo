/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.upf.ccc.app168238.app168238;

import br.upf.ccc.app168238.dominio.CompraAprazo;
import br.upf.ccc.app168238.dominio.CompraAvista;

import java.util.ArrayList;
import java.util.List;

public class App168238 {
    public static void main(String[] args) {
        
        List<Object> listaCompra = new ArrayList<Object>();
        
        CompraAvista compraAvista = new CompraAvista(10, "Carrinho", 8f, 20f);
        compraAvista.setDesconto(0);
        Float totalAvista = compraAvista.calcularTotal();
        listaCompra.add(compraAvista);
        
        
        CompraAprazo compraAprazo = new CompraAprazo(1, "Boneca", 5f, 50f);
        compraAprazo.setNumeroParcelas(2);
        Float parcela = compraAprazo.calcularValorParcelas();
        Float totalAprazo = compraAprazo.calcularTotal();
        listaCompra.add(compraAprazo);
        
        for (Object compra : listaCompra) {
            if (compra.equals(compraAprazo)) {
                System.out.println("É uma compra a prazo de " + compraAprazo.getNomeMercadoria()
                        + " no valor de " + parcela
                        + " em " + compraAprazo.getNumeroParcelas() + " parcelas");
            }else if(compra.equals(compraAvista)){
                System.out.println("É uma compra a vista de "
                        + compraAvista.getNomeMercadoria() + " no valor de " + totalAvista);
            }
        }
    }
}
