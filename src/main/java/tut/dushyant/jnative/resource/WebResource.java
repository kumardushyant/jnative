package tut.dushyant.jnative.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/")
public class WebResource {
    
    @GetMapping(value="/hello")
    public String helloString() {
        return "Hello World";
    }
    
}
