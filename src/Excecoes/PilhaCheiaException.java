package Excecoes;

public class PilhaCheiaException extends Exception{
    @Override
    public String getMessage() {
        return "Pilha Cheia!";
    }
}
