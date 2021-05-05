package Abstract;

import Entities.Gamers;

public interface IGamerService {

	void signUp(Gamers gamer);
	
	void update(Gamers gamer);
	
	void delete(Gamers gamer);
	
}
