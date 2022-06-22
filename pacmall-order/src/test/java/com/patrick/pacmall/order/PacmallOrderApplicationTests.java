package com.patrick.pacmall.order;


import com.patrick.pacmall.order.entity.OrderEntity;
import com.patrick.pacmall.order.entity.OrderReturnReasonEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class PacmallOrderApplicationTests {
    @Autowired
    AmqpAdmin amqpAdmin;

    @Autowired
    RabbitTemplate rabbitTemplate;

    /**
     * 创建Exchange
     * 1、如何利用Exchange,Queue,Binding
     * 1、使用AmqpAdmin进行创建
     * 2、如何收发信息
     */
    @Test
    public void contextLoads() {
        //    public DirectExchange(
        //    String name, 交换机的名字
        //    boolean durable, 是否持久
        //    boolean autoDelete, 是否自动删除
        //    Map<String, Object> arguments)
        //    {
        DirectExchange directExchange = new DirectExchange("hello-java.exchange", true, false);
        amqpAdmin.declareExchange(directExchange);
        log.info("Exchange[{}]创建成功：", "hello-java.exchange");
    }

    /**
     * 创建队列
     */
    @Test
    public void createQueue() {
        // public Queue(String name, boolean durable, boolean exclusive, boolean autoDelete, Map<String, Object> arguments) {
        Queue queue = new Queue("hello-java-queue", true, false, false);
        amqpAdmin.declareQueue(queue);
        log.info("Queue[{}]:", "创建成功");
    }

    /**
     * 绑定队列
     */
    @Test
    public void createBinding() {
        // public Binding(String destination, 目的地
        // DestinationType destinationType, 目的地类型
        // String exchange,交换机
        // String routingKey,//路由键
        Binding binding = new Binding("hello-java-queue",
                Binding.DestinationType.QUEUE,
                "hello-java.exchange",
                "hello.java", null);
        amqpAdmin.declareBinding(binding);
        log.info("Binding[{}]创建成功", "hello-java-binding");
    }

    @Test
    public void sendMessageTest() {
        OrderReturnReasonEntity entity = new OrderReturnReasonEntity();
        entity.setId(1L);
        entity.setCreateTime(new Date());
        //1.发送消息,如果发送对象使用序列化机制,将对象写出去,对象必须实现Serializable
        String s = "Hello World";
        //2.发送的消息变为json格式
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                entity.setName("Vc" + i);
                rabbitTemplate.convertAndSend("hello-java-exchange", "hello.java", entity);
            } else {
                OrderEntity orderEntity = new OrderEntity();
                orderEntity.setOrderSn(UUID.randomUUID().toString());
                rabbitTemplate.convertAndSend("hello-java-exchange", "hello.java", orderEntity);
            }
            log.info("消息发送完成{}" + entity);
        }
    }

    @Test
    public void createExchange() {
        DirectExchange directExchange = new DirectExchange("hello-java-exchange", true, false);
        amqpAdmin.declareExchange(directExchange);
        log.info("exchange:[{}]创建成功", "hello-java-exchange");
    }

    @Test
    public void regionCodeTest() {
        String code = "110101";
        String code1 = code.substring(0, 2);
        System.out.println(code1);
    }
}
