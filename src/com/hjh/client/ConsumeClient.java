package com.hjh.client;

import java.io.IOException;

/**
 * @author 洪锦辉
 * 2022/3/20
 */

public class ConsumeClient {
    public static void main(String[] args) throws IOException {
        String message = MqClient.consume();
        System.out.println("消费的消息为 : " + message);
    }
}
