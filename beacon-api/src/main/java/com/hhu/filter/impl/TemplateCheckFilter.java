package com.hhu.filter.impl;

import com.hhu.filter.CheckFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service(value = "template")
@Slf4j
public class TemplateCheckFilter implements CheckFilter {
    @Override
    public void check(Object obj) {
        log.info("【接口模块-校验模块】   校验中");
    }
}
