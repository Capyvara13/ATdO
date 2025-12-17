package com.atdo.toca_cms.domain.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = YearMaxValidator.class)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface YearMax {
    String message() default "The year cannot be in the future.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}