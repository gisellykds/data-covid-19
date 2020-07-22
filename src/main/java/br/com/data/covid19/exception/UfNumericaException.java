package br.com.data.covid19.exception;

import lombok.Getter;

@Getter
public class UfNumericaException extends RuntimeException {
    public UfNumericaException() {
        super("Uf não deve ser preenchida com números.");
    }
}
