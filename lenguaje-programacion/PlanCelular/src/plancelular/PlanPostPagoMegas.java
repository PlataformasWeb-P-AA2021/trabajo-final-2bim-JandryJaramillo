package plancelular;

import java.io.Serializable;
import paquete1.Persona;

public class PlanPostPagoMegas extends PlanCelular implements Serializable{
    
    private double megasG;
    private double costoG;
    private double tarifaB;
    
    public PlanPostPagoMegas(Persona p, String c, String m, String mo, 
            String n,double mN,double cN,double mI) {
        super(p, c, m, mo, n);
        megasG = mN;
        costoG = cN;
        tarifaB = mI;
    }          
    
    @Override
    public void setPagoMensual(){
        pagoMensual = (megasG * costoG) + tarifaB;
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
    
    public void setTarifaB(double x){
        tarifaB = x;
    }       
    
    public double getTarifaB(){
        return tarifaB;
    }        
    
    @Override
    public String toString(){        
        String cadena = String.format("\nPlan post pago megas.-\n" 
                + "Propietario : %s\n"
                + "Ciudad del propietario: %s\n"
                + "Marca del celular : %s\n"
                + "Modelo del celular: %s\n"
                + "Numero del celular : %s\n"
                + "Megas expresado en gigas : %.2f\n"
                + "Costo por cada gigas: %.2f\n"
                + "Tarifa base : %.2f\n"
                + "Pago Mensual: %.2f\n",
                getPropietario(),getCiudad(),getMarca(),getModelo(),
                getNumero(),getMegasG(),getCostoG(),getTarifaB(),
                getPagoMensual());        
        return cadena;
    }    
}