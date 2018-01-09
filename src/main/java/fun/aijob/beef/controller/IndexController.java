package fun.aijob.beef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lichen@daojia.com on 2018-1-9.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello AI JOB!";
    }
}
