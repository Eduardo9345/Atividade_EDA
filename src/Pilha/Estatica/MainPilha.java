package Pilha.Estatica;

import Excecoes.PilhaCheiaException;
import Excecoes.PilhaVaziaException;
import ListaEstatica.ListaEstatica;

public class MainPilha {
    public static void main(String[] args) throws PilhaCheiaException, PilhaVaziaException {
        PilhaEstatica pilha = new PilhaEstatica(12);

        // Sequências
        int[] sequencia_1 = {7, 60, 45, 19, 28, 37};
        int[] sequencia_2 = {41, 22, 36, 56, 17, 6};

        inserirNaPilha(sequencia_1, pilha);
        inserirNaPilha(sequencia_2, pilha);

        //Remoção
        pilha.pop();
        pilha.pop();
        pilha.pop();

        //Inserção
        pilha.push(26);
        pilha.push(99);

        //Impressão
        pilha.imprimir();
        System.out.println("TOPO:" + pilha.getTopo());
        System.out.println("QUANTIDADE DE ELEMENTOS:" + pilha.getQuantidade());


    }
    public static void inserirNaPilha(int[] v, PilhaEstatica p) throws PilhaCheiaException {
        for(int e : v){
            p.push(e);
        }
    }
}
