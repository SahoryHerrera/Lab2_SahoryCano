package lab2_sahorycano;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sahory Cano
 */
public class Lab2_SahoryCano {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList Detectiveslist = new ArrayList();
    static ArrayList Casos = new ArrayList();

    public static void main(String[] args) {
        char resp = 's';
        while (resp == 's' || resp == 'S') {

            System.out.println("+--------------||Menu||--------------+");
            System.out.println("|   1.-Agregar   Detective           |");
            System.out.println("|   2.-Eliminar  Detective           |");
            System.out.println("|   3.-Modificar Detective           |");
            System.out.println("|   4.-Listar    Detectives          |");
            System.out.println("+------------------------------------+");
            System.out.println("|   5.-Registar  Casos               |");
            System.out.println("|   6.-Modificar Casos               |");
            System.out.println("|   7.-Listar    Casos               |");
            System.out.println("|   8.-Listar    Casos Resueltos     |");
            System.out.println("|   9.-Listar    Casos Pendientes    |");
            System.out.println("+------------------------------------+");
            System.out.println("|   10.-Salir                        |");
            System.out.println("+------------------------------------+");
            System.out.println("+---||Ingrese La opcion deseada||----+");
            System.out.print("-> ");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1: {

                    System.out.println("-------||Agregar  Detective||---------");
                    System.out.print("Ingrese el Nombre: ");
                    String nombre = entrada.next();
                    System.out.print("Ingrese la edad : ");
                    int edad = entrada.nextInt();
                    System.out.print("Ingrese la nacionalidad : ");
                    String nacionalidad = entrada.next();
                    System.out.print("Ingrese años Laborales : ");
                    int añoslab = entrada.nextInt();
                    System.out.print("Ingrese Nivel  : ");
                    int nivel = entrada.nextInt();
                    while (nivel < 1 && nivel > 11) {
                        System.out.println("Número no válido , el rango disponible es de 1 - 10");
                        System.out.print("Ingrese un numero: ");
                        nivel = entrada.nextInt();
                    }//Fin de la validacion
                    Detectiveslist.add(new Detectives(nombre, edad, nacionalidad, añoslab, nivel));
                    System.out.println("¡Detective Agregado exitosamente!");
                }
                break;
                case 2: {
                    System.out.println("-------||Eliminar Detective||---------");
                    for (Object o : Detectiveslist) {
                        System.out.println(Detectiveslist.indexOf(o) + " = " + o);
                    } // Fin For
                    System.out.print("Ingrese la posicion que desea eliminar: ");
                    int pos = entrada.nextInt();
                    Detectiveslist.remove(pos);
                    System.out.println("¡Detective Eliminado Exitosamente!");
                }
                break;
                case 3:
                    System.out.println("------||Modificar Detective||---------");
                    for (Object o : Detectiveslist) {
                        System.out.println(Detectiveslist.indexOf(o) + " = " + o);
                    } // Fin For
                    System.out.print("Ingrese la posicion que desea modificar: ");
                    int pos = entrada.nextInt();
                    System.out.println("+---------[¿Qué desea modificar]------+");
                    System.out.println("|    (1) Nombre                       |");
                    System.out.println("|    (2) Edad                         |");
                    System.out.println("|    (3) Nacionalidad                 |");
                    System.out.println("|    (4) Años Laborales               |");
                    System.out.println("|    (5) Nivel                        |");
                    System.out.println("+-------------------------------------+");
                    System.out.println("|       Ingrese la opcion deseada     |");
                    System.out.println("+-------------------------------------+");
                    System.out.print("-> ");
                    int opciona = entrada.nextInt();
                    switch (opciona) {
                        case 1:
                            System.out.print("Ingrese el Nombre: ");
                            String nombre = entrada.next();
                            ((Detectives) Detectiveslist.get(pos)).setNombre(nombre);
                            break;
                        case 2:
                            System.out.print("Ingrese la Edad: ");
                            int edad = entrada.nextInt();
                            ((Detectives) Detectiveslist.get(pos)).setedad(edad);
                            break;
                        case 3:
                            System.out.print("Ingrese La Nacionalidad: ");
                            String nacionalidad = entrada.next();
                            ((Detectives) Detectiveslist.get(pos)).setnacionalidad(nacionalidad);
                            break;
                        case 4:
                            System.out.print("Ingrese Años Laborales: ");
                            int añoslab = entrada.nextInt();
                            ((Detectives) Detectiveslist.get(pos)).setañoslab(añoslab);
                            break;
                        case 5:
                            System.out.print("Ingrese Nivel: ");
                            int nivel = entrada.nextInt();
                            ((Detectives) Detectiveslist.get(pos)).setnivel(nivel);
                            break;
                        default:
                            System.out.println("¡Entrada no valida!");
                    } // Fin Switch
                    System.out.println("¡Se ha realizado la modificacion exitosamente!");

                case 4:
                    System.out.println("------||Lista de Detectives||---------");
                    for (Object o : Detectiveslist) {
                        System.out.println(Detectiveslist.indexOf(o) + " = " + o);
                    } // Fin For
                    break;
                case 5:

                case 10:
                    resp = 'n';
                    break;
                default:
                    System.out.println("\u001B[31m¡Entrada no valida!\u001B[30m");
            } // Fin Switch
        } // Fin While
    } //Fin Main
} //Fin Class
