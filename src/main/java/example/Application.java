package example;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

@SpringBootApplication
public class Application {
	private static final Logger LOG = Logger.getLogger(Handler.class);
	private final MyService service;

	public Application(MyService service) {
		this.service = service;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public Function<Map<String, Object>, ApiGatewayResponse> reverseString() {
		return value -> {
			LOG.info("received: " + value);
			Response responseBody = new Response(">>>>>>> Go Serverless v1.x! Your function executed successfully!", value);
			return ApiGatewayResponse.builder()
					.setStatusCode(200)
					.setObjectBody(responseBody)
					.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & serverless"))
					.build();
		};
	}

}
