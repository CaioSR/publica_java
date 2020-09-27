package application;

public class Application {

	public static void main(String[] args) {
		Season s = new Season();
		Game game1 = new Game(20);
		Game game2 = new Game(10);
		Game game3 = new Game(5);
		Game game4 = new Game(30);

		s.addGame(game1);

		System.out.println(s.getMaxScore());
		System.out.println(s.getMinScore());
		System.out.println(s.getMaxScoreCounter());
		System.out.println(s.getMinScoreCounter());
		System.out.println("-----------------------");
		
		s.addGame(game2);
		System.out.println(s.getMaxScore());
		System.out.println(s.getMinScore());
		System.out.println(s.getMaxScoreCounter());
		System.out.println(s.getMinScoreCounter());
		System.out.println("-----------------------");
		
		s.addGame(game3);
		System.out.println(s.getMaxScore());
		System.out.println(s.getMinScore());
		System.out.println(s.getMaxScoreCounter());
		System.out.println(s.getMinScoreCounter());
		System.out.println("-----------------------");
		
		s.addGame(game4);
		System.out.println(s.getMaxScore());
		System.out.println(s.getMinScore());
		System.out.println(s.getMaxScoreCounter());
		System.out.println(s.getMinScoreCounter());
	}

}
