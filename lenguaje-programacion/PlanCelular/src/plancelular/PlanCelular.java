package plancelular;
import paquete1.Persona;
import java.io.Serializable;

public abstract class PlanCelular implements Serializable{
    
    protected Persona propietario;
    protected String ciudad;
    protected String marca;
    protected String modelo;
    protected String numero;
    protected double pagoMensual;
    
    public PlanCelular(Persona p,String c,String m,String mo,String n){
        propietario = p;        
        ciudad = c;
        marca = m;
        modelo = mo;
        numero = n;                
    }
    
    public void setPropietario(Persona x){
        propietario = x;
    }       
    
    public Persona getPropietario(){
        return propietario;
    }
    
    public void setCiudad(String x){
        ciudad = x;
    }       
    
    public String getCiudad(){
        return ciudad;
    }
    
    public void setMarca(String x){
        marca = x;
    }       
    
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String x){
        modelo = x;
    }       
    
    public String getModelo(){
        return modelo;
    }
    
    public void setNumero(String x){
        numero = x;
    }       
    
    public String getNumero(){
        return numero;
    }
    
    public abstract void setPagoMensual();       
    
    public double getPagoMensual(){
        return pagoMensual;
    } 
 @Override
    public String toString(){
        String cadena = String.format("\nPlan Celular:\n"                              
                + "Propietario : %s\n"
                + "Ciudad del propietario: %s\n"
                + "Marca del celular : %s\n"
                + "Modelo del celular: %s\n"
                + "Numero del celular : %s\n",
                getPropietario(),getCiudad(),getMarca(),getModelo(),
                getNumero());        
        return cadena;
    }    
}