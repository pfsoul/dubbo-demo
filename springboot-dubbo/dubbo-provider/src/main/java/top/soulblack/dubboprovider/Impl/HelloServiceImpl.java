package top.soulblack.dubboprovider.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import top.soulblack.dubboapi.service.HelloService;

/**
 * @Author: 廉雪峰
 * @Date: 2019/3/22 16:46
 * @Version 1.0
 */
@Service(interfaceClass = HelloService.class)
@Component
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("Hello " + name);
        return "true";
    }
}
