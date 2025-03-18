package com.hhu.controller;

import com.hhu.enums.SmsCodeEnum;
import com.hhu.pojo.SingleSendForm;
import com.hhu.util.R;
import com.hhu.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
@Slf4j
public class SmsController {

    // produces指定响应的媒体类型（Accept）
    @PostMapping(value = "/single_send",produces = "application/json;charset=utf-8")
    public ResultVO singleSend(@RequestBody @Validated SingleSendForm singleSendForm, // @Validated对绑定到 Java 对象的请求数据进行验证
                               BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            String msg = bindingResult.getFieldError().getDefaultMessage();
            log.info("【接口模块-单条短信Controller】 参数不合法，msg="+msg);
            return R.error(SmsCodeEnum.PARAMETER_ERROR.getCode(),msg);
        }
        return R.ok();
    }
}
