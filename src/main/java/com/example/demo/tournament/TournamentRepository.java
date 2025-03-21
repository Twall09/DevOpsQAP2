package com.example.demo.tournament;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;


//  allows us to interact with the Tournament database
public interface TournamentRepository extends JpaRepository<Tournament, Long> {
    Optional<Tournament> findByLocation(String location);
    List<Tournament> findByStartDate(LocalDate startDate);
}
// retrieves a tournamnet location and the given start dates
