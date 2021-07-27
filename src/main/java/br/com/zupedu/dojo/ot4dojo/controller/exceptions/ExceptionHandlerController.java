package br.com.zupedu.dojo.ot4dojo.controller.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErroPadrao> erro(MethodArgumentNotValidException exception){
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        List<Erros> erros = fieldErrors.stream().map(f -> {
            return new Erros(f.getDefaultMessage(), f.getField());
        }).collect(Collectors.toList());
        return ResponseEntity.badRequest().body(new ErroPadrao(erros));

    }

}
