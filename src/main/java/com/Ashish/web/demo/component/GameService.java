package com.Ashish.web.demo.component;

	import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Ashish.web.demo.exception.GameNotFoundException;
import com.Ashish.web.demo.models.Game;
import com.Ashish.web.demo.repository.GameRepository;

	@Component
	public class GameService {//Business logic
		
		@Autowired
		private GameRepository gameRepository;
		
		private int gameIdCount = 1;
		private List<Game> GameList = new CopyOnWriteArrayList<>();
		
		public Game addgame(Game game) {
			game.setGameId(gameIdCount);
			GameList.add(game);
			gameIdCount++;
			return  gameRepository.save(game);
		}
		
		 public List<Game> getGameList(){
			return gameRepository.findAll();
			 
		 }
		
		 public Game getGame(int gameId) {
			 Optional<Game> optionalGame = gameRepository.findById(gameId);
			 if(!optionalGame.isPresent())
				 throw new GameNotFoundException("Game is Not Found");
			 return optionalGame.get();
		 }
		 
		 public void deleteGame(int gameId) {
			 gameRepository.deleteById(gameId);
		 }
		 
		 public Game updateGame(int gameId, Game game) {
			 game.setGameId(gameId);
			 return gameRepository.save(game);
		 }
		
		/*public Game addgame(Game game) {
			game.setGameId(gameIdCount);
			GameList.add(game);
			GameList.add(game);
			gameIdCount++;
			return game;
		}
		
		 public List<Game> getGameList(){//gives all the game list
			 return GameList;
		 }
		 
		 public Game getGame(int gameId) {//gives only one game
			return GameList
					.stream()
					.filter(c -> c.getGameId() == gameId) 
					.findFirst()
					.get();
		 }
		 
		 public Game updateGame(int gameId, Game game) {
			 GameList
			 	.stream()
			 	.forEach(c -> {
			 		if(c.getGameId() == gameId) {
			 			c.setName(game.getName());
			 			c.setShortDescription(game.getShortDescription());
			 			c.setDescription(game.getDescription());
			 			c.setFeaturedImage(game.getFeaturedImage());
			 			c.setFeaturedGame(game.isFeaturedGame());
			 		}
			 	});
			 return GameList
					 .stream()
					 .filter(c -> c.getGameId() == gameId)
					 .findFirst()
					 .get();
		 }
		 
		 public void deleteGame(int gameId) {
			 GameList
			 	.stream()
			 	.forEach(c -> {
			 		if(c.getGameId() == gameId) {
			 			GameList.remove(c);
			 		}
			 	});
		 }*/
		 

	}

