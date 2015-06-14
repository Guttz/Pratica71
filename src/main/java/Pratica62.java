
import java.util.ArrayList;
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.JogadorComparator;
import utfpr.ct.dainf.if62c.pratica.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiqdestro
 */
public class Pratica62 {
        public static void main(String[] args) {
        
        Time time1 = new Time();
        JogadorComparator ComparadorDesAs = new JogadorComparator(false, false, true);
        ArrayList<Jogador> ListaOrdenada = new ArrayList<>();
        
        time1.addJogador("Goleiro", new Jogador(1, "Júlio César"));
        time1.addJogador("Zagueiro", new Jogador(3, "David Luiz"));
        time1.addJogador("Atacante", new Jogador(5, "Neymar"));
        
        ListaOrdenada = time1.ordena(ComparadorDesAs);
               
        for (Jogador entry: ListaOrdenada) {
        System.out.println(entry);
        }

}
