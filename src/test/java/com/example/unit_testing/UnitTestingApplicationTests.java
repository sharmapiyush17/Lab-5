package com.example.unit_testing;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class UnitTestingApplicationTests {

	@Test
	void contextLoads() {

		UnitTestingApplication x= new UnitTestingApplication();
		assertEquals(10, x.sub(20, 10));
	}

}
