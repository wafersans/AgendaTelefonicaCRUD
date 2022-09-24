/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author informatica
 */
public class Numero<NUMERO> {
    private int codigo;
    private NUMERO numero;
    private Tipo tipo;

    public Numero() {
        tipo = new Tipo();
    }

    public Numero(int codigo, NUMERO numero, Tipo tipo) {
        this.codigo = codigo;
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public NUMERO getNumero() {
        return numero;
    }

    public void setNumero(NUMERO numero) {
        this.numero = numero;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
}
