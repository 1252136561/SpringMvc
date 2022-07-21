package com.demo.dao.impl;
import com.demo.dao.UserDao;
import org.springframework.stereotype.Component;

@Component("userDao")//配置bean
//@Repository("userDao")//仓库配置bean，component一样
public class userDaoImpl implements UserDao {
//  <bean id="userDao" class="com.com.demo.com.demo.dao.impl.userDaoImpl"></bean>

    public void save(){

    System.out.println("Go!");
    }
}
