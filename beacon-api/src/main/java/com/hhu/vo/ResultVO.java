package com.hhu.vo;

import lombok.Data;

/**
 * 响应信息
 */
@Data
public class ResultVO {
    private Integer code;

    private String msg;

    private Integer count;

    private Long fee;

    private String uid;

    private String sid;
}
