package com.linear.redbook.oss.biz.service;

import com.linear.framework.common.response.Response;
import org.springframework.web.multipart.MultipartFile;


public interface FileService {

    /**
     * 上传文件
     * 
     * @param file
     * @return
     */
    Response<?> uploadFile(MultipartFile file);
}
