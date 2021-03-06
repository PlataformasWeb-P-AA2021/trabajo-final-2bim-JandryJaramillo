package paquete1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;
import plancelular.PlanCelular;

public class LecturaArchivoSecuencial {

    private ObjectInputStream entrada;
    private ArrayList<PlanCelular> planes;
    private String nombreArchivo;

    public LecturaArchivoSecuencial(String n) {
        nombreArchivo = n;
        File f = new File(obtenerNombreArchivo());
        if (f.exists()) {
            try // abre el archivo
            {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            } // fin de try
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo.");
               
            } // fin de catch
        }
    } 

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerListaPlanes() {
        // 
        planes = new ArrayList<>();
        File f = new File(obtenerNombreArchivo());

        while (true) {
            try {
                
                Object registro = entrada.readObject();
                planes.add((PlanCelular)registro);
            } catch (EOFException endOfFileException) {
                return; // se llegó al fin del archivo

            } catch (IOException ex) {
                System.err.println("Error al leer el archivo: " + ex);
            } catch (ClassNotFoundException ex) {
                System.err.println("No se pudo crear el objeto: " + ex);
            } catch (Exception ex) {
                // System.err.println("No hay datos en el archivo: " + ex);
                break;
            }
        }

    }

    public ArrayList<PlanCelular> obtenerListaPlanes() {
        return planes;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    @Override
    public String toString() {
        
        String cadena = "Lista de Planes\n";
        for (int x = 0; x < obtenerListaPlanes().size() ;x++) {
            PlanCelular p = obtenerListaPlanes().get(x) ;
            cadena = String.format("%s%d) (%s) - %s\n", cadena, 
                    x+1, p.getClass().getSimpleName(), p);
        }
        return cadena;
    }

    // cierra el archivo y termina la aplicación
    public void cerrarArchivo() {
        try // cierra el archivo y sale
        {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método cerrarArchivo
}