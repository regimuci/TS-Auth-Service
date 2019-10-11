package TSSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TsSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsSecurityApplication.class, args);
	}

}
