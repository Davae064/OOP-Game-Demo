package Abstract;

import Entities.Gamers;

public abstract class BaseGamerManager implements IGamerService{

	@Override
	public void signUp(Gamers gamer) {
		System.out.println("Kay�t olundu ho�geldiniz: "+gamer.getUsername());
		
	}

	@Override
	public void update(Gamers gamer) {
		System.out.println("Hesap g�ncellendi: "+gamer.getUsername());
		
	}

	@Override
	public void delete(Gamers gamer) {
		System.out.println("Hesap silindi: "+gamer.getUsername());
		
	}

}
