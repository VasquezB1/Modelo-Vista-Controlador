/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Vista;

import ec.edu.ups.Controlador.ControladorEmpleadoAsalariado;
import ec.edu.ups.clases.EmpleadoAsalariado;
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

        ControladorEmpleadoAsalariado controladorEmpleadoAsalariado = new ControladorEmpleadoAsalariado();

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
            Scanner n3 = new Scanner(System.in);

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
                        System.out.println("5.- -- Regresar --");
                        System.out.println("Eliga una opcion:");
                        opcion1 = n1.nextInt();
                        switch (opcion1) {
                            case 1:
                                EmpleadoAsalariado objeto = new EmpleadoAsalariado();
                                System.out.println("\t Create");
                                System.out.println("Ingrese su nombre");
                                String nombre = n3.next();
                                objeto.setNombre(nombre);
                                System.out.println("Ingrese su cedula");
                                String cedula = n3.next();
                                objeto.setCedula(cedula);
                                System.out.println("Ingrese su edad");
                                int edad = n3.nextInt();
                                objeto.setEdad(edad);
                                System.out.println("Ingrese la empresa");
                                String empresa = n3.next();
                                objeto.setEmpresa(empresa);
                                System.out.println("Ingrese el codigo");
                                int codigo = n3.nextInt();
                                objeto.setCodigo(codigo);
                                System.out.println("Ingrese horas de trabajo");
                                int hor = n3.nextInt();
                                objeto.setHorasTrabajo(hor);
                                System.out.println("Ingrese el sueldo extra");
                                double extra = n3.nextDouble();
                                objeto.setSueldoExtra(extra);
                                System.out.println("Ingrese su genero");
                                String gene = n3.next();
                                objeto.setGenero(gene);
                                System.out.println("Ingrese el salario");
                                double salario = n3.nextDouble();
                                objeto.setSalario(salario);
                                System.out.println("Ingresar su fecha de Contratacion");
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
                                objeto.setFechaContratacion(testDate);

                                System.out.println("Ingrese la fecha de sus vacaciones");
                                Scanner sc2 = new Scanner(System.in);
                                String fech2a = sc2.nextLine();
                                SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yyyy");
                                Date testDate2 = null;
                                String date2 = fecha;
                                try {
                                    testDate2 = df.parse(date2);
                                    System.out.println("Usted tiene vacaciones el: " + fecha);
                                } catch (Exception e) {
                                    System.out.println("invalid format");
                                }
                                objeto.setVacaciones(testDate2);
                                controladorEmpleadoAsalariado.create(objeto);
                                break;
                            case 2:
                                System.out.println("\t Read");
                                System.out.println("Ingrese el usuario a leer");
                                nombre = n3.next();
                                System.out.println(controladorEmpleadoAsalariado.read(nombre));
                                break;
                            case 3:
                                System.out.println("\t Update");
                                objeto = new EmpleadoAsalariado();
                                System.out.println("Ingrese su nombre");
                                nombre = n3.next();
                                objeto.setNombre(nombre);
                                System.out.println("Ingrese su cedula");
                                cedula = n3.next();
                                objeto.setCedula(cedula);
                                System.out.println("Ingrese su edad");
                                edad = n3.nextInt();
                                objeto.setEdad(edad);
                                System.out.println("Ingrese la empresa");
                                empresa = n3.next();
                                objeto.setEmpresa(empresa);
                                System.out.println("Ingrese el codigo");
                                codigo = n3.nextInt();
                                objeto.setCodigo(codigo);
                                System.out.println("Ingrese horas de trabajo");
                                hor = n3.nextInt();
                                objeto.setHorasTrabajo(hor);
                                System.out.println("Ingrese el sueldo extra");
                                extra = n3.nextDouble();
                                objeto.setSueldoExtra(extra);
                                System.out.println("Ingrese su genero");
                                gene = n3.next();
                                objeto.setGenero(gene);
                                System.out.println("Ingrese el salario");
                                salario = n3.nextDouble();
                                objeto.setSalario(salario);
                                System.out.println("Ingresar su fecha de Contratacion");
                                Scanner sc3 = new Scanner(System.in);
                                String fecha3 = sc3.nextLine();
                                SimpleDateFormat df3 = new SimpleDateFormat("dd/MM/yyyy");
                                Date testDate3 = null;
                                String date3 = fecha3;
                                try {
                                    testDate = df3.parse(date3);
                                    System.out.println("Usted fue contratado el: " + fecha3);
                                } catch (Exception e) {
                                    System.out.println("invalid format");
                                }
                                objeto.setFechaContratacion(testDate3);

                                System.out.println("Ingrese la fecha de sus vacaciones");
                                Scanner sc4 = new Scanner(System.in);
                                String fecha4 = sc4.nextLine();
                                SimpleDateFormat df4 = new SimpleDateFormat("dd/MM/yyyy");
                                Date testDate4 = null;
                                String date4 = fecha4;
                                try {
                                    testDate2 = df4.parse(date4);
                                    System.out.println("Usted tiene vacaciones el: " + fecha4);
                                } catch (Exception e) {
                                    System.out.println("invalid format");
                                }
                                objeto.setVacaciones(testDate4);
                                controladorEmpleadoAsalariado.update(objeto);
                                break;
                            case 4:
                                System.out.println("\t Delete");
                                System.out.println("Ingrese el usuario a eliminar");
                                nombre = n3.next();
                                controladorEmpleadoAsalariado.delete(nombre);
                                break;
                            case 5:
                                salir1 = true;
                        }

                    }
                case 5:
                    salir = true;
                    default:
                    System.out.println("*****  Haz elegido salir  *****");
                    System.out.println("*****  GRACIAS  *****");

            }

        }

    }
}
