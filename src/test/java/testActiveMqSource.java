import boot.activemq.BootActivemqController;
import boot.activemq.producer.IMessageProducerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
/**
 * @date ：2019/11/10 18:29
 * @Author : 安儿
 * Description: TODO
 */
@SpringBootTest(classes = BootActivemqController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class testActiveMqSource {
    @Autowired
    private IMessageProducerService service;
    @Test
    public void testSend()throws Exception {
        for (int i = 0; i < 100; i++) {
            this.service.sendMessage("mldn"+i);
        }
    }
}
