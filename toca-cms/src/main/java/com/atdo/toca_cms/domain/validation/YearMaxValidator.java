package com.atdo.toca_cms.domain.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.time.Year;

/**
 * Custom validator to check if an Integer representing a year is not in the future.
 * Validador customizado para verificar se um Integer que representa um ano não está no futuro.
 */
public class YearMaxValidator implements ConstraintValidator<YearMax, Integer> {

    @Override
    public void initialize(YearMax constraintAnnotation) {
        // Inicialização opcional
    }

    @Override
    public boolean isValid(Integer year, ConstraintValidatorContext context) {
        // Se o valor for nulo, a validação @NotNull deve tratar disso. Retornamos true.
        if (year == null) {
            return true;
        }

        // Obtém o ano atual
        int currentYear = Year.now().getValue();

        // Verifica se o ano fornecido é menor ou igual ao ano atual
        return year <= currentYear;
    }
}