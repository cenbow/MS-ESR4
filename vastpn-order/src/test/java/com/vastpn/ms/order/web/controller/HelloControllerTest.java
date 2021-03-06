package com.vastpn.ms.order.web.controller;

import com.vastpn.ms.order.web.base.BaseController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;


/**
 * <pre>
 * <b>.</b>
 * <b>Description:</b>
 *
 * <b>Author: 641597345@qq.com </b>
 * <b>Date: 2018/10/1 0001 14:13   </b>
 * <b>Copyright:</b> Copyright 2008-2026 http://www.jinvovo.com Technology Co., Ltd. All rights reserved.
 * <b>Changelog:</b>
 *   ----------------------------------------------------------------------------
 *   Ver    Date                     Author                        Detail
 *   ----------------------------------------------------------------------------
 *   1.0   2018/10/1 0001 14:13          641597345@qq.com            new file.
 * <pre>
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest extends BaseController {

    @Test
    public void userLike(){
        ResponseEntity<Object> response = this.restTemplate.getForEntity(
                this.base.toString() + "/order/t1/sayHello", Object.class, "");
        System.out.println("=================================");
        System.out.println(response.getBody());
        System.out.println("=================================");
    }
}
