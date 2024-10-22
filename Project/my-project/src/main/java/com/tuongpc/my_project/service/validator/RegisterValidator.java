package com.tuongpc.my_project.service.validator;

import com.tuongpc.my_project.dto.UsersDTO;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class RegisterValidator implements ConstraintValidator<RegisterChecked, UsersDTO> {
    @Override
    public boolean isValid(UsersDTO user, ConstraintValidatorContext context) {
        boolean valid = true;
        // Check if password fields match
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            context.buildConstraintViolationWithTemplate("Passwords must match")
                    .addPropertyNode("confirmPassword")
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
            valid = false;
        }

        // Additional validations can be added here

        return valid;
    }
}
