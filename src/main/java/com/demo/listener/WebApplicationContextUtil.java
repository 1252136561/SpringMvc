package com.demo.listener;

import org.springframework.context.ApplicationContext;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;

public class WebApplicationContextUtil {

public static ApplicationContext getWebApplicationContext(ServletContext servletContext){

    return (ApplicationContext)servletContext.getAttribute("app");
}

}
