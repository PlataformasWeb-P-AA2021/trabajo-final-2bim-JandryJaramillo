package plancelular;

import java.io.Serializable;
import paquete1.Persona;

public class PlanPostPagoMinutosMegas extends PlanCelular implements 
        Serializable{
    
    private double minutos;
    private double costo;
    private double megasG;
    private double costoG;
    
    public PlanPostPagoMinutosMegas(Persona p, String c, String m, String mo, 
            String n,double mN,double cN,double mI,double cI) {
        super(p, c, m, mo, n);
        minutos = mN;
        costo = cN;
        megasG = mI;
        costoG = cI;
    }          
    
    @Override
    public void setPagoMensual(){
        pagoMensual = (minutos * costo) + (megasG * costoG);
    } 
            
    public void setMinutos(double x){
        minutos = x;
    }       
    
    public double getMinutos(){
        return minutos;
    } 
    
    public void setCosto(double x){
        costo = x;
    }       
    
    public double getCosto(){
        return costo;
    }
    
    public void setMegasG(double x){
        megasG = x;
    }       
    
    public double getMegasG(){
        return megasG;
    } 
    
    public void setCostoG(double x){
        costoG = x;
    }       
    
    public double getCostoG(){
        return costoG;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nPlan post pago minutos.-\n"  
                + "Propietario : %s\n"
                + "Ciudad del propietario: %s\n"
                + "Marca del celular : %s\n"
                + "Modelo del celular: %s\n"
                + "Numero del celular : %s\n"
                + "Minutos : %.2f\n"
                + "Costo minuto : %.2f\n"
                + "Megas expresado en gigas: %.2f\n"
                + "Costo por cada gigas: %.2f\n"
                + "Pago Mensual: %.2f\n",
                getPropietario(),getCiudad(),getMarca(),getModelo(),
                getNumero(),getMinutos(),getCosto(),getMegasG(),
                getCostoG(),getPagoMensual());        
        return cadena;
    }    
}