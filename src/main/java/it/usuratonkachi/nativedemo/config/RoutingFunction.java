package it.usuratonkachi.nativedemo.config;

import it.usuratonkachi.nativedemo.handler.HelloWorldHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RoutingFunction {

    private final HelloWorldHandler helloWorldHandler;

    public RoutingFunction(HelloWorldHandler helloWorldHandler) {
        this.helloWorldHandler = helloWorldHandler;
    }

    @Bean
    public RouterFunction<ServerResponse> routing() {
        return RouterFunctions.route()
                .GET("/helloworld", helloWorldHandler::getHelloWorld)
                .build();
    }

}
