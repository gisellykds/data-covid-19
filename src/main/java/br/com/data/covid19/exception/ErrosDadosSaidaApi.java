package br.com.data.covid19.exception;

import lombok.Getter;

@Getter
public class ErrosDadosSaidaApi extends RuntimeException {
    public ErrosDadosSaidaApi() {
        super("Erro nos dados de saída da API covid.");
    }
}
