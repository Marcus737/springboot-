import com.wei.ActiveMQApplication;
import com.wei.producer.MessageProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@SpringBootTest(classes = ActiveMQApplication.class)
@RunWith(SpringRunner.class)
@WebAppConfiguration
public class ActiveMQTest {

    @Resource
    MessageProducer producer;

    @Test
    public void sendTest(){
        producer.send("312");
    }
}
