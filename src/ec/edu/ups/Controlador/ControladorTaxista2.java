/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;


import ec.edu.ups.clases.Taxista;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Byron PC
 */
public class ControladorTaxista2 {
    
   private HashSet<Taxista> lista;
   private int codigo;
       
    public ControladorTaxista2(){
        lista = new HashSet<>();
        codigo=0;
    }
    
    public void create(Taxista obj){
        codigo++;
        obj.setCodigo(codigo);
        lista.add(obj);
    }
    
    public Taxista read (int codigo){
        for (Taxista taxista : lista) {
            if(taxista.getCodigo()== codigo){
                return taxista;
            }
        }
       return null;         
        }
    
    public Taxista update(Taxista obj){
        if(lista.contains(obj)){
            lista.remove(obj);
            lista.add(obj);
        } 
       return null;        
    }
    
    public Taxista delete(Taxista obj){
        for (Taxista taxi : lista) {            
            if(obj.getCodigo() == codigo){
                lista.remove(obj);
                break;
            }
            
        }
       return null;
        
    }
}

    
    
