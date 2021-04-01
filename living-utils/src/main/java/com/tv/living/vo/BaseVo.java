package com.tv.living.vo;

import lombok.Data;

import java.io.Serializable;
@Data
public class BaseVo implements Serializable {

    private Integer pageSize = 0;

    private Integer pageNum = 20;
}
