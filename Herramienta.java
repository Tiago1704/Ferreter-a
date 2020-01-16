/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ferreteria;

import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public abstract class Herramienta {
    
   ArrayList Nombre;
   ArrayList Descripcion;
   ArrayList Valor;

    public Herramienta(ArrayList Nombre, ArrayList Descripcion, ArrayList Valor) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Valor = Valor;
    }

    public ArrayList getNombre() {
        return Nombre;
    }

    public void setNombre(ArrayList Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(ArrayList Descripcion) {
        this.Descripcion = Descripcion;
    }

    public ArrayList getValor() {
        return Valor;
    }

    public void setValor(ArrayList Valor) {
        this.Valor = Valor;
    }
   
   public abstract void IngresarNombre(String N);
   public abstract void IngresarDescripcion(String D);
   public abstract void IngresarValor(int E);
   public abstract void EliminarNombre(String N);
   public abstract void EliminarDescripcion(String D);
   public abstract void EliminarValor(int E);
   public abstract String BuscarHerramienta(String N, String D, int E);
   
    
}
