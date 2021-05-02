package gameProject;

public class PlayerManager implements PlayerService {
	
	ValidationManager validationManager;	

	public PlayerManager(ValidationManager validationManager) {		
		this.validationManager = validationManager;
	}

	@Override
	public void add(Player player,User user) {
		if(validationManager.validation(player, user)==true) {
			System.out.println("kullan�c� do�rulama ba�ar�l� oyuncu eklendi");
		}
		else {
			System.out.println("kullan�c� tc ve oyuncu tc e�le�medi�i i�in oyuncu eklenmedi!");
		}
		
	}

	@Override
	public void delete(Player player,User user) {
		if(validationManager.validation(player, user)==true) {
			System.out.println("kullan�c� do�rulama ba�ar�l� oyuncu silindi");
		}
		else {
			System.out.println("kullan�c� tc ve oyuncu tc e�le�medi�i i�in oyuncu silinemedi!");
		}
		
	}

	@Override
	public void update(Player player,User user) {
		if(validationManager.validation(player, user)==true) {
			System.out.println("kullan�c� do�rulama ba�ar�l� oyuncu g�ncellendi");
		}
		else {
			System.out.println("kullan�c� tc ve oyuncu tc e�le�medi�i i�in oyuncu g�ncellenemedi!");
		}
		
	}

}
