package com.chb.spring.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

// @Configuration : 설정파일을 위한 어노테이션 or Bean 등록을 위한 어노테이션
@Configuration
public class AppConfig {

    // @Value : 외부 설정 파일, 시스템 속성 or 환경 변수를 통해 주입할 떄 사용
    @Value(value = "${spring.datasource.url}")
    private String datasourceUrl;

    @Value(value = "${spring.datasource.username}")
    private String datasourceUsername;

    @Value(value = "${spring.datasource.password}")
    private String datasourcePassword;

    @Value(value = "${spring.datasource.driver-class-name}")
    private String datasourceDriverClassname;

    // @Bean 메서드 레벨에 적용하여 그 메서드가 반환하는 객체를 Spring IoC 컨테이너에 빈으로 등록합니다
    @Bean
    public DataSource dataSource() {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(datasourceUrl);
        basicDataSource.setUsername(datasourceUsername);
        basicDataSource.setPassword(datasourcePassword);
        basicDataSource.setDriverClassName(datasourceDriverClassname);

        return basicDataSource;
    }

}
