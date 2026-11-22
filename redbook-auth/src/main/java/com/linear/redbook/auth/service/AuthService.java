package com.linear.redbook.auth.service;

import com.linear.framework.common.response.Response;
import com.linear.redbook.auth.model.UpdatePasswordReqVO;
import com.linear.redbook.auth.model.UserLoginReqVO;


public interface AuthService {

    /**
     * 登录与注册
     * @param userLoginReqVO
     * @return
     */
    Response<String> loginAndRegister(UserLoginReqVO userLoginReqVO);

    Response<?> logout();

    Response<?> updatePassword(UpdatePasswordReqVO updatePasswordReqVO);
}

