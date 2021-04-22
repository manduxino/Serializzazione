/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

/**
 *
 * @author manduca.fabio
 */
public class genStud implements Runnable {

    String[]nomi={"paolo","giorgio","cristian","lorenzo","giacomo"};
    String[]cognome={"genio","cappella","istria","foglia","nonloso"};
    @Override
    public void run() {
        
        int i=0;
        while(i!=1){
        
         int a = (int) (Math.random() * 29)+1;
        int contaN = (int) (Math.random() * 4)+1;
        int contaC = (int) (Math.random() * 4)+1;
        
        
        Studente s = new Studente(nomi[contaN],cognome[contaC],a);
       
            System.out.println(s.getAll());
        }
       
        
    }
    
}
