package com.example.consumer.receiver;

import com.example.consumer.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author vienci
 * @date 2022/2/11 上午10:32
 */

/**
 * 这是一个消息消费者
 */
@Component
public class MessageReceiver {

    @RabbitListener(queues = RabbitConfig.QUEUE_NAME)
    public void handleMsg(String msg) {
        System.out.println(" msg= " + msg);
    }

}
