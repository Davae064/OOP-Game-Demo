package Concrete;

import Abstract.IGamerCheckService;
import Entities.Gamers;

public class GamerCheckManager implements IGamerCheckService{

	@Override
	public boolean gamerCheck(Gamers gamer) {
		if(gamer.getNationalId()== "12345678901") {
			return true;
		}else {
			return false;
		}
		
	}

	
}
