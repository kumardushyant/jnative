package tut.dushyant.jnative.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import tut.dushyant.jnative.data.OsDetails;


@RestController
@RequestMapping("/api")
public class WebResource {

    private final Logger logger = LoggerFactory.getLogger(WebResource.class);
    
    @GetMapping(value="/details")
    public OsDetails helloString() {

        String host = System.getenv("HOSTNAME");
        System.getenv().forEach((key, val) -> logger.info("key: " + key + " value: " + val));
        return new OsDetails(host, null, null);

    }
    
}
