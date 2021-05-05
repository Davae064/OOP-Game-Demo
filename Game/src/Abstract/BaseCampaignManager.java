package Abstract;

import Entities.Campaigns;

public abstract class BaseCampaignManager implements ICampaignService{

	@Override
	public void addCampaign(Campaigns campaign) {
		System.out.println("Kampanya eklendi: "+campaign.getName());	
	}

	@Override
	public void deleteCampaign(Campaigns campaign) {
		System.out.println("Kampanya silindi: "+campaign.getName());
	}

	@Override
	public void updateCampaign(Campaigns campaign) {
		System.out.println("Kampanya güncellendi: "+campaign.getName());
		
	}

}
