package com.chenjiacheng.perf.db;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Created by chenjiacheng on 2024/12/12 00:23
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class})
public class PerfDBApplication {
    public static void main(String[] args) {
        SpringApplication.run(PerfDBApplication.class,args);
        log.info("perf-db has been stared.");
    }
}
