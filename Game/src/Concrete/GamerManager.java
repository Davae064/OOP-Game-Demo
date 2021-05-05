package Concrete;

import Abstract.BaseGamerManager;
import Abstract.IGamerCheckService;
import Entities.Gamers;



public class GamerManager extends BaseGamerManager{

	private IGamerCheckService igamerCheckService;
	
	public GamerManager(IGamerCheckService igamerCheckService) {
		this.igamerCheckService = igamerCheckService;
	}

	@Override
	public void signUp(Gamers gamer) {
		
		if(igamerCheckService.gamerCheck(gamer)) {
			System.out.println("Kayýt olundu hoþgeldiniz: "+gamer.getUsername());
		}else {
			System.out.println("Hesabýnýz onaylanamadý");
		}
		
	}

}
