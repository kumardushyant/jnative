package tut.dushyant.jnative.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import tut.dushyant.jnative.data.OsDetails;


@RestController
@RequestMapping("/api")
public class WebResource {

    @GetMapping(value="/details")
    public OsDetails helloString() {

        String host = System.getenv("HOSTNAME");
        String podName = System.getenv("KUBERNETES_POD_NAME");
        String nameSpace = System.getenv("KUBERNETES_NAMESPACE");
        String nodeName = System.getenv("KUBERNETES_NODE_NAME");
        return new OsDetails(host, podName, nameSpace, nodeName);

    }
    
}
