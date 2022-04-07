package com.bhaskarmantrala.hub.springbootfoundation.validations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 * @author venkata.mantrala
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestBodyWithValidationConstraints {

    @NotNull
    @Min(value = 18, message = "age must be greater than 18 for vote eligibility")
    public Integer age;

    @NotNull
    @Pattern(regexp = "^(usa)$", message = "invalid country")
    public String country;

    @Pattern(regexp = "^(?!666|000|9\\d{2})\\d{3}(-?)(?!00)\\d{2}(-?)(?!0{4})\\d{4}$", message = "invalid SSN")
    public String ssn;

    @NotNull
    public Boolean alreadyVoted;

}
