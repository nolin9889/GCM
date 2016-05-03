package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyAZmj94eahwWwsmUCLP2vhJwbAK3zNt0-k";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bEnQ6V7jsaCE-ZfnUtRHoM4QyvoDizGl-pusLkTZtCFY_G3BaTQWjaukOOdjMpjSVCCwGV-9Jdl6TScZeSDj_BR0qkosRUYtuBe9_59yHCNk9T5ZWzSvC-Dkhu7wJxFyHXziVVc");

        c.createData("Working!!", "Test message");

        return c;
    }
}

