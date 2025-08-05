package com.my_proyects.fifatournaments.controller;

import com.my_proyects.fifatournaments.dtos.PlayerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("players")
public class PlayerController {

    @GetMapping("/player-details")
    public PlayerDto getPlayerDetails(){
        return new PlayerDto();
    }
}
