package com.linear.redbook.kv.biz.service;

import com.linear.framework.common.response.Response;
import com.linear.redbook.kv.dto.req.AddNoteContentReqDTO;
import com.linear.redbook.kv.dto.req.DeleteNoteContentReqDTO;
import com.linear.redbook.kv.dto.req.FindNoteContentReqDTO;
import com.linear.redbook.kv.dto.rsp.FindNoteContentRspDTO;


public interface NoteContentService {

    /**
     * 添加笔记内容
     * 
     * @param addNoteContentReqDTO
     * @return
     */
    Response<?> addNoteContent(AddNoteContentReqDTO addNoteContentReqDTO);

    /**
     * 查询笔记内容
     *
     * @param findNoteContentReqDTO
     * @return
     */
    Response<FindNoteContentRspDTO> findNoteContent(FindNoteContentReqDTO findNoteContentReqDTO);


    /**
     * 删除笔记内容
     *
     * @param deleteNoteContentReqDTO
     * @return
     */
    Response<?> deleteNoteContent(DeleteNoteContentReqDTO deleteNoteContentReqDTO);
}
