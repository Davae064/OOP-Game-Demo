package Abstract;

import Entities.Campaigns;
import Entities.Gamers;
import Entities.Games;

public interface IGamesService {

	void selling(Gamers gamer,Games games);
	
	void selling(Gamers gamer,Games games,Campaigns camppaign);
	
}
