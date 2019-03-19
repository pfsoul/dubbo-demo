package top.soulblack.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.soulblack.dubbo.service.DemoService;

/**
 * @Author: 廉雪峰
 * @Date: 2019/3/19 10:28
 * @Version 1.0
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermissions(2l));
    }
}
