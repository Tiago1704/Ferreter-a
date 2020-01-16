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
public class NuevoMaterial extends Materiales{

    public NuevoMaterial(ArrayList Nombre, ArrayList Descripcion, ArrayList Valor) {
        super(Nombre, Descripcion, Valor);
    }

    @Override
    public void IngresarNombre(String N) {
        super.Nombre.add(N);
    }

    @Override
    public void IngresarDescripcion(String D) {
        super.Descripcion.add(D);
    }

    @Override
    public void IngresarValor(int E) {
        super.Valor.add(E);
    }

    @Override
        public void EliminarNombre(String N) {
        super.Nombre.remove(super.Nombre.indexOf(N));
    }

    @Override
    public void EliminarDescripcion(String D) {
        super.Descripcion.remove(super.Descripcion.indexOf(D));
    }

    @Override
    public void EliminarValor(int E) {
        super.Valor.remove(super.Valor.indexOf(E));
    }

    @Override
    public String BuscarMaterial(String N, String D, int E) {
        String BuscarMaterial = "";
        if (super.Nombre.contains(N) == true){
            BuscarMaterial = super.Nombre.get(super.Nombre.indexOf(N) + super.Descripcion.indexOf(D) + super.Valor.indexOf(E)).toString();
        }else{
            BuscarMaterial = "No existe este Material";
        }
        return BuscarMaterial;
    }
    }
