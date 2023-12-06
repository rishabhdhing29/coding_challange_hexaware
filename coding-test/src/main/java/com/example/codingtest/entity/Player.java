package com.example.codingtest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

/*
Author : Rishabh
Date : 21/11/2023

*/
@Entity
public class Player {

	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "player_sequence")
    @SequenceGenerator(name = "player_sequence", sequenceName = "PLAYER_SEQ", allocationSize = 1, initialValue = 101)

	private int playerId;

	@NotBlank(message = "Player name is required")

	private String playerName;

	@Positive
	private int jerseyNumber;

	@NotBlank
	@Pattern(regexp = "Batsman|Bowler|All Rounder", message = "Invalid role")
	private String role;

	@Positive
	private int totalMatches;

	@NotBlank
	private String teamName;

	@NotBlank
	private String countryName;
	private String playerDescription;

	public Player() {
		super();
	}

	public Player(int playerId, @NotBlank(message = "Player name is required") String playerName,
			@Positive int jerseyNumber, @NotBlank String role, @Positive int totalMatches, @NotBlank String teamName,
			@NotBlank String countryName, String playerDescription) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalMatches = totalMatches;
		this.teamName = teamName;
		this.countryName = countryName;
		this.playerDescription = playerDescription;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getPlayerDescription() {
		return playerDescription;
	}

	public void setPlayerDescription(String playerDescription) {
		this.playerDescription = playerDescription;
	}

}
