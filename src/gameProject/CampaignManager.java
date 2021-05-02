package gameProject;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli kampanya eklendi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli kampanya güncellendi");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName()+" isimli kampanya silindi");
		
	}

	@Override
	public void applyCampaign(Game game, Campaign campaign) {
		int newPrice=(int)(game.getPrice() - (game.getPrice()*campaign.getDiscount())/100);
		game.setPrice(newPrice);
		System.out.println(campaign.getName()+ " isimli kampanya ile oyunun fiyatý :"+game.getPrice());
		
	}

}
