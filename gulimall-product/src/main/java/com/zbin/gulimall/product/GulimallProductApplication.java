package com.zbin.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zbin.gulimall.product.dao")
public class GulimallProductApplication {

  public static void main(String[] args) {
    SpringApplication.run(GulimallProductApplication.class, args);
  }

}
