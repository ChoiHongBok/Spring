package com.chb.spring.login.vo;

import lombok.Data;

import java.util.Date;

@Data
public class LoginVo {

    private String id;

    private String password;

    private String name;

    private String sex;

    private String phoneNumber;

    private Date createDt;

    private Date updateDt;

}
