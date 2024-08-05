package com.chb.spring.login.service;

import com.chb.spring.login.dao.LoginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Service 비즈니스 로직을 구현하는 서비스 클래스를 나타내며 빈으로 등록한다.
@Service
public class LoginService {

    // @Repository 가 없으면 @Autowired 가 빈으로 인식하지 못하여 에러가 발생한다.
    @Autowired
    LoginDao loginDao;

}
