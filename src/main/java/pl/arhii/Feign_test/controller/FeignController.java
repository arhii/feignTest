package pl.arhii.Feign_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.arhii.Feign_test.RestService;

@org.springframework.web.bind.annotation.RestController
public class FeignController {

    @Autowired
    private RestService restService;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return "Hello " + name + "\nWelcome in feign";
    }

    @GetMapping("/test")
    public String test(@RequestParam String text) {
        return "Test: " + text + "\nFeign rest Service: " + restService.test("Przykładowy tekst z parametrem " + text);
    }
}
