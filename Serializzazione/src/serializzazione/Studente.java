/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.Serializable;

/**
 *
 * @author manduca.fabio
 */
public class Studente implements Serializable {
    private String nome;
    private String cognome;
    private int nRegistro;

    public Studente(String nome, String cognome, int nRegistro) {
        this.nome = nome;
        this.cognome = cognome;
        this.nRegistro = nRegistro;
    }
    
    public String getAll(){
    return nRegistro+" nome: "+nome+" cognome: "+cognome; 
    }
    
}
