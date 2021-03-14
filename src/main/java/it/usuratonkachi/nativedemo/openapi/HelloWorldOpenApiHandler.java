package it.usuratonkachi.nativedemo.openapi;

import it.usuratonkachi.nativedemo.dto.HelloWorldResponseDto;
import it.usuratonkachi.nativedemo.service.HelloWorldService;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class HelloWorldOpenApiHandler {

    private final HelloWorldService helloWorldService;

    public HelloWorldOpenApiHandler(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public Mono<String> getHelloWorld() {
        return helloWorldService.getHelloWorld().map(HelloWorldResponseDto::getContent);
    }

}
