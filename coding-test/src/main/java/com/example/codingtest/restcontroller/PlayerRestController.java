package com.example.codingtest.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.codingtest.dto.PlayerDTO;
import com.example.codingtest.entity.Player;
import com.example.codingtest.service.IPlayerService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/player")
public class PlayerRestController {

	@Autowired
	IPlayerService service;

	@PostMapping("/add")
	public Player addPlayer(@RequestBody PlayerDTO playerDTO) {

		return service.addPlayer(playerDTO);
	}

	@GetMapping("/getall")
	public List<Player> getAllPlayers() {
		return service.getAllPlayers();

	}

	
	@DeleteMapping("/delete/{playerId}")
	public void deletePlayer(@PathVariable int playerId) {
		service.deletePlayer(playerId);
	}
	
	@GetMapping("/get/{playerId}")
	public Player getPlayerById(@PathVariable int playerId) {
		return service.getPlayerById(playerId);
	}
	
	@PutMapping("/update")
	public Player updatePlayer(@RequestBody PlayerDTO playerDTO)

	{
		return service.updatePlayer(playerDTO);
	}
	
	@GetMapping("/totalMatchGreaterThan/{minTotalMatches}")
	public List<Player> getPlayerByTotalMatches(@PathVariable int minTotalMatches){
		return service.findPlayerByMatches(minTotalMatches);
	}
}
