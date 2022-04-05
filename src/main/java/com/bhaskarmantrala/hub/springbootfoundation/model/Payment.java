package com.bhaskarmantrala.hub.springbootfoundation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

/**
 * @author venkata.mantrala
 */
@Getter
@Setter
@ToString
@Log4j2
public class Payment {
    private Integer applicantID;
    private Double amount;
}
