package registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class RegistrationBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrationBackendApplication.class, args);
    }
}
