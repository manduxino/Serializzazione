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
        
        
        
//       Studente s = new Studente("Fabio","Manduca",12345);
//       Studente s2 = new Studente("Marco","Air",2389);
//       Studente s3 = new Studente("Luca","bello",7328);
       genStud ii= new genStud();
       ii.run();
       
       
   
            
            
          
         
               
            
            //ciclo scrittura
//            for (int i = 0; i < x.length; i++) {
//                
//                oos.writeObject(s);
//                
//            }
           
            
    
           

        
               //ciclo lettura
//               for (int i = 0; i < x.length; i++) {
//                   
//                   Studente s1 = (Studente) ois.readObject();
//                    System.out.println(s1.getAll());
//                   
//               }

               
               
               
 
       
       
       
    }
    
}

