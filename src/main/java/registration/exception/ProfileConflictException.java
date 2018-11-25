package registration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ProfileConflictException extends RuntimeException {

    public ProfileConflictException(String username) {
        super("Profile with username " + username + " already exists");
    }
}