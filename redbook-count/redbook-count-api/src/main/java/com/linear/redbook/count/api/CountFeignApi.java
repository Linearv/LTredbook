package com.linear.redbook.count.api;


import com.linear.framework.common.response.Response;
import com.linear.redbook.count.contstant.ApiConstants;
import com.linear.redbook.count.dto.FindNoteCountsByIdRspDTO;
import com.linear.redbook.count.dto.FindNoteCountsByIdsReqDTO;
import com.linear.redbook.count.dto.FindUserCountsByIdReqDTO;
import com.linear.redbook.count.dto.FindUserCountsByIdRspDTO;
import com.linear.redbook.count.fallback.CountFeignApiFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = ApiConstants.SERVICE_NAME,fallback = CountFeignApiFallback.class)
public interface CountFeignApi {

    String PREFIX = "/count";

    /**
     * 查询用户计数
     *
     * @param findUserCountsByIdReqDTO
     * @return
     */
    @PostMapping(value = PREFIX + "/user/data")
    Response<FindUserCountsByIdRspDTO> findUserCount(@RequestBody FindUserCountsByIdReqDTO findUserCountsByIdReqDTO);


    /**
     * 批量查询笔记计数
     *
     * @param findNoteCountsByIdsReqDTO
     * @return
     */
    @PostMapping(value = PREFIX + "/notes/data")
    Response<List<FindNoteCountsByIdRspDTO>> findNotesCount(@RequestBody FindNoteCountsByIdsReqDTO findNoteCountsByIdsReqDTO);

}

