package com.bhaskarmantrala.hub.springbootfoundation.controller;

import com.bhaskarmantrala.hub.springbootfoundation.exception.VoteDuplicateException;
import com.bhaskarmantrala.hub.springbootfoundation.validations.RequestBodyWithValidationConstraints;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author venkata.mantrala
 */
@RestController()
@RequestMapping("/aop/voter")
public class RequestValidationController {

    @PostMapping("/vote")
    public ResponseEntity<Integer> isEligibleForVote(@RequestBody @Valid RequestBodyWithValidationConstraints aopRequestBody) throws VoteDuplicateException {
        if (aopRequestBody.getAlreadyVoted()) {
            throw new VoteDuplicateException("Vote is already registered");
        }
        return new ResponseEntity<>(aopRequestBody.getAge(), HttpStatus.CREATED);
    }


}
