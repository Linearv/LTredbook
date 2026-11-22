package com.linear.redbook.search.service;


import com.linear.framework.common.response.PageResponse;
import com.linear.redbook.search.model.vo.SearchUserReqVO;
import com.linear.redbook.search.model.vo.SearchUserRspVO;

public interface UserService {

    /**
     * 搜索用户
     * @param searchUserReqVO
     * @return
     */
    PageResponse<SearchUserRspVO> searchUser(SearchUserReqVO searchUserReqVO);


}

