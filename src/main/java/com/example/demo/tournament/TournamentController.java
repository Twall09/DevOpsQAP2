package com.example.demo.tournament;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tournaments")
public class TournamentController {
    private final TournamentService tournamentService;

    public TournamentController(TournamentService tournamentService) {
        this.tournamentService = tournamentService;
    }

    // adds and retrieves all tournaments
    @PostMapping
    public Tournament addTournament(@RequestBody Tournament tournament) {
        return tournamentService.saveTournament(tournament);
    }

    @GetMapping
    public List<Tournament> getTournaments() {
        return tournamentService.getAllTournaments();
    }
}
