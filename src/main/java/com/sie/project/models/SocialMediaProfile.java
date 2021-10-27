package com.sie.project.models;

import com.sie.project.enums.SocialMediaPlatform;

public class SocialMediaProfile {

    private String name;
    private Integer followersCount;
    private Integer totalPostsCount;
    private Integer minimumPostsCountPerMonth = 10;
    private SocialMediaPlatform platform;



    public SocialMediaProfile(SocialMediaPlatform platform) {
        this.platform = platform;
    }

    public SocialMediaProfile(String name, Integer followersCount, Integer postsCount, SocialMediaPlatform platform) {
        this.name = name;
        this.followersCount = followersCount;
        this.totalPostsCount = postsCount;
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public Integer getTotalPostsCount() {
        return totalPostsCount;
    }

    public void setTotalPostsCount(Integer totalPostsCount) {
        this.totalPostsCount = totalPostsCount;
    }

    public Integer getMinimumPostsCountPerMonth() {
        return minimumPostsCountPerMonth;
    }

    public void setMinimumPostsCountPerMonth(Integer minimumPostsCountPerMonth) {
        this.minimumPostsCountPerMonth = minimumPostsCountPerMonth;
    }

    public SocialMediaPlatform getPlatform() {
        return platform;
    }

    public void setPlatform(SocialMediaPlatform platform) {
        this.platform = platform;
    }
}
