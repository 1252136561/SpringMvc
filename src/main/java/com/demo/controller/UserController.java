package com.demo.controller;

import com.demo.domain.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/0")
//地址拼接/0/1
public class UserController {
    @RequestMapping(value = "/1", method = RequestMethod.GET, params = {"username"})
    public String save() {
        System.out.println("Controller");

        return "syccess";
    }

    @RequestMapping(value = "/2")
    public ModelAndView save02() {
        ModelAndView modelAndView = new ModelAndView();


        //设置View
        modelAndView.setViewName("syccess");
//设置mode数据
        modelAndView.addObject("username", "itcast");
        return modelAndView;
    }

    @RequestMapping(value = "/3")
    public ModelAndView save03(ModelAndView modelAndView) {

        //设置View
        modelAndView.setViewName("syccess");
//设置mode数据
        modelAndView.addObject("username", "itcast02");
        return modelAndView;
    }

    @RequestMapping(value = "/4")
    public String save04(Model model) {


        model.addAttribute("username", "itcast03");
        return "syccess";
    }


    @RequestMapping(value = "/0")
    public String save00(HttpServletRequest request) {
        request.setAttribute("username", "ABC");
        return "syccess";

    }


    @RequestMapping(value = "/00")
    public void save001(HttpServletResponse response) throws IOException {
        response.getWriter().println("Success");
    }

    @RequestMapping(value = "/01")
    @ResponseBody//告知Springmvc不进行页面跳转，进行返回
    public String save002() throws IOException {

        return "002back";
    }

    @RequestMapping(value = "/02")
    @ResponseBody//告知Springmvc不进行页面跳转，进行返回
    public String save003() throws IOException {
        return "{\"username\":\"Hbw\",\"age\":18}";
    }


    @RequestMapping(value = "/03")
    @ResponseBody//告知Springmvc不进行页面跳转，进行返回
    public String save004() throws IOException {
        User user = new User();
        user.setName("hbw");
        user.setAge(18);
        //使用json转换工具，把对象转json

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping(value = "/000")
    @ResponseBody//告知Springmvc不进行页面跳转，进行返回
    //Springmvc把User直接回写，需要配置适配器spring-mvc.xml
    public User save000() throws IOException {

        User user = new User();
        user.setName("hdw");
        user.setAge(19);

        return user;
    }
}
