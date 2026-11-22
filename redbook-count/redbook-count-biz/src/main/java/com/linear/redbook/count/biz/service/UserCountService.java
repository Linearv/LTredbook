package com.linear.redbook.count.biz.service;


import com.linear.framework.common.response.Response;
import com.linear.redbook.count.dto.FindUserCountsByIdReqDTO;
import com.linear.redbook.count.dto.FindUserCountsByIdRspDTO;

public interface UserCountService {

    /**
     * 查询用户相关计数
     * @param findUserCountsByIdReqDTO
     * @return
     */
    Response<FindUserCountsByIdRspDTO> findUserCountData(FindUserCountsByIdReqDTO findUserCountsByIdReqDTO);
}

