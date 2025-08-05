package com.my_proyects.fifatournaments.service;

import com.my_proyects.fifatournaments.dtos.PlayerDto;

import java.util.List;
import java.util.Optional;

public interface PlayerService {
    List<Optional<PlayerDto>> getAllPlayers();
    PlayerDto getPlayerById();
    String updatePlayer(Long playerId, PlayerDto player);
    void createPlayer();
    void deletePlayerById();
}
