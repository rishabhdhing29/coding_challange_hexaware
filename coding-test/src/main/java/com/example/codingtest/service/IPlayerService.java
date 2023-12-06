package com.example.codingtest.service;

import java.util.List;

import com.example.codingtest.dto.PlayerDTO;
import com.example.codingtest.entity.Player;

public interface IPlayerService {
 
	public Player addPlayer(PlayerDTO playerDTO);
	public List<Player>getAllPlayers();
	public Player updatePlayer(PlayerDTO playerDTO);
	public void deletePlayer(int playerId);
	public Player getPlayerById(int playerId);
	public List<Player> findPlayerByMatches(int minTotalMatches);
}
