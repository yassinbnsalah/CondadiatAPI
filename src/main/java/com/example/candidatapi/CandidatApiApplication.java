package com.example.candidatapi;

import com.example.candidatapi.entities.Candidat;
import com.example.candidatapi.repo.CandidatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidatApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(CandidatApiApplication.class, args);
    }
    @Autowired
    private CandidatRepo repository;

    @Bean
    ApplicationRunner init() {
        return (args) -> {
            repository.save(new Candidat("Mariem", "Ch", "ma@esprit.tn"));
            repository.save(new Candidat ("Sarra","ab", "sa@esprit.tn"));
            repository.save(new Candidat ("Mohamed","ba","mo@esprit.tn")); // fetch
            repository.findAll().forEach (System.out::println);
        };
    }
}