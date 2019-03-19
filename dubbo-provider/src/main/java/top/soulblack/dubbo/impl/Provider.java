package top.soulblack.dubbo.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: 廉雪峰
 * @Date: 2019/3/19 10:23
 * @Version 1.0
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-provider.xml");
        System.out.println(context.getDisplayName() + ":here");
        context.start();
        System.out.println("服务启动");
        System.in.read();
    }
}
