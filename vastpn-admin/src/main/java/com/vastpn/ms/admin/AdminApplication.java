package com.vastpn.ms.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
import org.springframework.context.annotation.Configuration;

/**
 * <pre>
 * <b>.</b>
 * <b>Description:</b>
 *
 * <b>Author: 641597345@qq.com </b>
 * <b>Date: 2018/9/26 0026 09:24   </b>
 * <b>Copyright:</b> Copyright 2008-2026 http://www.jinvovo.com Technology Co., Ltd. All rights reserved.
 * <b>Changelog:</b>
 *   ----------------------------------------------------------------------------
 *   Ver    Date                     Author                        Detail
 *   ----------------------------------------------------------------------------
 *   1.0   2018/9/26 0026 09:24          641597345@qq.com            new file.
 * <pre>
 */

@EnableTurbine
@EnableAdminServer
@EnableHystrixDashboard
@SpringCloudApplication
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class,args);
    }
}
