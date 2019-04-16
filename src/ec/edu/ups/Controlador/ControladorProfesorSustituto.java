/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;


import ec.edu.ups.clases.ProfesorSustituto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Byron PC
 */
public class ControladorProfesorSustituto {
     private List<ProfesorSustituto> lista;

    public ControladorProfesorSustituto() {
        lista = new ArrayList<>();
    }

    public void create(ProfesorSustituto objeto) {
        lista.add(objeto);
    }

    public ProfesorSustituto read(String nombre) {
        for (ProfesorSustituto profesorsustituto : lista) {
            if (profesorsustituto.getNombre().equals(nombre)) {
                return profesorsustituto;
            }
        }
        return null;
    }

    public void update(ProfesorSustituto objeto) {
        for (int i = 0; i < lista.size(); i++) {
            ProfesorSustituto elemento = lista.get(i);
            if (elemento.getNombre().equals(objeto.getNombre())) {
                lista.set(i, objeto);
                break;
            }
        }
    }

    public void delete(String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            ProfesorSustituto dato = lista.get(i);
            if (dato.getNombre().equals(nombre)) {
                lista.remove(i);
                break;
            }
        }
    }
}
