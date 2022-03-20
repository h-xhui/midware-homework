package com.hjh.client;

import java.io.IOException;

/**
 * @author 洪锦辉
 * 2022/3/20
 */

public class ProduceClient {
    public static void main(String[] args) throws IOException {
        MqClient.produce("Hello World");
    }
}
