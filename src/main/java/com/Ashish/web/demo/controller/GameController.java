package com.Ashish.web.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ashish.web.demo.component.GameService;
import com.Ashish.web.demo.models.Game;

@RestController
@RequestMapping(value = "/Game")
public class GameController {
	
	@Autowired
	private GameService gameservice;
	
	@PostMapping
	public Game addgame(@RequestBody Game game) {
		return gameservice.addgame(game);
	}
	
	@GetMapping
	public List<Game> getGame(){
		return gameservice.getGameList();
	}
	
	@GetMapping(value = "/{gameId}")
	public Game getGame(@PathVariable("gameId") int gameId) {
		return gameservice.getGame(gameId);
	}
	
	@PutMapping(value="/{gameId}")
	public Game updateGame(@PathVariable("gameId") int gameId, @RequestBody Game game) {
		return gameservice.updateGame(gameId, game);
	}
	
	@DeleteMapping(value="{gameId}")
	public void deleteGame(@PathVariable("gameId") int gameId) {
		gameservice.deleteGame(gameId);
	}
}