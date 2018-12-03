package cn.wy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: Wy
 * @create: 2018-12-03 15:37
 **/

@Controller
public class CSSTestController {



    @RequestMapping("/cssTest")
    public String cssTest() {
        return "cssTest";
    }



}
