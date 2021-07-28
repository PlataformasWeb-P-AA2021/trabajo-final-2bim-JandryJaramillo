package plancelular;

import java.io.Serializable;
import paquete1.Persona;

public class PlanPostPagoMinutos extends PlanCelular implements Serializable{
    
    private double minutosN;
    private double costoN;
    private double minutosI;
    private double costoI;
    
    public PlanPostPagoMinutos(Persona p, String c, String m, String mo, 
            String n,double mN,double cN,double mI,double cI) {
        super(p, c, m, mo, n);
        minutosN = mN;
        costoN = cN;
        minutosI = mI;
        costoI = cI;
    }          
    
    @Override
    public void setPagoMensual(){
        pagoMensual = (minutosN * costoN) + (minutosI * costoI);
    } 
            
    public void setMinutosN(double x){
        minutosN = x;
    }       
    
    public double getMinutosN(){
        return minutosN;
    } 
    
    public void setCostoN(double x){
        costoN = x;
    }       
    
    public double getCostoN(){
        return costoN;
    }
    
    public void setMinutosI(double x){
        minutosI = x;
    }       
    
    public double getMinutosI(){
        return minutosI;
    } 
    
    public void setCostoI(double x){
        costoI = x;
    }       
    
    public double getCostoI(){
        return costoI;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nPlan post pago minutos.-\n"
                + "Propietario : %s\n"
                + "Ciudad del propietario: %s\n"
                + "Marca del celular : %s\n"
                + "Modelo del celular: %s\n"
                + "Numero del celular : %s\n"
                + "Minutos nacionales : %.2f\n"
                + "Costo minuto nacional: %.2f\n"
                + "Minutos internacionales: %.2f\n"
                + "Costo minuto internacional: %.2f\n"
                + "Pago Mensual: %.2f\n",
                getPropietario(),getCiudad(),getMarca(),getModelo(),
                getNumero(),getMinutosN(),getCostoN(),getMinutosI(),
                getCostoI(),getPagoMensual());        
        return cadena;
    }    
}