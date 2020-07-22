package br.com.data.covid19.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class UfNaoEncontradaException extends RuntimeException {
    public UfNaoEncontradaException() {
        super("Uf não encontrada");
    }
}
