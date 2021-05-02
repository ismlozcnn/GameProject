package gameProject;

public class PlayerManager implements PlayerService {
	
	ValidationManager validationManager;	

	public PlayerManager(ValidationManager validationManager) {		
		this.validationManager = validationManager;
	}

	@Override
	public void add(Player player,User user) {
		if(validationManager.validation(player, user)==true) {
			System.out.println("kullanýcý doðrulama baþarýlý oyuncu eklendi");
		}
		else {
			System.out.println("kullanýcý tc ve oyuncu tc eþleþmediði için oyuncu eklenmedi!");
		}
		
	}

	@Override
	public void delete(Player player,User user) {
		if(validationManager.validation(player, user)==true) {
			System.out.println("kullanýcý doðrulama baþarýlý oyuncu silindi");
		}
		else {
			System.out.println("kullanýcý tc ve oyuncu tc eþleþmediði için oyuncu silinemedi!");
		}
		
	}

	@Override
	public void update(Player player,User user) {
		if(validationManager.validation(player, user)==true) {
			System.out.println("kullanýcý doðrulama baþarýlý oyuncu güncellendi");
		}
		else {
			System.out.println("kullanýcý tc ve oyuncu tc eþleþmediði için oyuncu güncellenemedi!");
		}
		
	}

}
