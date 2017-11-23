package me.rainbow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author guojinpeng
 * @date 17.11.22 11:46
 */
@Controller
@RequestMapping("/table")
public class TableController {
    @RequestMapping(params = "get")
    @ResponseBody
    public Map<String, Object> hello(Model model) throws ParseException {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        ArrayList<Map<String, Object>> maps = new ArrayList<Map<String, Object>>();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id", "1");
        map.put("name", "zs");
        map.put("startDay", "2017-11-29 18:32:32");
        maps.add(map);
        map = new HashMap<String, Object>();
        map.put("id", "2");
        map.put("name", "ls");
        map.put("startDay", "2017-11-25 10:47:13");
        maps.add(map);
        map = new HashMap<String, Object>();
        map.put("id", "3");
        map.put("name", "zg");
        map.put("startDay", "2017-11-22 12:30:56");
        maps.add(map);
        map = new HashMap<String, Object>();
        map.put("id", "4");
        map.put("name", "gf");
        map.put("startDay", "2017-11-20 21:32:20");
        maps.add(map);
        map = new HashMap<String, Object>();
        map.put("id", "5");
        map.put("name", "wk");
        map.put("startDay", "2017-11-16 12:43:23");
        maps.add(map);
        hashMap.put("data", maps);
        hashMap.put("code", "0");
        hashMap.put("count", maps.size());
        return hashMap;
    }
}
