package com.sie.project.models;

import java.time.Instant;
import java.util.Date;
import java.util.List;

public class Promoter {

    private String name;
    private List<PromotedProduct> promotedProductList;
    private List<SocialMediaProfile> socialMediaProfiles;
    private Instant promotionStartDate;
    private Instant promotionEndDate;

    public Promoter(String name,
                    List<PromotedProduct> promotedProductList,
                    List<SocialMediaProfile> socialMediaProfiles,
                    Instant promotionStartDate,
                    Instant promotionEndDate) {
        this.name = name;
        this.promotedProductList = promotedProductList;
        this.socialMediaProfiles = socialMediaProfiles;
        this.promotionStartDate = promotionStartDate;
        this.promotionEndDate = promotionEndDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PromotedProduct> getPromotedProductList() {
        return promotedProductList;
    }

    public void setPromotedProductList(List<PromotedProduct> promotedProductList) {
        this.promotedProductList = promotedProductList;
    }

    public List<SocialMediaProfile> getSocialMediaProfiles() {
        return socialMediaProfiles;
    }

    public void setSocialMediaProfiles(List<SocialMediaProfile> socialMediaProfiles) {
        this.socialMediaProfiles = socialMediaProfiles;
    }

    public Instant getPromotionStartDate() {
        return promotionStartDate;
    }

    public void setPromotionStartDate(Instant promotionStartDate) {
        this.promotionStartDate = promotionStartDate;
    }

    public Instant getPromotionEndDate() {
        return promotionEndDate;
    }

    public void setPromotionEndDate(Instant promotionEndDate) {
        this.promotionEndDate = promotionEndDate;
    }
}
