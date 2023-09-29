package com.ikm.PGR.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;



public class DateValidator implements ConstraintValidator<ValidDate, LocalDate> {

    public void initialize(DateValidator constraintAnnotation) {

    }



    @Override
    public boolean isValid(LocalDate date, ConstraintValidatorContext context) {
        if (date == null) {
            // Null values are considered valid, handle this according to your requirements
            return true;
        }
        LocalDate today = LocalDate.now();
        return !date.isBefore(today);
    }
}

