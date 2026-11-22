package com.linear.redbook.count.biz.service;

import com.linear.framework.common.response.Response;
import com.linear.redbook.count.dto.FindNoteCountsByIdRspDTO;
import com.linear.redbook.count.dto.FindNoteCountsByIdsReqDTO;

import java.util.List;


public interface NoteCountService {

    /**
     * 批量查询笔记计数
     * @param findNoteCountsByIdsReqDTO
     * @return
     */
    Response<List<FindNoteCountsByIdRspDTO>> findNotesCountData(FindNoteCountsByIdsReqDTO findNoteCountsByIdsReqDTO);
}

