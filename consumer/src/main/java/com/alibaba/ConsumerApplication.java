package com.alibaba;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 王亚奇
 * @date 2019/7/13 9:52
 */
@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
