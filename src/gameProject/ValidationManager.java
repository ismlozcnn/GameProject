package gameProject;

public class ValidationManager implements ValidationService {

	@Override
	public boolean validation(Player player,User user) {
		if(player.getNationalIdentity()==user.getNationalIdentity() ) {
			return true;
		}
		else {
			return false;
		}
	}

}
