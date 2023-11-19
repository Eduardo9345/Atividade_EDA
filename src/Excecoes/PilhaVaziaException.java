package Excecoes;

public class PilhaVaziaException extends Exception{
    @Override
    public String getMessage() {
        return "Pilha Vazia!";
    }
}
