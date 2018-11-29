package cn.wy.controller;

import cn.wy.domain.SysUser;
import cn.wy.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: Wy
 * @create: 2018-11-06 17:12
 **/
@Controller
public class TestController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/income")
    public String income() {
        return "income";
    }


    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/error")
    public String error() {
        return "error";
    }

    @RequestMapping("/getAllSysUser")
    @ResponseBody
    public List<SysUser> getAllSysUser() {
        List<SysUser> sysUserList = sysUserService.queryAll();
        return sysUserList;
    }

    @RequestMapping("/getMap")
    @ResponseBody
    public Map<String,Object> getMap() {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("a","1");
        map.put("b","2");
        return map;
    }


    @RequestMapping(value = "/doLogin", method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> login(String loginName, String pwd) {
        System.out.println("loginName>>>>>>>" + loginName);
        System.out.println("pwd>>>>>>>" + pwd);
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("a","1");
        map.put("b","2");
        return map;
    }
}
