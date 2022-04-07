package com.bhaskarmantrala.hub.springbootfoundation.controller;

import com.bhaskarmantrala.hub.springbootfoundation.exception.VoteDuplicateException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author venkata.mantrala
 */
@RestControllerAdvice
public class RequestValidationControllerAdvice {

    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Map<String, Map<String, String>> processValidationError(MethodArgumentNotValidException e) {
        Map<String, Map<String, String>> responseMap = new HashMap<>();
        Map<String, String> errorMap = new HashMap<>();
        BindingResult result = e.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();
        fieldErrors.forEach(fieldError -> errorMap.put(fieldError.getField(), fieldError.getDefaultMessage()));
        responseMap.put("errors", errorMap);
        return responseMap;
    }

    @ExceptionHandler({VoteDuplicateException.class})
    @ResponseStatus(HttpStatus.TOO_MANY_REQUESTS)
    @ResponseBody
    public Map<String, String> processVoteRegistrationError(VoteDuplicateException e) {
        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("errors", e.getMessage());
        return responseMap;
    }

    @ExceptionHandler({HttpMessageNotReadableException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Map<String, String> processRequestBodyException(HttpMessageNotReadableException e) {
        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("errors", "Bad request");
        return responseMap;
    }

}
