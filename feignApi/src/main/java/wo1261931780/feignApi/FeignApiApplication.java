package wo1261931780.feignApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 64234
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "wo1261931780.feignApi.Clients")
public class FeignApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignApiApplication.class, args);
	}

}
