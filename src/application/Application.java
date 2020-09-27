package application;

import java.util.List;
import java.util.Scanner;

public class Application {

	/*
	 * Realiza um loop básico para registrar um novo jogo e exibir as pontuações necessárias
	 */
	public static void main(String[] args) {
		Season s = new Season();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pontuação Do Novo Jogo: (0 para sair)");
		int input = scanner.nextInt();
		
		while(input != 0) {
			Game g = new Game(input);
			s.addGame(g);
			
			List<Game> games = s.getGames();
			for (int i = 0; i < games.size(); i++) {
				System.out.println("Pontuação do Jogo "+ (i+1)+ ": " + games.get(i).getScore());
			}
			System.out.println("Pontuação Máxima da Temporada " + s.getMaxScore());
			System.out.println("Pontuação Mínima da Temporada " + s.getMinScore());
			System.out.println("Quebra de Recorde Máximo da Temporada " +s .getMaxScoreCounter());
			System.out.println("Quebra de Recorde Minimo da Temporada " +s .getMinScoreCounter());
			System.out.println("-----------------------");
			
			System.out.println("Pontuação Do Novo Jogo: (0 para sair)");
			input = scanner.nextInt();
		}
		
		scanner.close();
		System.exit(0);
	}

}
