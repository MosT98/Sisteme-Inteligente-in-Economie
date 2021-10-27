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
        var targetAudience5 = new TargetAudience(AgeInterval.BETWEEN_30_AND_40);

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
        var socialMediaProfile6 = new SocialMediaProfile("PaginaDeFacebook", 145000);
        var socialMediaProfile7 = new SocialMediaProfile(SocialMediaPlatform.INSTAGRAM);

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
        var promoter4 = new Promoter(
                "CCC",
                List.of(promotedProduct3),
                Collections.emptyList(),
                Instant.parse("2021-10-01T00:00:00.00Z"),
                Instant.parse("2021-10-15T00:00:00.00Z"));
        var promoter5 = new Promoter("DDD");
        var promoter6 = new Promoter("EEE");

        var marketingStrategy = new MarketingStrategy(targetAudience2);
        var marketingStrategy2 = new MarketingStrategy(targetAudience3);
        var marketingStrategy3 = new MarketingStrategy(List.of(socialMediaProfile4));
        var marketingStrategy4 = new MarketingStrategy(List.of(socialMediaProfile5));
        var marketingStrategy5 = new MarketingStrategy(123123, Instant.parse("2021-12-02T00:00:00.00Z"), Instant.parse("2021-12-23T00:00:00.00Z"));
        var marketingStrategy6 = new MarketingStrategy(101010,targetAudience4);
        var marketingStrategy7 = new MarketingStrategy(List.of(socialMediaProfile6));
        var marketingStrategy8 = new MarketingStrategy(55000, Instant.parse("2021-09-01T00:00:00.00Z"), Instant.parse("2021-11-01T00:00:00.00Z"));
        var marketingStrategy9 = new MarketingStrategy(List.of(socialMediaProfile7));
        var marketingStrategy10 = new MarketingStrategy(4500, List.of(promoter5, promoter6));
        var marketingStrategy11 = new MarketingStrategy(targetAudience5, Instant.parse("2021-09-02T00:00:00.00Z"), Instant.parse("2021-12-02T00:00:00.00Z"));

        var company = new Company(List.of(marketingStrategy6));
        var company2 = new Company(List.of(marketingStrategy9));
        var company3 = new Company(List.of(marketingStrategy10));
        var company4 = new Company(List.of(marketingStrategy11));

        kSession.insert(targetAudience);
        kSession.insert(targetAudience2);
        kSession.insert(targetAudience3);
        kSession.insert(targetAudience4);
        kSession.insert(targetAudience5);

        kSession.insert(socialMediaProfile);
        kSession.insert(socialMediaProfile2);
        kSession.insert(socialMediaProfile3);
        kSession.insert(socialMediaProfile4);
        kSession.insert(socialMediaProfile5);
        kSession.insert(socialMediaProfile6);
        kSession.insert(socialMediaProfile7);

        kSession.insert(promotedProduct);
        kSession.insert(promotedProduct2);
        kSession.insert(promotedProduct3);
        kSession.insert(promotedProduct4);
        kSession.insert(promotedProduct5);

        kSession.insert(promoter);
        kSession.insert(promoter2);
        kSession.insert(promoter3);
        kSession.insert(promoter4);
        kSession.insert(promoter5);
        kSession.insert(promoter6);

        kSession.insert(marketingStrategy);
        kSession.insert(marketingStrategy2);
        kSession.insert(marketingStrategy3);
        kSession.insert(marketingStrategy4);
        kSession.insert(marketingStrategy5);
        kSession.insert(marketingStrategy6);
        kSession.insert(marketingStrategy7);
        kSession.insert(marketingStrategy8);
        kSession.insert(marketingStrategy9);
        kSession.insert(marketingStrategy10);
        kSession.insert(marketingStrategy11);

        kSession.insert(company);
        kSession.insert(company2);
        kSession.insert(company3);
        kSession.insert(company4);

        kSession.fireAllRules();
    }
}
