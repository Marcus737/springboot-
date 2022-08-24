import com.wei.MailAppplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = MailAppplication.class)
@RunWith(SpringRunner.class)
public class MailTest {

    @Resource
    JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    String mailUsername;

    @Test
    public void test(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(mailUsername);
        message.setTo("1040186242@qq.com");
        message.setSubject("test");
        message.setText("conte321nt");
        javaMailSender.send(message);
    }
}
