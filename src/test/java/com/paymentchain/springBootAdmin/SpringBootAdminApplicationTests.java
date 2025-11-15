package com.paymentchain.springBootAdmin;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(
	webEnvironment = SpringBootTest.WebEnvironment.NONE,
	properties = {
		"eureka.client.enabled=false",
		"spring.cloud.config.enabled=false"
	}
)
@ActiveProfiles("test")
class SpringBootAdminApplicationTests {

	@Test
	void contextLoads() {
		// Test passes if Spring context loads successfully
	}

}
