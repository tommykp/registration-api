package registration.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import registration.model.Profile;
import registration.service.ProfileService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/profiles")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @GetMapping()
    public ResponseEntity<List<Profile>> findAll() {
        return ResponseEntity.ok(profileService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profile> findOne(@PathVariable Long id) {
        return ResponseEntity.ok(profileService.findOne(id));
    }

    @PostMapping()
    public ResponseEntity<Profile> createProfile(@RequestBody Profile newProfile) {
        return ResponseEntity.status(HttpStatus.CREATED).body(profileService.createProfile(newProfile));
    }
}