package org.humingk.movie.service.zhihu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/** @author humingk */
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(
    basePackages = {
      "org.humingk.movie.service.zhihu",
      "org.humingk.movie.common",
      "org.humingk.movie.dal"
    })
@MapperScan(
    basePackages = {"org.humingk.movie.dal.mapper.auto", "org.humingk.movie.dal.mapper.plus"})
public class MovieServiceZhihuApplication {

  public static void main(String[] args) {
    SpringApplication.run(MovieServiceZhihuApplication.class, args);
  }
}
