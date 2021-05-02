package gameProject;

public class Main {

	public static void main(String[] args) {
		User user1=new User("11111111111", "magnus", "carlsen", 1980);
		Player player1=new Player("11111111111", "magnus", "carlsen", 1980,1,"carlsen@gmail.com");
		Game game1=new Game(1, "Fifa21", 200);
		Campaign campaign1=new Campaign("tadınıçıkarınoyunların", 10);
		
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		System.out.println();
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		System.out.println();
		campaignManager.applyCampaign(game1, campaign1);
		System.out.println();
		
		PlayerManager playerManager=new PlayerManager(new ValidationManager());
		playerManager.add(player1, user1);
		System.out.println();
		
		SaleManager saleManager=new SaleManager();		
		saleManager.campaingWithSell(player1, game1, campaign1);
		
		

	}

}
