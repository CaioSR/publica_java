package application;

import java.util.ArrayList;

/*
 * Classe Season
 * Possui o controle da pontuação bem como uma lista de jogos
 */

import java.util.List;

public class Season {
	private List<Game> games;
	private int maxScore;
	private int minScore;
	private int maxScoreCounter;
	private int minScoreCounter;
	
	public Season() {
		games = new ArrayList<>();
	}
	
	public void addGame(Game game) {
		if(verifyScore(game.getScore())) {
			games.add(game);
		}
	}
	
	
	/*
	 * Verifica se a pontuação é válida
	 * Chama os métodos de atualização de pontuação
	 * Retorna true ou false dependendo da validez
	 */
	private boolean verifyScore(int score) {
		if(score < 1000 && score > 0) {
			if (score > maxScore) {
				updateMaxScore(score);
			}else if (score < minScore) {
				updateMinScore(score);
			}
			
			if (minScore == 0) {
				minScore = score;
			}
		
			return true;
		}else {
			return false;
		}
	}
	
	/*
	 * Atualiza a pontuação máxima
	 * Caso não seja o primeiro jogo, incrementa o Counter
	 */
	private void updateMaxScore(int score) {
		if(maxScore > 0) {
			maxScoreCounter++;
		}
		maxScore = score;
	}
	
	/*
	 * Atualiza a pontuação mínima
	 * Caso não seja o primeiro jogo, incrementa o Counter
	 */
	private void updateMinScore(int score) {
		if(minScore > 0) {
			minScoreCounter++;
		}
		minScore = score;
	}

	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		for(Game game : games) {
			addGame(game);
		}
	}

	public int getMaxScore() {
		return maxScore;
	}

	public int getMinScore() {
		return minScore;
	}

	public int getMaxScoreCounter() {
		return maxScoreCounter;
	}

	public int getMinScoreCounter() {
		return minScoreCounter;
	}


	
	
}
