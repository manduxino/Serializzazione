/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manduca.fabio
 * OBJECT INPUT STREAM -->LEGGO
 * OBJECT OUTPUT STREAM -->SCRIVO
 */
public class Serializzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Oggetto da serializzare
       Studente s = new Studente("Fabio","Manduca",12345);
       
       
        try {
            
          
            
            FileOutputStream fos = new FileOutputStream("TEST.ser");
            
            ObjectOutputStream oos = new ObjectOutputStream(fos);
               
               
               
               
               
               
               
           } catch (IOException ex) {
               Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
               System.err.println("broken java");
    }
       
       
       
    }
    
}
