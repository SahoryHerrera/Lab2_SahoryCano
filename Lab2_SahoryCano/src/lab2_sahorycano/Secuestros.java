/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_sahorycano;

/**
 *
 * @author sahor
 */
public class Secuestros {
      //Atrib

    private String lugar;
    private String descripcion;
    private String tipo2;
    private String name;
    private String tipo3;

    public Secuestros() {
    } // Fin Constructor casos

    public Secuestros(String lugar, String descripcion, String tipo2, String name, String tipo3) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo2 = tipo2;
        this.name = name;
        this.tipo3 = tipo3;
    } // Fin Constructor Granos Basicos

    //mutadores
    public String getlugar() {
        return lugar;
    } // Fin Get lugar

    public void setlugar(String lugar) {
        this.lugar = lugar;
    } // Fin Set lugar
    
     public String getdescripcion() {
        return descripcion;
    } // Fin Get descripcion

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    } // Fin Set descripcion
    
      public String gettipo2() {
        return tipo2;
    } // Fin Get tipo de caso

    public void settipo2(String tipo2) {
        this.tipo2 = tipo2;
    } // Fin Set tipo de caso
    
      public String getname() {
        return name;
    } // Fin Get Nombre

    public void setname(String name) {
        this.name = name;
    } // Fin Set Nombre
    
      public String gettipo3() {
        return tipo3;
    } // Fin Get tipo de estado

    public void settipo3(String tipo3) {
        this.tipo3 = tipo3;
    } // Fin Set tipo de estado
    
    public String toString() {
        return "[Lugar: " + lugar + "][Descripcion: " + descripcion + "][Tipo de caso: " + tipo2 + "][Detective a Cargo: " + name + "][Estado de caso: " + tipo3 + ']';
    } // Fin To String
    
    
    
    
}
