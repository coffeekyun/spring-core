package coffekyun.springcore;

import coffekyun.springcore.qualifier.Member;
import coffekyun.springcore.qualifier.MemberService;
import coffekyun.springcore.qualifier.QualifierMemberConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QualiferTest {

    @Test
    void testCreateQualifier() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(QualifierMemberConfiguration.class);

        MemberService memberService = applicationContext.getBean(MemberService.class);

        Member normalMemberRepository = applicationContext.getBean("memberNormalRepository", Member.class);
        Member premiumMemberRepository = applicationContext.getBean("memberPremiumRepository", Member.class);


        Assertions.assertSame(normalMemberRepository,  memberService.getMemberNormalRepository());
        Assertions.assertSame(premiumMemberRepository,  memberService.getMemberPremiumRepository());


    }
}
