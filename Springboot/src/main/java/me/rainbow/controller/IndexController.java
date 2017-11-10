package me.rainbow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guojinpeng
 * @date 17.11.10 10:44
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
