/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author kiqdestro
 */
public class Time {
    private HashMap<String, Jogador> jogadores = new HashMap<>();;

    public Time() {
    }
    
    public HashMap getJogadores() {
        return jogadores;
    }
    
    public void addJogador(String S1, Jogador J1){
        jogadores.put(S1, J1);
    }
    
    public List<Jogador> ordena(JogadorComparator Comparador){
        List<Jogador> ListaOrdenada = new ArrayList<>(jogadores.values());
        
        Collections.sort(ListaOrdenada, Comparador);
       
       return ListaOrdenada;
    }
  
}

