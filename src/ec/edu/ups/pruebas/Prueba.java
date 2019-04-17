/*
 *
 */
package ec.edu.ups.pruebas;
//Imports de todas las clases creadaspara el uso del programa
import ec.edu.ups.clases.EmpleadoAsalariado;
import ec.edu.ups.clases.Empleados;
import ec.edu.ups.clases.Persona;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import ec.edu.ups.clases.ProfesorContratado;
import ec.edu.ups.clases.ProfesorSustituto;
import ec.edu.ups.clases.Taxista;
import ec.edu.ups.clases.Profesor;
import java.util.HashSet;
import java.util.Set;

/*
 * @author Byron PC
 * @since 12-April-2019
 * @version IDE 8.2 
 *  
 */
public class Prueba {

    /**
     * @param args the command line arguments
     *  ----------Interfaz----------
     * Aqui se pretende demostrará el funcionamiento del programa
     */
    public static void main(String[] args) {
               
        ProfesorContratado carlos=new ProfesorContratado();
        carlos.setCodigo(20);
        carlos.setNombre("Carlos");
        
        ProfesorContratado juan =new ProfesorContratado();
        juan.setCodigo(20);
        juan.setNombre("Juan");
        
        
        
        if(carlos.equals(juan)){
            System.out.println("Son iguales :)");
            
        }else{
            System.out.println("No son iguales :(");
        }
        
        ProfesorSustituto salon=new ProfesorSustituto();
        salon.setCodigo(20);
        ProfesorSustituto los= new ProfesorSustituto();
        los.setCodigo(10);
        
        if(salon.equals(los)){
            System.out.println("Son iguales :)");
        }
        else{
            System.out.println("No son iguales :(");
        }
        
        //Prueba de Set
        
        Set<ProfesorContratado> lista = new HashSet<>();
        lista.add(carlos);
        lista.add(juan);
        for (ProfesorContratado profesorContratado : lista) {
            System.out.println("Profesor Contratado " + profesorContratado.getNombre());
            
        }
        if(lista.contains(juan)){
            System.out.println("En la lista si existe");
        }else        {
            System.out.println("No existe en la lista");
        }
        
               
        
        
        
        // TODO code application logic here
//////////////////////////////////////////////////////////////////////////////
    //Creacion de fechas con el metodo GregorainCalendar.
       /*GregorianCalendar fechacontratacion = new GregorianCalendar(1997, 3, 16);
        GregorianCalendar vacaciones = new GregorianCalendar(2002, 3, 16);   
        GregorianCalendar contratotaxi = new GregorianCalendar(2005, 0, 18);
        GregorianCalendar vacataxi = new GregorianCalendar(2005, 3, 12);
        GregorianCalendar contratopro = new GregorianCalendar(2002, 6, 18);
        GregorianCalendar evalu = new GregorianCalendar(2002, 7, 20);
        
    //Clase EmpleadoAsalariado con sus respectivas herencias y demás.
    
       /* EmpleadoAsalariado antony = new EmpleadoAsalariado(9, 2856, 420.60, "Empresa XYZ", 460.30, fechacontratacion.getTime(), vacaciones.getTime(), "Antony Pim", "0102659875", 23, "Masculino");
        System.out.println(antony);
        System.out.println("\nMetodos Abstractos:");
        System.out.println("\t" + antony.comer());
        System.out.println("\t" + antony.descansar());
        System.out.println("\t" + antony.dormir());
        System.out.println("\t" + antony.viajar());
        System.out.println("\t" + antony.verTelevision());
        System.out.println("\t" + antony.verCelular());

    //Clase Taxista con sus respectivas herencias y demás. 
    
        Taxista wade = new Taxista(20, 2630, "Noche", "0987815996", "CuencaTaxi", 260.30, contratotaxi.getTime(), vacataxi.getTime(), "Wade Wilson", "0105948574", 23, "Masculino");
        System.out.println(wade);
        System.out.println("\nMetodos Abstractos:");
        System.out.println("\t" + wade.comer());
        System.out.println("\t" + wade.contestar());
        System.out.println("\t" + wade.descansar());
        System.out.println("\t" + wade.dormir());
        System.out.println("\t" + wade.verWhatsapp());
        System.out.println("\t" + wade.trabajar());
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
     
    //Clase Profesor con Contrato con sus respectivas herencias y demás.   
     
        ProfesorContratado bruce = new ProfesorContratado(contratopro.getTime(), 9, evalu.getTime(), 3, "Quimica", "Colegio MARVL", 236, "Dia", "Bruce Banner", "0301265894", 32, "Masculino");
        System.out.println(bruce);
        System.out.println("\nMetodos Abstractos:");
        System.out.println("\t" + bruce.caminar());
        System.out.println("\t" + bruce.comer());
        System.out.println("\t" + bruce.descansar());
        System.out.println("\t" + bruce.dormir());
        System.out.println("\t" + bruce.exponer());
        System.out.println("\t" + bruce.vestirse());
        
    //Clase Profesor Sustituto con sus respectivas herencias y demás.
    
        ProfesorSustituto wanda = new ProfesorSustituto(6, "Si posee experiencia", 4, 220.60, "Psicologia", "Colegio MARVL", 222, "Noche", "Wanda Maxi", "0102659847", 26, "Femenino");
        System.out.println(wanda);
        System.out.println("\nMetodos Abstractos:");
        System.out.println("\t" + wanda.comer());
        System.out.println("\t" + wanda.descansar());
        System.out.println("\t" + wanda.divertirse());
        System.out.println("\t" + wanda.dormir());
        System.out.println("\t" + wanda.trabajar());
        System.out.println("\t" + wanda.moverse());
        
    //Creacion de listas.
    
        List<Persona> lista = new ArrayList<>();
        lista.add(antony);
        lista.add(wade);
        lista.add(bruce);
        lista.add(wanda);
        
    //Downcastin con el uso de instanceof.
    
        System.out.println("\n------------------Downcasting con instanceof--------------");

        for (Persona persona : lista) {
            if (persona instanceof EmpleadoAsalariado) {
                Empleados asa = (Empleados) persona;
                System.out.println(asa+"\n");
            } else if (persona instanceof Taxista) {
                Taxista tax = (Taxista) persona;
                System.out.println(tax+"\n");
            } else if (persona instanceof ProfesorSustituto) {
                ProfesorSustituto pro = (ProfesorSustituto) persona;
                System.out.println(pro+"\n");
            } else if (persona instanceof ProfesorContratado) {
                ProfesorContratado cont = (ProfesorContratado) persona;
                System.out.println(cont+"\n");
            }
        }
        
    //Clases anonimas
    
        System.out.println("///////////////////////////////////////////////////////////////////////////////////");
        System.out.println("----------Clases Anonimas----------");

        GregorianCalendar vacacionTony = new GregorianCalendar(2016, 3, 26);
        GregorianCalendar fechaContratacionTony = new GregorianCalendar(2019, 2, 31);

        Profesor profesorAnonimo = new Profesor("Matematicas", "Colegio MARVL", 368, "Noche", "Max Hernandez", "0302659847", 28, "Masculino") {
            @Override
            public String responderMensajes() {
                return "----------  " +  super.getNombre() + " esta respondiendo mensajes";

            }
        };
        System.out.println(profesorAnonimo);
        System.out.println(profesorAnonimo.responderMensajes());

        Empleados empleadoAsalariadoAnonimo = new Empleados("Empresa XYZ", 510.90, fechaContratacionTony.getTime(), vacacionTony.getTime(), "Tony Estrella", "0102368594", 28, "Masculino") {
            @Override
            public String verTelevision() {
                return "----------  " + super.getNombre() + " esta viendo television";
            }
        };
        System.out.println("\n");
        System.out.println(empleadoAsalariadoAnonimo);
        System.out.println(empleadoAsalariadoAnonimo.verTelevision());*/
}
}



