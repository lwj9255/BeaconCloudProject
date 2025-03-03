package com.hhu.filter.impl;

import com.hhu.filter.CheckFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service(value = "mobile")
@Slf4j
public class MobileCheckFilter implements CheckFilter {
    @Override
    public void check(Object obj) {
        log.info("【接口模块-校验手机号】   校验中");
    }
}
