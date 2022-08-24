
import com.wei.RabbitMQApplication;
import com.wei.producer.MessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes = RabbitMQApplication.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class RabbitMQTest {

    @Resource
    MessageProducer producer;

    @Test
    public void sendTest(){
        producer.send("312");
    }
}
