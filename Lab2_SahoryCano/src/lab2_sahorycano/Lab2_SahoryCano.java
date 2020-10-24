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
    static ArrayList Casoslist = new ArrayList();
    static ArrayList Homicidioslist = new ArrayList();
    static ArrayList Roboslist = new ArrayList();
    static ArrayList Secuestroslist = new ArrayList();
    static ArrayList Resueltolist = new ArrayList();
    static ArrayList Procesolist = new ArrayList();

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
                    while (nivel <= 1 && nivel >= 10) {
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
                case 3: {
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
                } // Fin Switch

                break;

                case 4: {
                    System.out.println("------||Lista de Detectives||---------");
                    for (Object o : Detectiveslist) {
                        System.out.println(Detectiveslist.indexOf(o) + " = " + o);
                    } // Fin For
                }
                break;

                case 5: {
                    System.out.println("--------||Registrar  Caso||-----------");
                    System.out.print("Ingrese el lugar: ");
                    String lugar = entrada.next();
                    System.out.print("Ingrese la descripción: ");
                    String descripcion = entrada.next();
                    System.out.println("---------||tipo de caso||-------------");
                    System.out.println("1.-Homicidio");
                    System.out.println("2.-Secuestro");
                    System.out.println("3.-Robo");
                    System.out.println("Ingrese tipo de caso que desea registrar");
                    System.out.print("-> ");
                    int tipo = entrada.nextInt();
                    String tipo2 = "";
                    switch (tipo) {
                        case 1:
                            tipo2.equals("Homicidio");
                            break;
                        case 2:
                            tipo2.equals("Secuestro");
                            break;
                        case 3:
                            tipo2.equals("Robo");
                            break;
                        default:
                            System.out.println("¡Entrada no valida!");
                    } // Fin Switch

                    System.out.println("--||Lista de Detectives Disponibles||--");
                    for (Object o : Detectiveslist) {
                        System.out.println(Detectiveslist.indexOf(o) + " = " + o);
                    } // Fin For
                    System.out.print("Ingrese la posicion del detective que desea: ");
                    int posi = entrada.nextInt();
                    String name = "";
                    name = ((Detectives) Detectiveslist.get(posi)).getNombre();
                    System.out.println("---------||Estados del caso||----------");
                    System.out.println("1.-Proceso");
                    System.out.println("2.-Resuelto");
                    System.out.println("Ingrese el estado del caso");
                    System.out.print("-> ");
                    int estado = entrada.nextInt();
                    String tipo3 = "";
                    switch (estado) {
                        case 1:
                            tipo3.equals("Proceso");
                            break;
                        case 2:
                            tipo3.equals("Resuelto");
                            break;
                        default:
                            System.out.println("¡Entrada no valida!");
                    } // Fin Switch

                    if (tipo == 1) {
                        Homicidioslist.add(new Homicidios(lugar, descripcion, tipo2, name, tipo3));
                    } else if (tipo == 2) {
                        Secuestroslist.add(new Secuestros(lugar, descripcion, tipo2, name, tipo3));
                    } else if (tipo == 3) {
                        Roboslist.add(new Robos(lugar, descripcion, tipo2, name, tipo3));
                    }

                    if (estado == 1) {
                        Resueltolist.add(new Homicidios(lugar, descripcion, tipo2, name, tipo3));
                        Resueltolist.add(new Secuestros(lugar, descripcion, tipo2, name, tipo3));
                        Resueltolist.add(new Robos(lugar, descripcion, tipo2, name, tipo3));
                    } else if (estado == 2) {
                        Procesolist.add(new Homicidios(lugar, descripcion, tipo2, name, tipo3));
                        Procesolist.add(new Secuestros(lugar, descripcion, tipo2, name, tipo3));
                        Procesolist.add(new Robos(lugar, descripcion, tipo2, name, tipo3));
                    }

                    Casoslist.add(new Casos(lugar, descripcion, tipo2, name, tipo3));
                    System.out.println("¡Se Registado el caso!");
                }
                break;

                case 6: {
                    System.out.println("------||Modificar Casos||---------");
                    for (Object o : Casoslist) {
                        System.out.println(Casoslist.indexOf(o) + " = " + o);
                    } // Fin For
                    System.out.print("Ingrese la posicion que desea modificar: ");
                    int pos = entrada.nextInt();
                    System.out.println("+---------[¿Qué desea modificar]------+");
                    System.out.println("|    (1) Lugar                        |");
                    System.out.println("|    (2) Descripcion                  |");
                    System.out.println("|    (3) Tipo de Caso                 |");
                    System.out.println("|    (4) Detective a Cargo            |");
                    System.out.println("|    (5) Estado de Caso               |");
                    System.out.println("+-------------------------------------+");
                    System.out.println("|       Ingrese la opcion deseada     |");
                    System.out.println("+-------------------------------------+");
                    System.out.print("-> ");
                    int opciona = entrada.nextInt();

                    switch (opciona) {
                        case 1:
                            System.out.print("Ingrese el Lugar: ");
                            String lugar = entrada.next();
                            ((Casos) Casoslist.get(pos)).setlugar(lugar);
                            break;
                        case 2:
                            System.out.print("Ingrese la descripcion: ");
                            String descripcion = entrada.next();
                            ((Casos) Casoslist.get(pos)).setdescripcion(descripcion);
                            break;
                        case 3:
                            System.out.println("---------||tipo de caso||-------------");
                            System.out.println("1.-Homicidio");
                            System.out.println("2.-Secuestro");
                            System.out.println("3.-Robo");
                            System.out.println("Ingrese tipo de caso que desea registrar");
                            System.out.print("-> ");
                            int tipo = entrada.nextInt();
                            String tipo2 = "";
                            switch (tipo) {
                                case 1:
                                    tipo2.equals("Homicidio");
                                    break;
                                case 2:
                                    tipo2.equals("Secuestro");
                                    break;
                                case 3:
                                    tipo2.equals("Robo");
                                    break;
                                default:
                                    System.out.println("¡Entrada no valida!");
                            } // Fin Switch
                            ((Casos) Casoslist.get(pos)).settipo2(tipo2);

                            break;
                        case 4:
                            System.out.println("--||Lista de Detectives Disponibles||--");
                            for (Object o : Detectiveslist) {
                                System.out.println(Detectiveslist.indexOf(o) + " = " + o);
                            } // Fin For
                            System.out.print("Ingrese la posicion del detective que desea: ");
                            int posi = entrada.nextInt();
                            String name = "";
                            name = ((Detectives) Detectiveslist.get(posi)).getNombre();
                            ((Casos) Casoslist.get(pos)).setname(name);
                            break;
                        case 5:
                            System.out.println("---------||Estados del caso||----------");
                            System.out.println("1.-Proceso");
                            System.out.println("2.-Resuelto");
                            System.out.println("Ingrese el estado del caso");
                            System.out.print("-> ");
                            int estado = entrada.nextInt();
                            String tipo3 = "";
                            switch (estado) {
                                case 1:
                                    tipo3.equals("Proceso");
                                    break;
                                case 2:
                                    tipo3.equals("Resuelto");
                                    break;
                                default:
                                    System.out.println("¡Entrada no valida!");
                            } // Fin Switch
                            ((Casos) Casoslist.get(pos)).settipo3(tipo3);
                            break;

                        default:
                            System.out.println("¡Entrada no valida!");
                    } // Fin Switch
                    System.out.println("¡Se ha realizado la modificacion exitosamente!");
                }//fin de case 6
                break;

                case 7: {
                    System.out.println("---------||Listado de Casos||---------");
                    for (Object o : Homicidioslist) {
                        System.out.println(Homicidioslist.indexOf(o) + " = " + o);
                    }
                    for (Object o : Secuestroslist) {
                        System.out.println(Secuestroslist.indexOf(o) + " = " + o);
                    }
                    for (Object o : Roboslist) {
                        System.out.println(Roboslist.indexOf(o) + " = " + o);
                    }

                }
                break;

                case 8: {
                    System.out.println("----||Listado de Casos Resueltos||------");
                    for (Object o : Resueltolist) {
                        System.out.println(Resueltolist.indexOf(o) + " = " + o);
                    } // Fin For
                }

                case 9: {
                    System.out.println("----||Listado de Casos Pendientes||------");
                    for (Object o : Procesolist) {
                        System.out.println(Procesolist.indexOf(o) + " = " + o);
                    } // Fin For
                }
                case 10:
                    resp = 'n';
                    break;
                default:
                    System.out.println("\u001B[31m¡Entrada no valida!\u001B[30m");
            } // Fin Switch
        } // Fin While
    } //Fin Main
} //Fin Class
