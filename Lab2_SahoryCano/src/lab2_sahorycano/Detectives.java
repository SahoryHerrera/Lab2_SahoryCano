package lab2_sahorycano;

/**
 *
 * @author sahory Herrera
 */
public class Detectives {
    //Atrib
    private String nombre;
    private int edad;
    private int añosLab;
    private String nacionalidad;
    private int nivel;
    
    public Detectives() {
    } // Fin Constructor Granos Basicos
    
    public Detectives(String nombre, int edad, String nacionalidad, int añosLab, int nivel) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.añosLab = añosLab;
        this.nivel = nivel;
    } // Fin Constructor Granos Basicos
    
    //mutadores
     public String getNombre() {
        return nombre;
    } // Fin Get Nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } // Fin Set Nombre

    public int getedad() {
        return edad;
    } // Fin Get edad

    public void setedad(int edad) {
        this.edad = edad;
    } // Fin Set edad
    
     public String getnacionalidad() {
        return nacionalidad;
    } // Fin Get Nacionalidad

    public void setnacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    } // Fin Set Nacionalidad
    
     public int getañosLab() {
        return añosLab;
    } // Fin Get años laborales

    public void setañosLab(int añosLab) {
        this.añosLab = añosLab;
    } // Fin Set años laborales
    
      public int getnivel() {
        return nivel;
    } // Fin Get edad

    public void setnivel(int nivel) {
        this.nivel = nivel;
    } // Fin Set edad
    
    //MA
    public String toString() {
        return "[Nombre: " + nombre + "][Edad: " + edad + "][Nacionalidad: " + nacionalidad + "][Años Laborales: " + añosLab + "][Nivel: " + nivel + ']';
    } // Fin To String


}//fin

 

