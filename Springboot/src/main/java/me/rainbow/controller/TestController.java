package me.rainbow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author guojinpeng
 * @date 17.11.3 15:32
 */
@Controller
@RequestMapping("/test")
public class TestController {
//    private final TransactionPropagation transactionPropagationService;
//
//    @Autowired
//    public TestController(TransactionPropagation transactionPropagationService) {
//        this.transactionPropagationService = transactionPropagationService;
//    }
//
//    @RequestMapping(params = "service")
//    public String service() {
//        return transactionPropagationService.hello();
//    }

    @RequestMapping(params = "hello")
    public String hello(Model model) {
        model.addAttribute("hello", "hello world!");
        model.addAttribute("ok", "hello world!");
        return "hell";
    }

    @RequestMapping(params = "list")
    public String list(HttpServletRequest request) {
        File file = new File("C:/Files/data");
        HashMap<String, String> map = new HashMap<String, String>();
        ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
        ArrayList<File> arrayList = new ArrayList<File>();
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    map.put("name", f.getName());
                    map.put("path", f.getAbsolutePath());
                    System.out.println(f.getName());
//                    list.add(map);
                    arrayList.add(f);
                }
            }
        }
//        request.setAttribute("list", list);
        request.setAttribute("list", arrayList);
        return "hello";
    }
}
