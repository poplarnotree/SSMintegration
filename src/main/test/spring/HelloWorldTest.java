package spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.service.UserService;
import org.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.spring.service.impl.HelloWorld;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations ={"classpath:application.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloWorldTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        HelloWorld hw = (HelloWorld)context.getBean("hw");
        hw.show();
    }

    @Autowired
    @Qualifier("user")
    private UserService userService;
    @Test
    public void UserTest1(){
        if(userService.login("admin","123456")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    @Test
    public void UserTest(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        UserService us = (UserServiceImpl)context.getBean("user");
        if(us.login("admin","123456")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
