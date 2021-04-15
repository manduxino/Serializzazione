/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
               
           
            oos.writeObject(9);
            oos.writeObject("ciao");
            oos.writeObject(0.873);
            
       
            
            oos.flush();
            oos.close();
            fos.close();



                
                
           try {
               
               
               
               
               
               FileInputStream fis = new FileInputStream("TEST.ser");
               ObjectInputStream ois = new ObjectInputStream(fis);
               
               int v1 = (int) ois.readObject();
               System.out.println(v1);
               String v2 = (String)ois.readObject();
               System.out.println(v2);
               double v3 = (double)ois.readObject();
               System.out.println(v3);
               
               
               
               
               
               
               
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
           }
               
               
               
           } catch (IOException ex) {
               Logger.getLogger(Serializzazione.class.getName()).log(Level.SEVERE, null, ex);
               System.err.println("broken java");
    }
       
       
       
    }
    
}

