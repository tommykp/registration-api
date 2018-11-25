package registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import registration.model.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Profile findByUsername(String username);

}