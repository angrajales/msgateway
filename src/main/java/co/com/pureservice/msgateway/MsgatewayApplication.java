package co.com.pureservice.msgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaServer
public class MsgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgatewayApplication.class, args);
	}

}
