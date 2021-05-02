package gameProject;

public interface SaleService {
	void sell(Player player,Game game);
	void refund(Player player,Game game);
	void campaingWithSell(Player player,Game game,Campaign campaign);
	

}
