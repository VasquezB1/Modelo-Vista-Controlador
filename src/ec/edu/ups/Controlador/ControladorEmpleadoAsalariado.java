/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.clases.EmpleadoAsalariado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Byron PC
 */
public class ControladorEmpleadoAsalariado {
    
   
     private List<EmpleadoAsalariado> lista;

    public ControladorEmpleadoAsalariado() {
        lista = new ArrayList<>();
    }

    public void create(EmpleadoAsalariado objeto) {
        
        lista.add(objeto);
        
    }

    public EmpleadoAsalariado read(String nombre) {
        for (EmpleadoAsalariado empleadoasalariado : lista) {
            if (empleadoasalariado.getNombre().equals(nombre)) {
                return empleadoasalariado;
            }
        }
        return null;
    }

    public void update(EmpleadoAsalariado objeto) {
        for (int i = 0; i < lista.size(); i++) {
            EmpleadoAsalariado elemento = lista.get(i);
            if (elemento.getNombre().equals(objeto.getNombre())) {
                lista.set(i, objeto);
                break;
            }
        }
    }

    public void delete(String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            EmpleadoAsalariado dato = lista.get(i);
            if (dato.getNombre().equals(nombre)) {
                lista.remove(i);
                break;
            }
        }
    }
    
 
    
}
