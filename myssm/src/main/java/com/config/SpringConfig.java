package com.config;

import com.config.JdbcConfig;
import com.config.MyBatisConfig;
import org.apache.ibatis.type.JapaneseDateTypeHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.dao","com.service"})
@Import({MyBatisConfig.class, JdbcConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
