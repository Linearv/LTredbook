package com.linear.redbook.count.biz.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.linear.framework.biz.operationlog.aspect.ApiOperationLog;
import com.linear.framework.common.response.Response;
import com.linear.redbook.count.biz.service.UserCountService;
import com.linear.redbook.count.dto.FindUserCountsByIdReqDTO;
import com.linear.redbook.count.dto.FindUserCountsByIdRspDTO;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/count")
@Slf4j
public class UserCountController {

    @Resource
    private UserCountService userCountService;

    @PostMapping(value = "/user/data")
    @ApiOperationLog(description = "获取用户计数数据")
    @SentinelResource(value = "findUserCountData", blockHandler = "handleBlock")
    public Response<FindUserCountsByIdRspDTO> findUserCountData(@Validated @RequestBody FindUserCountsByIdReqDTO findUserCountsByIdReqDTO) {
        return userCountService.findUserCountData(findUserCountsByIdReqDTO);
    }

    /**
     * Sentinel 限流 / 熔断降级处理
     */
    public Response<FindUserCountsByIdRspDTO> handleBlock(FindUserCountsByIdReqDTO findUserCountsByIdReqDTO, BlockException ex) {
        log.warn("==> 用户计数接口触发 Sentinel 限流或熔断", ex);
        return Response.fail("429", "请求过于频繁，请稍后再试");
    }

}

