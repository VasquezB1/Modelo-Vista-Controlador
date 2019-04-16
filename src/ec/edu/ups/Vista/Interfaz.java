/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Vista;

import ec.edu.ups.Controlador.ControladorEmpleadoAsalariado;
import ec.edu.ups.clases.EmpleadoAsalariado;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Byron PC
 */
public class Interfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("\tMENÚ:");
            System.out.println("1.- CRUD  de Empleado Asalariado");
            System.out.println("2.- CRUD  de Taxista");
            System.out.println("3.- CRUD  de Profesor Contratado");
            System.out.println("4.- CRUD  de Profesor Sustituto");
            System.out.println("5.- Salir");
            System.out.println("Eliga una opcion:");
            opcion = n.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido CRUD de Empleado Asalariado");
                    Scanner n1 = new Scanner(System.in);
                    boolean salir1 = false;
                    int opcion1;
                    while (!salir1) {
                        System.out.println("\t CRUD EmpleadoAsalariado" + "\nElija una opcion");
                        System.out.println("1.- C: Create");
                        System.out.println("2.- R: Read");
                        System.out.println("3.- U: Update");
                        System.out.println("4.- D: Delete");
                        opcion1 = n1.nextInt();
                        switch (opcion) {
                            case 1:
                                System.out.println("\tCreate:");
                                EmpleadoAsalariado empleadoasa = new EmpleadoAsalariado();
                                Scanner n2 = new Scanner(System.in);
                                System.out.println("Ingrese Empresa");
                                n2.next();
                                System.out.println("Ingrese Sueldo Extra");
                                n2.nextDouble();
                                System.out.println("Introduzca la fecha con formato dd/MM/yyyy");
                                Scanner sc = new Scanner(System.in);
                                String fecha = sc.nextLine();
                                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                                Date testDate = null;
                                String date = fecha;
                                try {
                                    testDate = df.parse(date);
                                    System.out.println("Usted fue contratado el: " + fecha);
                                } catch (Exception e) {
                                    System.out.println("invalid format");
                                }
                                System.out.println("Ingrese vacaciones");
                                Scanner sc2 = new Scanner(System.in);
                                String fecha2 = sc2.nextLine();
                                SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                                Date testDate2 = null;
                                String date2 = fecha;
                                try {
                                    testDate2 = df.parse(date2);
                                    System.out.println("Sus Vacaciones seran el: " + fecha2);
                                } catch (Exception e) {
                                    System.out.println("invalid format");
                                }
                                System.out.println("Ingrese su nombre");
                                n2.next();
                                System.out.println("Ingrese su cedula");
                                n2.next();
                                System.out.println("Ingrese su edad");
                                n2.nextInt();
                                System.out.println("Ingrese se genero");
                                n2.next();
                                System.out.println("Ha creado un Empleado Asalariado");
                        }
                        break;

                    }
                    break;

            }

        }

    }
}
