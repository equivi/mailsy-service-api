package com.equivi.mailsy.service.dto;

import java.io.Serializable;
import java.util.List;

public class CampaignSubscriberList implements Serializable {

    private List<CampaignEmailObject> campaignEmailObjectList;

    public List<CampaignEmailObject> getCampaignEmailObjectList() {
        return campaignEmailObjectList;
    }

    public void setCampaignEmailObjectList(List<CampaignEmailObject> campaignEmailObjectList) {
        this.campaignEmailObjectList = campaignEmailObjectList;
    }
}
