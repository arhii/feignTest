package pl.arhii.Feign_test.REST;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "RestService", url = "127.0.0.1:8081")
public interface RestService {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    String hello(@RequestParam(value = "name") String name);
//    String hello(@RequestParam String name);

    /*@RequestMapping(method = RequestMethod.POST, path = "/test")
    String test(@RequestParam String text);*/
    @RequestMapping(method = RequestMethod.POST, path = "/test")
    String test(@RequestParam(value = "text") String text);
}
