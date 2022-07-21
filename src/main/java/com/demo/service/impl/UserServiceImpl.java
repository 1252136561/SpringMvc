package com.demo.service.impl;



import com.demo.dao.UserDao;
import com.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//<bean id="userService" class="com.com.demo.com.demo.service.impl.UserServiceImpl">
//<property name="userDao" ref="userDao"></property>
//</bean>
@Service("userService")
//@Scope("prototype")//多个bean/单个singleton
public class UserServiceImpl implements UserService {

//    @Autowired

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //    @Qualifier("userDao")//注入
    @Resource(name="userDao")//=A+Q，注解向下匹配，即定义之后下方就跟private xxx
//    @Value("${jdbc.driver}")//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }//注解可以不写set


    private UserDao userDao;

    public void save() {

        userDao.save();
    }
    @PostConstruct
    public void init(){
        System.out.println("初始化...");
    }
    @PreDestroy
    public void des(){
        System.out.println("销毁对象...");
    }
}
