package gameProject;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
	void applyCampaign(Game game,Campaign campaign);

}
