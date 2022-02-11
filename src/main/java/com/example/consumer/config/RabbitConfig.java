package com.example.consumer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author vienci
 * @date 2022/2/11 上午10:27
 */
@Configuration
public class RabbitConfig {

//    public static final String QUEUE_NAME = "queue_name";
      public static final String QUEUE_NAME = "hello_world_queue_name";

    @Bean
    Queue getQueue() {
        return new Queue(QUEUE_NAME, true, false, false);
    }
}
