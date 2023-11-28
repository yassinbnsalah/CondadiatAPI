package com.example.candidatapi.repo;

import com.example.candidatapi.entities.Candidat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatRepo extends JpaRepository<Candidat,Integer> {
    @Query("select c from Candidat c where c.nom like :name")
    public Page<Candidat>candidatByNom(@Param("name") String n, Pageable pageable);
}

