package com.miser.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public String contextLoads() {
		return "Hello Docker World";
	}

}
