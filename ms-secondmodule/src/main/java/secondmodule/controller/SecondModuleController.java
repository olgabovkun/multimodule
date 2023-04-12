package secondmodule.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/second")
public class SecondModuleController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello from second module";
    }
    
}
