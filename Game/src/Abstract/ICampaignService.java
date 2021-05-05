package Abstract;

import Entities.Campaigns;

public interface ICampaignService {

	void addCampaign(Campaigns campaign);
	
	void deleteCampaign(Campaigns campaign);
	
	void updateCampaign(Campaigns campaign);
}
