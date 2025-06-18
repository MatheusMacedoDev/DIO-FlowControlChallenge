package org.matheus;

public class InvalidParamsException extends RuntimeException {
    public InvalidParamsException() {
        super("O primeiro parâmetro não deve ser maior que o segundo.");
    }
}
