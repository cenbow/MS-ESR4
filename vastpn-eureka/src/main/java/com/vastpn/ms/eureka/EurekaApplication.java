package com.vastpn.ms.eureka;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * <pre>
 * <b>注册中心启动服务.</b>
 * <b>Description:</b>
 *
 * <b>Author: 641597345@qq.com </b>
 * <b>Date: ${DATE} ${TIME}   </b>
 * <b>Copyright:</b> Copyright 2008-2026 http://www.jinvovo.com Technology Co., Ltd. All rights reserved.
 * <b>Changelog:</b>
 *   ----------------------------------------------------------------------------
 *   Ver    Date                     Author                        Detail
 *   ----------------------------------------------------------------------------
 *   1.0   ${DATE} ${TIME}          641597345@qq.com            new file.
 * <pre>
 */

@EnableEurekaServer
@SpringBootApplication
@Log4j2
public class EurekaApplication {

    private final static Logger logger =  LogManager.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
        log.info("注册中心启动开始");
        SpringApplication.run(EurekaApplication.class, args);
        log.info("注册中心启动成功");
    }
}
