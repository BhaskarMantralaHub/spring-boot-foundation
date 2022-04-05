package com.bhaskarmantrala.hub.springbootfoundation.model;

import lombok.*;
import lombok.extern.log4j.Log4j2;

import java.util.Date;

/**
 * @author venkata.mantrala
 */
@Getter
@Setter
@Log4j2
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Offer {
    private Integer code;
    private Date validFor;
    private Integer applicantId;
}
