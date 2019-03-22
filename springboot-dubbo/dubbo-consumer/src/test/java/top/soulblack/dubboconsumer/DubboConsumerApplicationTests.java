package top.soulblack.dubboconsumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.soulblack.dubboconsumer.Controller.HelloController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboConsumerApplicationTests {

    @Test
    public void contextLoads() {
        HelloController helloController = new HelloController();
        helloController.Hello();
    }

}
