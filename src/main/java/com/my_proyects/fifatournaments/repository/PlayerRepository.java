package com.my_proyects.fifatournaments.repository;

import com.my_proyects.fifatournaments.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
