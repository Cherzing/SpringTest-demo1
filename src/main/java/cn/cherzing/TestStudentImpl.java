package cn.cherzing;

import cn.cherzing.Service.UserService;
import cn.cherzing.dao.UserDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cherzing
 * @date 2024/11/03 0003 13:27
 * @description TestStudentImpl
 */
public class TestStudentImpl {
    @Test
    public void test1(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        IStudent bean = (IStudent)context.getBean("student");
        bean.test();

        System.out.println(bean.toString());
    }
    @Test
    public void test2(){
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext-2.xml");
        IStudent student2 = context.getBean("student2", IStudent.class);
        System.out.println(student2.toString());
    }

    @Test
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-3.xml");
        UserService bean = (UserService)context.getBean("userService");
        boolean fag = bean.login("张三", "123");
        if (fag){
            System.out.println("登陆成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
