package com.example.demo;

import com.example.demo.entities.Enseignant;
import com.example.demo.entities.Etudiant;
import com.example.demo.repository.EnseignantRepository;
import com.example.demo.repository.EtudiantRepository;
import com.example.demo.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
@Autowired
   private PersonneRepository personneRepository;
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Etudiant etudiant=new Etudiant();
        etudiant.setNom("N1");
        etudiant.setNote(15);
        etudiant.setDateNaissance(new Date());
        personneRepository.save(etudiant);
        Enseignant enseignant=new Enseignant();
        enseignant.setNom("N2");
        enseignant.setMatière("Math");
      enseignant.setDateNaissance(new Date());
      personneRepository.save(enseignant);
    }
}
