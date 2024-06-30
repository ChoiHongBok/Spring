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

        // Mysql Connection 셋팅
//        // setInitialSize 커넥션 풀 처음 시작 시 생성할 초기 커넥션 수
//        basicDataSource.setInitialSize(5);
//
//        // 유휴? 상태에서 유지할 수 있는 최대 커넥션 수
//        basicDataSource.setMaxIdle(10);
//
//        // 최대 활성화 커넥션 수
//        basicDataSource.setMaxActive(100);
//
//        // 커넥션이 유효한지 검사하기 위해 실행할 SQL 쿼리 : 커넥션이 풀에서 사용되기 전에 실행되어 커넥션이 여전히 유효한지 확인
//        basicDataSource.setValidationQuery("SELECT 1");
//
//        // 유휴 상태의 커넥션이 유효한지 테그스트할지를 설정 true 로 설정 시 유휴 커넥션이 주기적으로 유효성 검사를 받는다
//        basicDataSource.setTestWhileIdle(true);
//
//        // 유휴 커넥션을 검사하는 주기 설정정
//        basicDataSource.setTimeBetweenEvictionRunsMillis(60000);

        return basicDataSource;
    }

}
