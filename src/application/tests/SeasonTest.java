package application.tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

import application.Game;
import application.Season;

public class SeasonTest {
	
	@Test
	public void testAddGame() {
		Season s = new Season();
		Game game1 = new Game(-2);
		Game game2 = new Game(0);
		Game game3 = new Game(5);
		Game game4 = new Game(1000);
		
		s.addGame(game1);
		assertTrue(s.getGames().isEmpty());
		
		s.addGame(game2);
		assertTrue(s.getGames().isEmpty());
		
		s.addGame(game4);
		assertTrue(s.getGames().isEmpty());
		
		s.addGame(game3);
		assertFalse(s.getGames().isEmpty());
	}
	
	@Test
	public void testUpdateMaxScore(){
		Season s = new Season();
		Game game1 = new Game(20);
		Game game2 = new Game(10);
		Game game3 = new Game(5);
		Game game4 = new Game(30);
		
		s.addGame(game1);
		assertEquals(20, s.getMaxScore());
		assertEquals(0, s.getMaxScoreCounter());
		
		s.addGame(game2);
		assertEquals(20, s.getMaxScore());
		assertEquals(0, s.getMaxScoreCounter());
		
		s.addGame(game3);
		assertEquals(20, s.getMaxScore());
		assertEquals(0, s.getMaxScoreCounter());
		
		s.addGame(game4);
		assertEquals(30, s.getMaxScore());
		assertEquals(1, s.getMaxScoreCounter());
	}

	@Test
	public void testUpdateMinScore(){
		Season s = new Season();
		Game game1 = new Game(20);
		Game game2 = new Game(10);
		Game game3 = new Game(5);
		Game game4 = new Game(30);
		
		s.addGame(game1);
		assertEquals(20, s.getMinScore());
		assertEquals(0, s.getMinScoreCounter());
		
		s.addGame(game2);
		assertEquals(10, s.getMinScore());
		assertEquals(1, s.getMinScoreCounter());
		
		s.addGame(game3);
		assertEquals(5, s.getMinScore());
		assertEquals(2, s.getMinScoreCounter());
		
		s.addGame(game4);
		assertEquals(5, s.getMinScore());
		assertEquals(2, s.getMinScoreCounter());
	}
}
