package gameProject;

public class SaleManager implements SaleService {

	@Override
	public void sell(Player player, Game game) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kullanýcýya " + game.getPrice()
				+ " fiyatýyla " + game.getName()+" oyunu satýldý");

	}

	@Override
	public void refund(Player player, Game game) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kullanýcýya " + game.getPrice()
		+ " fiyatýyla " + game.getName()+" oyununun ücreti iade edildi.");

	}

	@Override
	public void campaingWithSell(Player player, Game game,Campaign campaign) {
		System.out.println(player.getFirstName() + " " + player.getLastName() + " kullanýcýya " + campaign.getDiscount()
		+ " indirimi uygulanarak " + game.getName()+" oyunu satýldý");

	}

}
