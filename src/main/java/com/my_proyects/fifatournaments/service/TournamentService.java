package com.my_proyects.fifatournaments.service;

import com.my_proyects.fifatournaments.dtos.TournamentDto;

import java.util.List;
import java.util.Optional;

public interface TournamentService {
    List<Optional<TournamentDto>> getAllTournaments();
    TournamentDto getTournamentById();
    String updateTournament(Long tournamentId, TournamentDto tournament);
    void createTournament();
    void deleteTournamentById();
}
