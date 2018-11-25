package registration.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import registration.exception.InvalidPasswordException;
import registration.exception.InvalidUsernameException;
import registration.exception.ProfileConflictException;
import registration.exception.ProfileNotFoundException;
import registration.model.Profile;
import registration.repository.ProfileRepository;
import registration.service.validator.PasswordValidator;
import registration.service.validator.UsernameValidator;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfileService {
    private final ProfileRepository profileRepository;
    private final UsernameValidator usernameValidator;
    private final PasswordValidator passwordValidator;

    public Profile createProfile(Profile newProfile) {
        if (!usernameValidator.isValid(newProfile.getUsername())) {
            throw (new InvalidUsernameException(newProfile.getUsername()));
        } else if (profileRepository.findByUsername(newProfile.getUsername()) != null) {
            throw (new ProfileConflictException(newProfile.getUsername()));
        } else if (!passwordValidator.isValid(newProfile.getPassword())) {
            throw (new InvalidPasswordException());
        }
        return profileRepository.save(newProfile);
    }

    public List<Profile> findAll() {
        return profileRepository.findAll();
    }

    public Profile findOne(Long id) {
        return profileRepository.findById(id).orElseThrow(() -> new ProfileNotFoundException(id));
    }
}