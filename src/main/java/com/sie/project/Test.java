package com.sie.project;

import com.sie.project.enums.AgeInterval;
import com.sie.project.enums.MonthlyIncomeInterval;
import com.sie.project.enums.ProductCategory;
import com.sie.project.enums.SocialMediaPlatform;
import com.sie.project.models.PromotedProduct;
import com.sie.project.models.Promoter;
import com.sie.project.models.SocialMediaProfile;
import com.sie.project.models.TargetAudience;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        KieServices kS = KieServices.Factory.get();
        KieContainer kC = kS.getKieClasspathContainer();
        KieSession kSession = kC.newKieSession("ksession-rules");

        var targetAudience = new TargetAudience(MonthlyIncomeInterval.UNDER_1000);
        var targetAudience2 = new TargetAudience(AgeInterval.UNDER_18);

        var promotedProduct = new PromotedProduct(ProductCategory.UNKNOWN, Instant.parse("2021-11-20T00:00:00.00Z"), "NumeProdusPromovat");
        var promotedProduct2 = new PromotedProduct(ProductCategory.UNKNOWN, Instant.parse("2021-10-23T00:00:00.00Z"), "Nutella");

        var socialMediaProfile = new SocialMediaProfile("PaginaTest", 215, 24, SocialMediaPlatform.FACEBOOK);
        var socialMediaProfile2 = new SocialMediaProfile("PaginaTest1", 200, 20, SocialMediaPlatform.INSTAGRAM);
        var socialMediaProfile3 = new SocialMediaProfile("PaginaTwitter", 200, 20, SocialMediaPlatform.TWITTER);

        var promoter = new Promoter(
                "Cosmin",
                List.of(promotedProduct2),
                List.of(socialMediaProfile2),
                Instant.parse("2021-10-26T00:00:00.00Z"),
                Instant.parse("2021-10-30T00:00:00.00Z"));

        var promoter2 = new Promoter(
                "AAAA",
                List.of(promotedProduct2),
                List.of(socialMediaProfile3),
                Instant.parse("2021-12-26T00:00:00.00Z"),
                Instant.parse("2021-12-30T00:00:00.00Z"));



        kSession.insert(targetAudience);
        kSession.insert(targetAudience2);
        kSession.insert(socialMediaProfile);
        kSession.insert(socialMediaProfile2);
        kSession.insert(socialMediaProfile3);
        kSession.insert(promotedProduct);
        kSession.insert(promotedProduct2);

        kSession.insert(promoter);
        kSession.insert(promoter2);

        kSession.fireAllRules();

    }
}
