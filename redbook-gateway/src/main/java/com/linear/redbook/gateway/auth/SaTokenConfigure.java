package com.linear.redbook.gateway.auth;

import cn.dev33.satoken.reactor.filter.SaReactorFilter;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SaTokenConfigure {
    // 注册 Sa-Token全局过滤器
    @Bean
    public SaReactorFilter getSaReactorFilter() {
        return new SaReactorFilter()
                // 拦截地址
                .addInclude("/**")    /* 拦截全部path */
                // 鉴权方法：每次访问进入
                .setAuth(obj -> {
                    // 登录校验
                    SaRouter.match("/**") // 拦截所有路由
                            .notMatch("/auth/login") // 排除登录接口
                            .notMatch("/auth/verification/code/send") // 排除验证码发送接口
                            .notMatch("/test")
                            .notMatch("/count/user/data")
                            // Knife4j / SpringDoc 文档相关路径
                            .notMatch("/doc.html")
                            .notMatch("/doc.html/**")
                            .notMatch("/swagger-ui/**")
                            .notMatch("/swagger-resources/**")
                            .notMatch("/v3/api-docs/**")
                            .notMatch("/webjars/**")
                            .notMatch("/favicon.ico")
                            // 各微服务 api-docs（Gateway 转发给下游）
                            .notMatch("/auth/v3/api-docs/**")
                            .notMatch("/user/v3/api-docs/**")
                            .notMatch("/note/v3/api-docs/**")
                            .notMatch("/relation/v3/api-docs/**")
                            .notMatch("/comment/v3/api-docs/**")
                            .notMatch("/oss/v3/api-docs/**")
                            .notMatch("/kv/v3/api-docs/**")
                            .notMatch("/count/v3/api-docs/**")
                            .notMatch("/search/v3/api-docs/**")
                            .notMatch("/id/v3/api-docs/**")
                            .check(r -> StpUtil.checkLogin()) // 校验是否登录
                    ;

                    // 权限认证 -- 不同模块, 校验不同权限
                    SaRouter.match("/auth/logout", r -> StpUtil.checkPermission("user"));
                    // SaRouter.match("/admin/**", r -> StpUtil.checkPermission("admin"));
                       // SaRouter.match("/goods/**", r -> StpUtil.checkPermission("goods"));
                    // SaRouter.match("/orders/**", r -> StpUtil.checkPermission("orders"));

                    // 更多匹配 ...  */
                });
    }
}