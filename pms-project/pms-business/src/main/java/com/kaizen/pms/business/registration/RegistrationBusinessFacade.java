package com.kaizen.pms.business.registration;

import com.kaizen.pms.domain.Accountability;

public interface RegistrationBusinessFacade {
	
	void performSeasonRegistration(Accountability accountability);
	void performTryoutRegistration(Accountability accountability);

}
