package com.postmark.java.client;

import com.postmark.java.client.triggers.rules.PostmarkRuleClient;
import com.postmark.java.exception.PostmarkException;
import com.postmark.java.model.InboundRule;

import java.util.List;

/**
 * Created by Saurabh Sejpal on Feb 20 2016.
 */
public class PostmarkRuleClientTest {

    public static void main(String[] args) throws PostmarkException {
        PostmarkRuleClient postmarkRuleClient = new PostmarkRuleClient();

        long ruleId = createInboundRule(postmarkRuleClient);

        getInboundRules(postmarkRuleClient);

        deleteRule(postmarkRuleClient, ruleId);

        getInboundRules(postmarkRuleClient);

    }

    public static void getInboundRules(PostmarkRuleClient postmarkRuleClient) throws PostmarkException {
        List<InboundRule> inboundRules  =   postmarkRuleClient.getInboundRules();
        for (InboundRule inboundRule : inboundRules) {
            System.out.println(inboundRule.toString());
        }

    }

    public static long createInboundRule(PostmarkRuleClient postmarkRuleClient) throws PostmarkException {
        InboundRule inboundRule = new InboundRule();
        inboundRule.setRule("someone@example.coms");
        inboundRule = postmarkRuleClient.createInboundRule(inboundRule);
        System.out.println(inboundRule.toString());
        return inboundRule.getRuleId();
    }

    public static void deleteRule(PostmarkRuleClient postmarkRuleClient, long ruleId) throws PostmarkException {
        System.out.println(postmarkRuleClient.deleteRule(ruleId).toString());
    }

}
