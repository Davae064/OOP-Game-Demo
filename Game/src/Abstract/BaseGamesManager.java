package Abstract;

import Entities.Campaigns;
import Entities.Gamers;
import Entities.Games;

public abstract class BaseGamesManager implements IGamesService{
	
	@Override
	public void selling(Gamers gamer,Games game) {
		System.out.println(game.getName()+" oyununu satýn aldýnýz: "+gamer.getUsername());
	}
	
	public void selling(Gamers gamer,Games game,Campaigns campaign) {
		System.out.println(game.getName()+" oyununu %"+campaign.getDiscount()+" indirim ile aldýnýz: "+gamer.getUsername());
	}
	
}
