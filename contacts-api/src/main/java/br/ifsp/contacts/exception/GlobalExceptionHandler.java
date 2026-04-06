package br.ifsp.contacts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

// classe para interpretar os erros de validação @Valid
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST) //retornaa http 400
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationException(MethodArgumentNotValidException ex){
        Map<String, String> errorResponse = new HashMap<>();

        String errorMessage = ex.getBindingResult().getAllErrors().get(0).getDefaultMessage();

        errorResponse.put("Erro", errorMessage);

        return errorResponse;
    }
}
