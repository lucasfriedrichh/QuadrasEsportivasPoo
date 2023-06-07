/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.upf.ccc.app168238.exception;

/**
 *
 * @author 168238
 */
public class ValorNegativoException extends Exception {
    public ValorNegativoException() {
        super("Valor não pode ser negativo!");
    }
}