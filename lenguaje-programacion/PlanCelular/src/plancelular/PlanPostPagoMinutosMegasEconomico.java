package plancelular;

import java.io.Serializable;
import paquete1.Persona;

public class PlanPostPagoMinutosMegasEconomico extends PlanCelular implements 
        Serializable{
    
    private double minutos;
    private double costo;
    private double megasG;
    private double costoG;
    private double descuento;
    
    public PlanPostPagoMinutosMegasEconomico(Persona p, String c, String m, String mo, 
            String n,double mN,double cN,double mI,double cI,double d) {
        super(p, c, m, mo, n);
        minutos = mN;
        costo = cN;
        megasG = mI;
        costoG = cI;
        descuento = d;
    }          
    
    @Override
    public void setPagoMensual(){
        double aux = (minutos * costo) + (megasG * costoG);
        pagoMensual = aux - (aux * (descuento/100));
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
    
    public void setDescuento(double x){
        descuento = x;
    }       
    
    public double getDescuento(){
        return descuento;
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
                + "Porcentaje de descuento: %.2f\n"
                + "Pago Mensual: %.2f\n",
                getPropietario(),getCiudad(),getMarca(),getModelo(),
                getNumero(),getMinutos(),getCosto(),getMegasG(),
                getCostoG(),getDescuento(),getPagoMensual());        
        return cadena;
    }    
}