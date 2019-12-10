package potato.prog.improvedspork.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SporkController {

    @ResponseBody
    @GetMapping("/spork")
    public String displayWelcomeMessage() {
        return "Improved Spork";
    }

    @GetMapping("/spork/thyme")
    public String displayWelcomeMessagePage() {
        return "welcome";
    }
}
