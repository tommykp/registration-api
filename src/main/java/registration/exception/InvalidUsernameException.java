package registration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidUsernameException extends RuntimeException {

    public InvalidUsernameException(String username) {
        super("Username " + username + " does not meet requirements");
    }
}