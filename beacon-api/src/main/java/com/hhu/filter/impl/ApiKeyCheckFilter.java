package com.hhu.filter.impl;

import com.hhu.filter.CheckFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service(value = "apikey")
@Slf4j
public class ApiKeyCheckFilter implements CheckFilter {
    @Override
    public void check(Object obj) {
        log.info("【接口模块-校验apikey】   校验中");
    }
}
