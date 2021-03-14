package it.usuratonkachi.nativedemo.service;

import it.usuratonkachi.nativedemo.dto.HelloWorldResponseDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class HelloWorldService {

    public Mono<HelloWorldResponseDto> getHelloWorld() {
        return Mono.just(HelloWorldResponseDto.buildStaticResponse());
    }

}
