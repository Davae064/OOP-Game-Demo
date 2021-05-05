import java.time.LocalDate;

import Abstract.BaseCampaignManager;
import Abstract.BaseGamerManager;
import Abstract.BaseGamesManager;
import Concrete.CampaignManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Concrete.GamesManager;
import Entities.Gamers;
import Entities.Games;
import Entities.Campaigns;

public class Main {

	public static void main(String[] args) {
		
		Gamers gamer1 = new Gamers(1231231,"Bilgehan","Yaradanakul","Davae064",LocalDate.of(2004, 03, 12),"12345678901");
		Gamers gamer2 = new Gamers(12312,"Tolga","Yaradanakul","SeeYouLater",LocalDate.of(1997, 02, 21),"12345678902");
		Campaigns campaign = new Campaigns(12312, "Efsane Cuma", 50);
		
		BaseGamerManager baseGamerManager = new GamerManager(new GamerCheckManager());
		baseGamerManager.signUp(gamer1);
		
		baseGamerManager.signUp(gamer2);
		
		baseGamerManager.delete(gamer2);
		
		baseGamerManager.update(gamer1);
		System.out.println("---------------------------------");
		
		
		Games game1 = new Games(13212, "Marko3", 55, "Multiplayer fps lan game");
		
		BaseGamesManager baseGamesManager = new GamesManager();
		baseGamesManager.selling(gamer2, game1);
		System.out.println("----------------------------------");
		
		
		
		BaseCampaignManager baseCampaignManager = new CampaignManager();
		baseCampaignManager.addCampaign(campaign);
		baseCampaignManager.deleteCampaign(campaign);
		baseCampaignManager.updateCampaign(campaign);
		System.out.println("----------------------------------");
		
		baseGamesManager.selling(gamer1, game1, campaign);
		
		
		
	}

}
