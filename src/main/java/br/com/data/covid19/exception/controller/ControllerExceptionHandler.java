package br.com.data.covid19.exception.controller;

import br.com.data.covid19.exception.ErrosDadosSaidaApi;
import br.com.data.covid19.exception.UfNaoEncontradaException;
import br.com.data.covid19.exception.UfNumericaException;
import br.com.data.covid19.exception.response.ResponseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    ResponseException notFoundException(HttpServletRequest request, ErrosDadosSaidaApi exception) {
        return new ResponseException(request, exception);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseException ufNaoEncontradaException(HttpServletRequest request, UfNaoEncontradaException exception) {
        return new ResponseException(request, exception);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseException constraintViolationException(HttpServletRequest request, ConstraintViolationException exception) {
        return new ResponseException(request, exception);
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    ResponseException UfNumericaException(HttpServletRequest request, UfNumericaException exception) {
        return new ResponseException(request, exception);
    }

}

