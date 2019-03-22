package top.soulblack.dubboconsumer.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import top.soulblack.dubboapi.service.HelloService;

/**
 * @Author: 廉雪峰
 * @Date: 2019/3/22 16:58
 * @Version 1.0
 */
@Component
public class HelloController {

    @Reference(url = "dubbo://127.0.0.1:20880")
    private static HelloService helloService;

    public void Hello() {
        helloService.sayHello("springboot-dubbo!");
    }
}
