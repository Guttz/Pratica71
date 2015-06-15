/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.Comparator;

/**
 *
 * @author kiqdestro
 */
public class JogadorComparator implements Comparator<Jogador> {
    boolean numero, numeroAscendente, nomeAscendente;
    
    public JogadorComparator(boolean numero, boolean numeroAscendente, boolean nomeAscendente){
        this.numero = numero;
        this.numeroAscendente = numeroAscendente;
        this.nomeAscendente = nomeAscendente;
    }
        
    public JogadorComparator(){
        numero = true;
        numeroAscendente = true;
        nomeAscendente = true;
    }
    

    
    @Override
    public int compare(Jogador J1, Jogador J2){
       if(numero && numeroAscendente && nomeAscendente){
           if(J1.numero == J2.numero)
               return J1.nome.compareToIgnoreCase(J2.nome);
            
            else
               return J1.numero - J2.numero;
        }
       
        else if(numero && numeroAscendente){
           if(J1.numero == J2.numero)
               return -(J1.nome.compareToIgnoreCase(J2.nome));
            
            else
               return J1.numero - J2.numero;
       }
       
        else if(numero){
            if(J1.numero == J2.numero)
               return -(J1.nome.compareToIgnoreCase(J2.nome));
            
            else
               return -(J1.numero - J2.numero);
       }
       
        else if(numeroAscendente && nomeAscendente){
            if( J1.nome.compareToIgnoreCase(J2.nome) == 0)
               return J1.numero - J2.numero;
            
            else
                return J1.nome.compareToIgnoreCase(J2.nome);
       }
       
        else if(numeroAscendente){
            if( J1.nome.compareToIgnoreCase(J2.nome) == 0)
               return J1.numero - J2.numero;
            
            else
                return -(J1.nome.compareToIgnoreCase(J2.nome));
       }
              
        else{
            if( J1.nome.compareToIgnoreCase(J2.nome) == 0)
               return -(J1.numero - J2.numero);
            
            else
                return -(J1.nome.compareToIgnoreCase(J2.nome));
       }
       
    }
}
