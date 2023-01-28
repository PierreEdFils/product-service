package com.careerdevs.productservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@Testcontainers
class ProductServiceApplicationTests {

	@Container
	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:6.0.4");

	static  void setProperties (DynamicPropertyRegistry dymDnamicPropertyRegistry){
		dymDnamicPropertyRegistry.add("spring,data.mongodb.uri",mongoDBContainer::getReplicaSetUrl);
	}

	@Test
	void contextLoads() {
	}

}
