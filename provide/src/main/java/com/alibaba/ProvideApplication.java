package com.alibaba;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 王亚奇
 * @date 2019/7/13 9:53
 */
@SpringBootApplication
@EnableDubboConfiguration
public class ProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class, args);
    }
}
