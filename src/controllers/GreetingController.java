package controllers;

import com.sun.xml.internal.ws.api.server.Module;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sun.security.pkcs11.Secmod;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model modle){
        modle.addAttribute("name", name);
        return "index";
    }
}
