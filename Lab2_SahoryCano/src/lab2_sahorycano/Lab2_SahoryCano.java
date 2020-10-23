package lab2_sahorycano;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sahory Cano
 */
public class Lab2_SahoryCano {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList Detectives = new ArrayList();
    static ArrayList Casos = new ArrayList();

    public static void main(String[] args) {
        char resp = 's';
        while (resp == 's' || resp == 'S') {

            System.out.println("+--------------||Menu||--------------+");
            System.out.println("|   1.-Agregar   Detective           |");
            System.out.println("|   2.-Eliminar  Detective           |");
            System.out.println("|   3.-Modificar Detective           |");
            System.out.println("|   4.-Listar    Detectives          |");
            System.out.println("|   5.-Registar  Casos               |");
            System.out.println("|   6.-Modificar Casos               |");
            System.out.println("+------------------------------------+");
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
                case 1:
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
            

