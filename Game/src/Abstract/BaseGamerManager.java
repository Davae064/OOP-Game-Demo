package Abstract;

import Entities.Gamers;

public abstract class BaseGamerManager implements IGamerService{

	@Override
	public void signUp(Gamers gamer) {
		System.out.println("Kayýt olundu hoþgeldiniz: "+gamer.getUsername());
		
	}

	@Override
	public void update(Gamers gamer) {
		System.out.println("Hesap güncellendi: "+gamer.getUsername());
		
	}

	@Override
	public void delete(Gamers gamer) {
		System.out.println("Hesap silindi: "+gamer.getUsername());
		
	}

}
