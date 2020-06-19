package boot.activemq.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @date ：2019/11/16 2:45
 * @Author : 安儿
 * Description: TODO
 */
@Service
public class MessageConsumerService {
    @JmsListener(destination = "mldn.msg.queue")
    public void receiveMessage(String text){ //进行消息的接收处理
        System.out.println("[*****接收消息********]"+text);
    }
}
