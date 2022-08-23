import com.wei.C3P0SpringBootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest(classes = C3P0SpringBootApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class C3P0DataSourceTest {

    @Resource
    private DataSource dataSource;

    @Test
    public void testDataSource() throws SQLException {
        System.out.println(this.dataSource.getConnection());
    }
}
