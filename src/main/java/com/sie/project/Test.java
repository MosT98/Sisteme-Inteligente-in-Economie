package com.sie.project;

import com.sie.project.enums.*;
import com.sie.project.models.*;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        KieServices kS = KieServices.Factory.get();
        KieContainer kC = kS.getKieClasspathContainer();
        KieSession kSession = kC.newKieSession("ksession-rules");

        var targetAudience = new TargetAudience(MonthlyIncomeInterval.UNDER_1000);
        var targetAudience2 = new TargetAudience(AgeInterval.UNDER_18);
        var targetAudience3 = new TargetAudience(CareerStatus.STUDENT);
        var targetAudience4 = new TargetAudience(AgeInterval.OLDER_THAN_50);

        var promotedProduct = new PromotedProduct(ProductCategory.UNKNOWN, Instant.parse("2021-11-20T00:00:00.00Z"), "NumeProdusPromovat");
        var promotedProduct2 = new PromotedProduct(ProductCategory.UNKNOWN, Instant.parse("2021-10-23T00:00:00.00Z"), "Nutella");
        var promotedProduct3 = new PromotedProduct("ProdusNou");
        var promotedProduct4 = new PromotedProduct("Laptop");
        var promotedProduct5 = new PromotedProduct("Smartphone");

        var socialMediaProfile = new SocialMediaProfile("PaginaTest", 215, 24, SocialMediaPlatform.FACEBOOK);
        var socialMediaProfile2 = new SocialMediaProfile("PaginaTest1", 200, 20, SocialMediaPlatform.INSTAGRAM);
        var socialMediaProfile3 = new SocialMediaProfile("PaginaTwitter", 200, 20, SocialMediaPlatform.TWITTER);
        var socialMediaProfile4 = new SocialMediaProfile("PaginaTwitter", 15000, 20, SocialMediaPlatform.TWITTER);
        var socialMediaProfile5 = new SocialMediaProfile("PaginaTwitter", 15000, 20, SocialMediaPlatform.TIKTOK);

        var promoter = new Promoter(List.of(socialMediaProfile2));
        var promoter2 = new Promoter(
                "AAAA",
                List.of(promotedProduct2),
                List.of(socialMediaProfile3),
                Instant.parse("2021-12-26T00:00:00.00Z"),
                Instant.parse("2021-12-30T00:00:00.00Z"));
        var promoter3 = new Promoter(
                "BBB",
                List.of(promotedProduct3),
                Collections.emptyList(),
                Instant.parse("2021-12-05T00:00:00.00Z"),
                Instant.parse("2021-12-30T00:00:00.00Z"));

        var marketingStrategy = new MarketingStrategy(targetAudience2);
        var marketingStrategy2 = new MarketingStrategy(targetAudience3);
        var marketingStrategy3 = new MarketingStrategy(List.of(socialMediaProfile4));
        var marketingStrategy4 = new MarketingStrategy(List.of(socialMediaProfile5));
        var marketingStrategy5 = new MarketingStrategy(123123, Instant.parse("2021-12-02T00:00:00.00Z"), Instant.parse("2021-12-23T00:00:00.00Z"));
        var marketingStrategy6 = new MarketingStrategy(101010,targetAudience4);

        var company = new Company(List.of(marketingStrategy6));

        kSession.insert(targetAudience);
        kSession.insert(targetAudience2);
        kSession.insert(targetAudience3);
        kSession.insert(targetAudience4);

        kSession.insert(socialMediaProfile);
        kSession.insert(socialMediaProfile2);
        kSession.insert(socialMediaProfile3);
        kSession.insert(socialMediaProfile4);
        kSession.insert(socialMediaProfile5);

        kSession.insert(promotedProduct);
        kSession.insert(promotedProduct2);
        kSession.insert(promotedProduct3);
        kSession.insert(promotedProduct4);
        kSession.insert(promotedProduct5);

        kSession.insert(promoter);
        kSession.insert(promoter2);
        kSession.insert(promoter3);

        kSession.insert(marketingStrategy);
        kSession.insert(marketingStrategy2);
        kSession.insert(marketingStrategy3);
        kSession.insert(marketingStrategy4);
        kSession.insert(marketingStrategy5);
        kSession.insert(marketingStrategy6);

        kSession.insert(company);

        kSession.fireAllRules();
    }
}
