package sample.sanjeeva.rabbitmq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sample.sanjeeva.rabbitmq.publisher.Producer;


@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	Producer producer;
	
	@RequestMapping("/send")
	public String sendMessage(@RequestParam("msg") String msg){
		producer.sendMessage(msg);
		return "Message sent Successfully";
	}
	


}
