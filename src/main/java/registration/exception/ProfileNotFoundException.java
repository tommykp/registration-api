package registration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProfileNotFoundException extends RuntimeException {

    public ProfileNotFoundException(Long id) {
        super("Could not find profile for id: " + id);
    }
}