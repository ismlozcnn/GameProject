package gameProject;

public class SaleManager implements SaleService {

	@Override
	public void sell(Player player, Game game) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kullan�c�ya " + game.getPrice()
				+ " fiyat�yla " + game.getName()+" oyunu sat�ld�");

	}

	@Override
	public void refund(Player player, Game game) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kullan�c�ya " + game.getPrice()
		+ " fiyat�yla " + game.getName()+" oyununun �creti iade edildi.");

	}

	@Override
	public void campaingWithSell(Player player, Game game,Campaign campaign) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kullan�c�ya " + campaign.getDiscount()
		+ " indirimi uygulanarak " + game.getName()+" oyunu sat�ld�");

	}

}
