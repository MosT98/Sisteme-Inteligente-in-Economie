package com.sie.project.models;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class MarketingStrategy {
    private Integer allocatedBudget;
    private Instant campaignStartDate;
    private Instant campaignEndDate;
    private List<SocialMediaProfile> socialMediaProfiles;
    private List<Promoter> promoters;
    private TargetAudience targetAudience;

    private Integer maximumNumberOfPromoters;

    public MarketingStrategy(
            Integer allocatedBudget,
            Instant campaignStartDate,
            Instant campaignEndDate,
            List<SocialMediaProfile> socialMediaProfiles,
            List<Promoter> promoters,
            TargetAudience targetAudience,
            Integer maximumNumberOfPromoters)
    {
        this.allocatedBudget = allocatedBudget;
        this.campaignStartDate = campaignStartDate;
        this.campaignEndDate = campaignEndDate;
        this.socialMediaProfiles = socialMediaProfiles;
        this.promoters = promoters;
        this.targetAudience = targetAudience;
        this.maximumNumberOfPromoters = maximumNumberOfPromoters;
    }

    public Integer getAllocatedBudget() {
        return allocatedBudget;
    }

    public void setAllocatedBudget(Integer allocatedBudget) {
        this.allocatedBudget = allocatedBudget;
    }

    public Instant getCampaignStartDate() {
        return campaignStartDate;
    }

    public void setCampaignStartDate(Instant campaignStartDate) {
        this.campaignStartDate = campaignStartDate;
    }

    public Instant getCampaignEndDate() {
        return campaignEndDate;
    }

    public void setCampaignEndDate(Instant campaignEndDate) {
        this.campaignEndDate = campaignEndDate;
    }

    public List<SocialMediaProfile> getSocialMediaProfiles() {
        return socialMediaProfiles;
    }

    public void setSocialMediaProfiles(List<SocialMediaProfile> socialMediaProfiles) {
        this.socialMediaProfiles = socialMediaProfiles;
    }

    public List<Promoter> getPromoters() {
        return promoters;
    }

    public void setPromoters(List<Promoter> promoters) {
        this.promoters = promoters;
    }

    public TargetAudience getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(TargetAudience targetAudience) {
        this.targetAudience = targetAudience;
    }

    public Integer getMaximumNumberOfPromoters() {
        return maximumNumberOfPromoters;
    }

    public void setMaximumNumberOfPromoters(Integer maximumNumberOfPromoters) {
        this.maximumNumberOfPromoters = maximumNumberOfPromoters;
    }
}


