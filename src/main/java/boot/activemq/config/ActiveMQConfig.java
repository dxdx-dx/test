package boot.activemq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import javax.jms.Queue;

/**
 * @date ：2019/11/16 2:58
 * @Author : 安儿
 * Description: TODO
 */
@Configuration
@EnableJms
public class ActiveMQConfig {
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("mldn.msg.queue");
    }
}
