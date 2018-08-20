package com.kaizen.pms.domain.config;

import com.kaizen.pms.domain.Accountability;
import com.kaizen.pms.domain.ConnectionAccountabilityType;

public class AccountTypeConfiguration {
	
	public static void createAccountabiltyRuleSet() {
		
		ConnectionAccountabilityType.createAccountabilityRules(
					Accountability.ACCNT_TYP_REG_SEASON);
		
		ConnectionAccountabilityType.createAccountabilityRules(
				Accountability.ACCNT_TYP_REG_TOURNAMET);
	}

}
