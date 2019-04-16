/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.clases.ProfesorContratado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Byron PC
 */
public class ControladorProfesorContratado {
      private List<ProfesorContratado> lista;

    public ControladorProfesorContratado() {
        lista = new ArrayList<>();
    }

    public void create(ProfesorContratado objeto) {
        lista.add(objeto);
    }

    public ProfesorContratado read(String nombre) {
        for (ProfesorContratado profesorcontratado : lista) {
            if (profesorcontratado.getNombre().equals(nombre)) {
                return profesorcontratado;
            }
        }
        return null;
    }

    public void update(ProfesorContratado objeto) {
        for (int i = 0; i < lista.size(); i++) {
            ProfesorContratado elemento = lista.get(i);
            if (elemento.getNombre().equals(objeto.getNombre())) {
                lista.set(i, objeto);
                break;
            }
        }
    }

    public void delete(String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            ProfesorContratado dato = lista.get(i);
            if (dato.getNombre().equals(nombre)) {
                lista.remove(i);
                break;
            }
        }
    }
}
