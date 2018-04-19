package nl.kristalsoftware.ci.concourse.echo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoResource {

    @RequestMapping("/echo")
    public String echo() {
        return "\"echo\": \"MyHelloWorld\"";
    }
}
