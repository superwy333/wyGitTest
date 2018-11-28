package cn.wy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-27 13:19
 **/

@Controller
@RequestMapping(value = "/testRestController")
public class TestRestController {




    @RequestMapping(value = "/test", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ResponseBody
    public Map<String,Object> test(Map<String,Object> map) {
        Map<String,Object> result = new HashMap<String,Object>();
        try {
            System.out.println(map.get("req"));
            result  = map;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;


    }



}
