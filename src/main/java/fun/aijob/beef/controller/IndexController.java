package fun.aijob.beef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lichen@daojia.com on 2018-1-9.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    String home(Model model) {

        model.addAttribute( "name","lichen" );
        //return index page
        return "index";
//        return "Hello AI JOB!";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
