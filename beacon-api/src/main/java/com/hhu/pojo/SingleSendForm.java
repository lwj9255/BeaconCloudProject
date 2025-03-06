package com.hhu.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class SingleSendForm {
    /** 客户的apikey */
    @NotBlank(message = "apikey不能为空")
    private String apikey;

    /** 手机号 */
    @NotBlank(message = "手机号不能为空")
    private String mobile;

    /** 短信内容 */
    @NotBlank(message = "短信内容不能为空")
    private String text;

    /** 客户业务内的uid */
    private String uid;

    /** 0-验证码短信 1-通知类短信 2-营销类短信 */
    @NotNull(message = "短信类型不能为空")
    @Range(min = 0,max = 2,message = "短信类型从0~2")
    private Integer state;
}
