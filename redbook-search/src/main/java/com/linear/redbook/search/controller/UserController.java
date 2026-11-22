package com.linear.redbook.search.controller;

import com.linear.framework.biz.operationlog.aspect.ApiOperationLog;
import com.linear.framework.common.response.PageResponse;
import com.linear.redbook.search.model.vo.SearchNoteReqVO;
import com.linear.redbook.search.model.vo.SearchNoteRspVO;
import com.linear.redbook.search.model.vo.SearchUserReqVO;
import com.linear.redbook.search.model.vo.SearchUserRspVO;
import com.linear.redbook.search.service.NoteService;
import com.linear.redbook.search.service.UserService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/search")
@Slf4j
public class UserController {

    @Resource
    private UserService userService;
    @Resource
    private NoteService noteService;

    @PostMapping("/user")
    @ApiOperationLog(description = "搜索用户")
    public PageResponse<SearchUserRspVO> searchUser(@RequestBody @Validated SearchUserReqVO searchUserReqVO) {
        return userService.searchUser(searchUserReqVO);
    }


    @PostMapping("/note")
    @ApiOperationLog(description = "搜索笔记")
    public PageResponse<SearchNoteRspVO> searchNote(@RequestBody @Validated SearchNoteReqVO searchNoteReqVO) {
        return noteService.searchNote(searchNoteReqVO);
    }


}
