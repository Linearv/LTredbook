package com.linear.redbook.auth.service;

import com.linear.framework.common.response.Response;
import com.linear.redbook.auth.model.SendVerificationCodeReqVO;

public interface VerificationCodeService {
    Response<?> send(SendVerificationCodeReqVO sendVerificationCodeReqVO);
}
