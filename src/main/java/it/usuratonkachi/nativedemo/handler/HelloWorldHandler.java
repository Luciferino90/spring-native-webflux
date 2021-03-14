package it.usuratonkachi.nativedemo.handler;

import it.usuratonkachi.nativedemo.openapi.HelloWorldOpenApiHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloWorldHandler {

    private final HelloWorldOpenApiHandler helloWorldOpenApiHandler;

    public HelloWorldHandler(HelloWorldOpenApiHandler helloWorldOpenApiHandler) {
        this.helloWorldOpenApiHandler = helloWorldOpenApiHandler;
    }

    public Mono<ServerResponse> getHelloWorld(ServerRequest serverRequest){
        return helloWorldOpenApiHandler.getHelloWorld().flatMap(response -> ServerResponse.ok().bodyValue(response));
    }

}
