package com.linear.redbook.search.service;


import com.linear.framework.common.response.PageResponse;
import com.linear.redbook.search.model.vo.SearchNoteReqVO;
import com.linear.redbook.search.model.vo.SearchNoteRspVO;

public interface NoteService {

    /**
     * 搜索笔记
     * @param searchNoteReqVO
     * @return
     */
    PageResponse<SearchNoteRspVO> searchNote(SearchNoteReqVO searchNoteReqVO);
}

