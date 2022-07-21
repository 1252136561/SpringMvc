package com.demo.controller;

import com.demo.domain.User;
import com.demo.domain.Vo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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
    @RequestMapping(value = "/001")
    @ResponseBody//告知Springmvc不进行页面跳转，进行返回
    //Springmvc把User直接回写，需要配置适配器spring-mvc.xml

    public void save001(String username,int age) throws IOException {
        System.out.println(username);
        System.out.println(age);
    }//获得基本数据


    //获得POJO数据
    @RequestMapping(value = "/002")
    @ResponseBody//告知Springmvc不进行页面跳转，进行返回
    //Springmvc把User直接回写，需要配置适配器spring-mvc.xml

    public void save002 (User user) throws IOException {
        System.out.println(user);

    }
    //获得数组数据
    @RequestMapping(value = "/003")
    @ResponseBody//告知Springmvc不进行页面跳转，进行返回

    //Springmvc把User直接回写，需要配置适配器spring-mvc.xml
    public void save003(String[] str) throws IOException {
        System.out.println(Arrays.asList(str));

    }

    //获得集合数据
    @RequestMapping(value = "/004")
    @ResponseBody//告知Springmvc不进行页面跳转，进行返回

    //Springmvc把User直接回写，需要配置适配器spring-mvc.xml
    public void save004(Vo vo) throws IOException {
        System.out.println(vo);

        //只要形参和domain对象内参数一致就可以封装起来


    }

    //获得集合数据，用ajax实现直接在方法上用集合
    @RequestMapping(value = "/ajax")
    @ResponseBody//告知Springmvc不进行页面跳转，进行返回

    //Springmvc把User直接回写，需要配置适配器spring-mvc.xml
    public void f(@RequestBody List<User> List) throws IOException {
        System.out.println(List);

        //只要形参和domain对象内参数一致就可以封装起来


    }


}
