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
public class Tipo<TIPO> {
    private TIPO codigo;
    private TIPO nombre;
    
    public Tipo(){
    
    }
    
    public Tipo(TIPO codigo, TIPO nombre){
          this.codigo = codigo;
          this.nombre = nombre;
    }
    
    public TIPO getCodigo(){
    return this.codigo;
    }
    
    public TIPO getNombre(){
    return this.nombre;
    }
    
    public void setCodigo(TIPO codigo){
       this.codigo = codigo;
    }
    
    public void setNombre(TIPO nombre){
    this.nombre = nombre;
    }
}
