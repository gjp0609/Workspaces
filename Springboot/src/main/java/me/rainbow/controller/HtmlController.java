package me.rainbow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guojinpeng
 * @date 17.11.9 15:34
 */
@Controller
@RequestMapping("/html")
public class HtmlController {

    @RequestMapping(params = "goto")
    public String x(String html) {
        return html;
    }
}
