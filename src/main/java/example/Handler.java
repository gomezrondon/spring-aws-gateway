package example;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import java.util.Map;

public class Handler extends SpringBootRequestHandler<Map<String, Object>, ApiGatewayResponse> {
}
