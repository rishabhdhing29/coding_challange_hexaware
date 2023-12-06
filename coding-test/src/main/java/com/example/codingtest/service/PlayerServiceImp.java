package com.example.codingtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.codingtest.dto.PlayerDTO;
import com.example.codingtest.entity.Player;
import com.example.codingtest.repository.PlayerRepository;

@Service
public class PlayerServiceImp implements IPlayerService {

	@Autowired
	PlayerRepository playerRepository;

	@Override
	public Player addPlayer(PlayerDTO playerDTO) {
		Player player = new Player();
		player.setPlayerId(playerDTO.getPlayerId());
		player.setPlayerName(playerDTO.getPlayerName());
		player.setJerseyNumber(playerDTO.getJerseyNumber());
		player.setRole(playerDTO.getRole());
		player.setTotalMatches(playerDTO.getTotalMatches());
		player.setTeamName(playerDTO.getTeamName());
		player.setCountryName(playerDTO.getCountryName());
		player.setPlayerDescription(playerDTO.getPlayerDescription());

		return playerRepository.save(player);
	}

	@Override
	public List<Player> getAllPlayers() {

		return playerRepository.findAll();

	}

	@Override
	public Player getPlayerById(int playerId) {
		Player player = playerRepository.findById(playerId).orElse(new Player());

		return new Player(player.getPlayerId(), player.getPlayerName(), player.getJerseyNumber(), player.getRole(),
				player.getTotalMatches(), player.getTeamName(), player.getCountryName(), player.getPlayerDescription());
	}

	@Override
	public Player updatePlayer(PlayerDTO playerDTO) {
		Player player = playerRepository.findById(playerDTO.getPlayerId()).orElse(new Player());
		player.setPlayerId(playerDTO.getPlayerId());
		player.setPlayerName(playerDTO.getPlayerName());
		player.setJerseyNumber(playerDTO.getJerseyNumber());
		player.setRole(playerDTO.getRole());
		player.setTotalMatches(playerDTO.getTotalMatches());
		player.setTeamName(playerDTO.getTeamName());
		player.setCountryName(playerDTO.getCountryName());
		player.setPlayerDescription(playerDTO.getPlayerDescription());

		return playerRepository.save(player);

	}

	@Override
	public void deletePlayer(int playerId) {
		Player player = playerRepository.findById(playerId).orElse(null);
		playerRepository.delete(player);

	}
	@Override
	public List<Player>findPlayerByMatches(int minTotalMatches){
		return playerRepository.findPlayerByMatchesGreaterThan(minTotalMatches);
	}

}
