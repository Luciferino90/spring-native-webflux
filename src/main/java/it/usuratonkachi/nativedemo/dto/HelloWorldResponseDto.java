package it.usuratonkachi.nativedemo.dto;

import java.io.Serializable;

public class HelloWorldResponseDto implements Serializable {

    private static final long serialVersionUID = 8263745903482715544L;

    private String content;

    public HelloWorldResponseDto() { }

    public HelloWorldResponseDto(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static HelloWorldResponseDto buildStaticResponse() {
        return new HelloWorldResponseDto("HelloWorld");
    }

}
