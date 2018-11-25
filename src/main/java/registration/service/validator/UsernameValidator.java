package registration.service.validator;

import org.springframework.stereotype.Component;

@Component
public class UsernameValidator {

    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9]{5,}$";

    public boolean isValid(String username) {
        return username.matches(USERNAME_PATTERN);
    }
}