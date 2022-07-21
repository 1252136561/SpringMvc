package com.demo.web;



import com.demo.service.UserService;
import org.springframework.context.ApplicationContext;

import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ApplicationContext app = new AnnotationConfigApplicationContext(SpringCofiguration.class);
//        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServletContext servletContext =this.getServletContext();

//        ApplicationContext app = ( ApplicationContext) servletContext.getAttribute("app");
//        ApplicationContext app = WebApplicationContextUtil.getWebApplicationContext(servletContext);
        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        System.out.println(app);
        UserService service = (UserService) app.getBean("userService");

        service.save();
    }

}
