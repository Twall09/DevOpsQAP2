package com.example.demo.tournament;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentService {
    private final TournamentRepository tournamentRepository;

    public TournamentService(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    // new tournament or updates an existing one
    public Tournament saveTournament(Tournament tournament) {
        return tournamentRepository.save(tournament);
    }

    // fetches a list of tournys
    public List<Tournament> getAllTournaments() {
        return tournamentRepository.findAll();
    }
}
