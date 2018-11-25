package registration.service.validator;

import org.springframework.stereotype.Component;

@Component
public class PasswordValidator {

    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{8,}$";

    public boolean isValid(String password) {
        return password.matches(PASSWORD_PATTERN);
    }
}