package com.tv.living.vo.room;

import com.tv.living.vo.BaseVo;
import lombok.Data;

@Data
public class LiveVo extends BaseVo {

    /**
     * 分类
     */
    private String category;

    /**
     * 主播
     */
    private String anchor;



}
