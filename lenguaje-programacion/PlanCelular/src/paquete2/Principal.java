package paquete2;

import java.util.ArrayList;
import java.util.Scanner;
import paquete1.*;
import plancelular.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nombre del archivo
        String nombreArchivo = "planes.data";
        ArrayList<PlanCelular> planes = new ArrayList<>();
        
        while(true){
        int n=0;
        System.out.println("¿Qué plan desea ingresar?");
        System.out.println("1) PlanPostPagoMinutos");
        System.out.println("2) PlanPostPagoMegas");
        System.out.println("3) PlanPostPagoMinutosMegas");
        System.out.println("4) PlanPostPagoMinutosMegasEconomico");
        System.out.println("5) Mostrar todos los datos guardados");
        System.out.println("6) Salir");
        System.out.println("Ingrese una opción 1-6");
        n = sc.nextInt();
        
        switch(n){
            
            case 1: n = 1;            
            
            //inicio info básica de cada clase
            Persona p = new Persona("Jandry","Jaramillo","1105638041");
            System.out.println("Ingrese el nombre del propietario:");
            String nombre = sc.next();
            p.setNombres(nombre);
            
            System.out.println("Ingrese el apellido del propietario:");
            String apellido = sc.next();
            p.setApellido(apellido);
            
            System.out.println("Ingrese la cédula del propietario:");
            String cdi = sc.next();
            p.setCedula(cdi);
            
            PlanPostPagoMinutos e = new PlanPostPagoMinutos(p,"Loja",
            "Huawei","HW-169","0963651745",12,2,8,4);
            
            System.out.println("Ingrese la ciudad del propietario:");
            String a = sc.next();
            e.setCiudad(a);
            
            System.out.println("Ingrese la marca del celular del propietario:");
            String b = sc.next();
            e.setMarca(b);
            
            System.out.println("Ingrese el modelo del celular del "
                    + "propietario:");
            String c = sc.next();
            e.setModelo(c);
            
            System.out.println("Ingrese el número del celular del "
                    + "propietario:");
            String d = sc.next();
            e.setNumero(d);
            //fin info básica de cada clase            
            System.out.println("Ingrese los minutos nacionales realizados:");
            double f = sc.nextDouble();
            e.setMinutosN(f);
            
            System.out.println("Ingrese el costo de los minutos nacionales:");
            double g = sc.nextDouble();
            e.setCostoN(g);
            
            System.out.println("Ingrese los minutos internacionales "
                    + "realizados:");
            double h = sc.nextDouble();
            e.setMinutosI(h);
            
            System.out.println("Ingrese el costo de los minutos "
                    + "internacionales:");
            double i = sc.nextDouble();
            e.setCostoI(i);
            
            e.setPagoMensual();
            
            planes.add(e);
            break;
            case 2: n = 2;
            //inicio info básica de cada clase
            Persona p2 = new Persona("Jandry","Jaramillo","1105638041");
            System.out.println("Ingrese el nombre del propietario:");
            String nombre2 = sc.next();
            p2.setNombres(nombre2);
            
            System.out.println("Ingrese el apellido del propietario:");
            String apellido2 = sc.next();
            p2.setApellido(apellido2);
            
            System.out.println("Ingrese la cédula del propietario:");
            String cdi2 = sc.next();
            p2.setCedula(cdi2);
            
            PlanPostPagoMegas e2 = new PlanPostPagoMegas(p2,"Loja",
            "Huawei","HW-169","0963651745",5,2,8);
            
            System.out.println("Ingrese la ciudad del propietario:");
            String a2 = sc.next();
            e2.setCiudad(a2);
            
            System.out.println("Ingrese la marca del celular del propietario:");
            String b2 = sc.next();
            e2.setMarca(b2);
            
            System.out.println("Ingrese el modelo del celular del "
                    + "propietario:");
            String c2 = sc.next();
            e2.setModelo(c2);
            
            System.out.println("Ingrese el número del celular del "
                    + "propietario:");
            String d2 = sc.next();
            e2.setNumero(d2);
            //fin info básica de cada clase            
            System.out.println("Ingrese las megas usadas expresado en GB:");
            double f2 = sc.nextDouble();
            e2.setMegasG(f2);
            
            System.out.println("Ingrese el costo por cada GB:");
            double g2 = sc.nextDouble();
            e2.setCostoG(g2);
            
            System.out.println("Ingrese la tarifa base:");
            double h2 = sc.nextDouble();
            e2.setTarifaB(h2);
                        
            e2.setPagoMensual();
            
            planes.add(e2);
            break;
            case 3: n = 3;
            //inicio info básica de cada clase
            Persona p3 = new Persona("Jandry","Jaramillo","1105638041");
            System.out.println("Ingrese el nombre del propietario:");
            String nombre3 = sc.next();
            p3.setNombres(nombre3);
            
            System.out.println("Ingrese el apellido del propietario:");
            String apellido3 = sc.next();
            p3.setApellido(apellido3);
            
            System.out.println("Ingrese la cédula del propietario:");
            String cdi3 = sc.next();
            p3.setCedula(cdi3);
            
            PlanPostPagoMinutosMegas e3 = new PlanPostPagoMinutosMegas(p3,
                    "Loja","Huawei","HW-169","0963651745",12,2,8,2);
            
            System.out.println("Ingrese la ciudad del propietario:");
            String a3 = sc.next();
            e3.setCiudad(a3);
            
            System.out.println("Ingrese la marca del celular del propietario:");
            String b3 = sc.next();
            e3.setMarca(b3);
            
            System.out.println("Ingrese el modelo del celular del "
                    + "propietario:");
            String c3 = sc.next();
            e3.setModelo(c3);
            
            System.out.println("Ingrese el número del celular del "
                    + "propietario:");
            String d3 = sc.next();
            e3.setNumero(d3);
            //fin info básica de cada clase            
            System.out.println("Ingrese los minutos realizados:");
            double f3 = sc.nextDouble();
            e3.setMinutos(f3);
            
            System.out.println("Ingrese el costo de los minutos:");
            double g3 = sc.nextDouble();
            e3.setCosto(g3);
            
            System.out.println("Ingrese las megas usadas expresado en GB:");
            double h3 = sc.nextDouble();
            e3.setMegasG(h3);
            
            System.out.println("Ingrese el costo por cada GB:");
            double i3 = sc.nextDouble();
            e3.setCostoG(i3);
            
            e3.setPagoMensual();
            
            planes.add(e3);
            break;
            case 4: n = 4;
            //inicio info básica de cada clase
            Persona p4 = new Persona("Jandry","Jaramillo","1105638041");
            System.out.println("Ingrese el nombre del propietario:");
            String nombre4 = sc.next();
            p4.setNombres(nombre4);
            
            System.out.println("Ingrese el apellido del propietario:");
            String apellido4 = sc.next();
            p4.setApellido(apellido4);
            
            System.out.println("Ingrese la cédula del propietario:");
            String cdi4 = sc.next();
            p4.setCedula(cdi4);
            
            PlanPostPagoMinutosMegasEconomico e4 = new 
            PlanPostPagoMinutosMegasEconomico(p4,"Loja","Huawei","HW-169"
                    ,"0963651745",12,2,8,2,10);
            
            System.out.println("Ingrese la ciudad del propietario:");
            String a4 = sc.next();
            e4.setCiudad(a4);
            
            System.out.println("Ingrese la marca del celular del propietario:");
            String b4 = sc.next();
            e4.setMarca(b4);
            
            System.out.println("Ingrese el modelo del celular del "
                    + "propietario:");
            String c4 = sc.next();
            e4.setModelo(c4);
            
            System.out.println("Ingrese el número del celular del "
                    + "propietario:");
            String d4 = sc.next();
            e4.setNumero(d4);
            //fin info básica de cada clase            
            System.out.println("Ingrese los minutos realizados:");
            double f4 = sc.nextDouble();
            e4.setMinutos(f4);
            
            System.out.println("Ingrese el costo de los minutos:");
            double g4 = sc.nextDouble();
            e4.setCosto(g4);
            
            System.out.println("Ingrese las megas usadas expresado en GB:");
            double h4 = sc.nextDouble();
            e4.setMegasG(h4);
            
            System.out.println("Ingrese el costo por cada GB:");
            double i4 = sc.nextDouble();
            e4.setCostoG(i4);
            
            e4.setPagoMensual();
            
            planes.add(e4);
            break;            
            case 5: n = 5;
            
            //Escritura del archivo planes.data                                    
            EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial 
            (nombreArchivo);

            for (int x = 0; x < planes.size(); x++) {
            planes.get(x).setPagoMensual();
            // establecer el valor del atributo registro
            archivo.establecerRegistro(planes.get(x));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
            }
            archivo.cerrarArchivo();
            
            LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial
            (nombreArchivo);
            lectura.establecerListaPlanes();
            System.out.println(lectura);
            lectura.cerrarArchivo();
            break;
            
            case 6: n = 6;
            System.exit(0);
            break;
            default:
                break;
        }
    }
    }
}