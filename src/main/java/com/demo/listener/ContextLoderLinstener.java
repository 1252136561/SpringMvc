package com.demo.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoderLinstener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {


        //读取web.xml中的全局参数
         ServletContext servletContext = servletContextEvent.getServletContext();
         String config = servletContext.getInitParameter("contextConfiguration");
        //上下文初始化
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(config);

        //吧Spring应用上下文对象存到ServletContext域中

        servletContext.setAttribute("app",app);
        System.out.println("listener执行完毕");
    }

    @Override

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
//上下文会
    }
}
