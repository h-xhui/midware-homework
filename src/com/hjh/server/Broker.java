package com.hjh.server;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 消息处理中心类
 *
 * @author 洪锦辉
 * 2022/3/20
 */

public class Broker {
    private final static int MAX_SIZE = 3;
    private static ArrayBlockingQueue<String> messageQueue = new ArrayBlockingQueue<>(MAX_SIZE);

    public static void produce(String msg) {
        if (messageQueue.offer(msg)) {
            System.out.println("成功想消息中心投递消息：" + msg + ",当前暂存的消息数量是：" + messageQueue.size());
        } else {
            System.out.println("消息队列容量已满");
        }
        System.out.println("----------------------");
    }

    public static String consume() {
        String msg = messageQueue.poll();
        if (msg != null) {
            System.out.println("已经消费消息:" + msg + ",当前暂存的消息数量是" + messageQueue.size());
        } else {
            System.out.println("消息队列消息为空");
        }

        System.out.println("----------------------");
        return msg;
    }
}
