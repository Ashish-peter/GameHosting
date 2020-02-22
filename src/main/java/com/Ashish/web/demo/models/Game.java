package com.Ashish.web.demo.models;

import javax.annotation.processing.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Games")
@Generated( value = { "gameId" })
public class Game {
	
	@Id
	private int gameId;
	private String name;
	private String shortDescription;
	private String description;
	private String featuredImage;
	private boolean isFeaturedGame;
	
	
	public Game(int gameId, String name, String shortDescription, String description, String featuredImage,
			boolean isFeaturedGame) {
		super();
		this.gameId = gameId;
		this.name = name;
		this.shortDescription = shortDescription;
		this.description = description;
		this.featuredImage = featuredImage;
		this.isFeaturedGame = isFeaturedGame;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFeaturedImage() {
		return featuredImage;
	}
	public void setFeaturedImage(String featuredImage) {
		this.featuredImage = featuredImage;
	}
	public boolean isFeaturedGame() {
		return isFeaturedGame;
	}
	public void setFeaturedGame(boolean isFeaturedGame) {
		this.isFeaturedGame = isFeaturedGame;
	}
	
	
	
	

	
	
}	
	
	
	
	
	