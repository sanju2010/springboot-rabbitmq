package sample.sanjeeva.rabbitmq.subcriber;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
@Component
public class MessageListener {
	
	@RabbitListener(queues="${ssr.queue.name}")
    public void recievedMessage(@Payload String msg, @Headers Map<String, String> headers) {
        System.out.println("Recieved Message: " + msg);
        System.out.println("headers Message: " + headers);
    }
}
