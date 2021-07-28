package paquete1;

import java.io.Serializable;

public class Persona implements Serializable{
    
    private String nombres;
    private String apellido;
    private String cedula;
        
    public Persona(String nombre,String ap,String CDI) {        
        nombres = nombre;
        apellido = ap;
        cedula = CDI;
    }    
           
    public void setNombres(String x){
        nombres = x;
    }       
    
    public String getNombres(){
        return nombres;
    }
    
    public void setApellido(String x){
        apellido = x;
    }       
    
    public String getApellido(){
        return apellido;
    }
    
    public void setCedula(String x){
        cedula = x;
    }       
    
    public String getCedula(){
        return cedula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nCliente.-\n"
                + "Nombres : %s\n" 
                + "Apellidos : %s\n" 
                + "Cédula : %s\n",
                getNombres(),getApellido(),getCedula());        
        return cadena;
    }    
}