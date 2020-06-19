package boot.activemq.producer.impl;

import boot.activemq.producer.IMessageProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;


@Service
public class IMessageProducerServiceImpl implements IMessageProducerService {
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	@Autowired private Queue queue;

	@Override
	public void sendMessage(String msg) {
		this.jmsMessagingTemplate.convertAndSend(this.queue,msg);
	}
}
