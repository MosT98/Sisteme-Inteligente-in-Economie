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

//        TargetAudience targetAudience = new TargetAudience(MonthlyIncomeInterval.UNDER_1000);
//        TargetAudience targetAudience2 = new TargetAudience(AgeInterval.UNDER_18);
//        SocialMediaProfile socialMediaProfile = new SocialMediaProfile(
//                "PaginaFacebook", 215, 24, SocialMediaPlatform.FACEBOOK);
        var promotedProduct = new PromotedProduct(ProductCategory.UNKNOWN, Instant.parse("2020-10-01T00:00:00.00Z"), "NumeProdusPromovat");
        SocialMediaProfile socialMediaProfile2 = new SocialMediaProfile(
                "PaginaTest", 215, 24, SocialMediaPlatform.INSTAGRAM);
//        var promoter = new Promoter(
//                "Cosmin",
//                Collections.emptyList(),
//                List.of(socialMediaProfile2),
//                Instant.parse("2021-10-01T00:00:00.00Z"),
//                Instant.parse("2021-10-23T00:00:00.00Z"));

//        kSession.insert(targetAudience);
//        kSession.insert(targetAudience2);
//        kSession.insert(socialMediaProfile);

        kSession.insert(promotedProduct);
//        kSession.insert(socialMediaProfile2);
//        kSession.insert(promoter);

        kSession.fireAllRules();

    }
}
