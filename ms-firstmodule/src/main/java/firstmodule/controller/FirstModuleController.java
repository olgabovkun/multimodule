package firstmodule.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/first")
public class FirstModuleController {

    @GetMapping("/greeting")
    public String greeting() {
        return "Hello from first module";
    }
    
}
