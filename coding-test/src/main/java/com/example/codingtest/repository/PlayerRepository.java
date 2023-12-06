package com.example.codingtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.codingtest.entity.Player;


@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

	@Query("Select p From Player p where p.totalMatches > :minTotalMatches")
	public List<Player> findPlayerByMatchesGreaterThan(@Param("minTotalMatches")int minTotalMatches );
}
