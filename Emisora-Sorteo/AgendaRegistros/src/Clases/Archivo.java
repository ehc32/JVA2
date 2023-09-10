package Clases;

import Clases.Persona;
import java.io.*;
import javax.swing.JOptionPane;
public class Archivo {
    
      File archivo;
    
      public void crearArchivo() {
        try {
            archivo = new File("Gueardo.txt");
            if (archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null,"Archivo Creado ");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
      }
      
      public void escribirEnArchivo(Persona persona){
            try {
            FileWriter formu = new FileWriter(archivo, true);
           formu.write( persona.getNombre() + "%" + persona.getArstirta()+ "%" + persona.getTelefono() +
                    "%" + persona.getCanciones1() + "%" + persona.getCanciones2() + "%" + persona.getCanciones3() + "%" + persona.getColor() + "%" + persona.getBoleta());
            formu.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}