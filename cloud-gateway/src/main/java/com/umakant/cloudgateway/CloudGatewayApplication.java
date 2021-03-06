 package com.umakant.cloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class CloudGatewayApplication {

	public static void main(String[] args) {
		//Hello Umakant Upadhyay Ji 16112021fdsafdsf fsdfdsfdsfdsfhello Umakant dsafsafdsa
		SpringApplication.run(CloudGatewayApplication.class, args);
	}

}
