package io.pragra.learning.pragravisit;

import io.pragra.learning.pragravisit.entity.PragraVisitor;
import io.pragra.learning.pragravisit.service.VisitorService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringjpaApplication {

    private VisitorService service;

    public SpringjpaApplication(VisitorService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringjpaApplication.class, args);
    }


    //@Bean
    CommandLineRunner runner() {
        return args -> {
            PragraVisitor visitor = PragraVisitor.builder()
                                   .firstName("Chirag")
                                   .lastName("Dhawan")
                                   .build();

            System.out.println(service.createVisitor(visitor));
        };
    }
}