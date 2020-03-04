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

   /*
   @GetMapping("/files")
    @ResponseBody
    public ReturnDto displayFiles() {

        ReturnDto returnDto = new ReturnDto();
        List<String> listOfFiles = new ArrayList<>();

        File file = new File("C:\\Users");
        String[] files = file.list();

        for (String s : files) {
            listOfFiles.add(s);
        }
        returnDto.setSampleFiles(listOfFiles);
        return returnDto;
    }
    */
}

