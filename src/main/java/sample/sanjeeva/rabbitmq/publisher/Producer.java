package sample.sanjeeva.rabbitmq.publisher;

import org.springframework.amqp.core.AmqpTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Producer {
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	@Value("${ssr.rabbitmq.exchange}")
	private String exchange;
	
	@Value("${ssr.rabbitmq.topicname}")
	private String topicname;
	
	public void sendMessage(String msg){
		amqpTemplate.convertAndSend(exchange, topicname, msg);
		System.out.println("sending message>>>" + msg);
	}
}
