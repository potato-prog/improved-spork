package potato.prog.improvedspork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SporkController {

    @GetMapping("/spork")
    public String displayWelcomeMessage() {
        return "Improved Spork";
    }
}
