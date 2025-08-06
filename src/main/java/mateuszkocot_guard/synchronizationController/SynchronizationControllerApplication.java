package mateuszkocot_guard.synchronizationController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean; // <-- DODAJ TEN IMPORT
import org.springframework.web.client.RestTemplate; // <-- I TEN IMPORT

@SpringBootApplication
public class SynchronizationControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SynchronizationControllerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}