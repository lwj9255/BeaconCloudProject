package com.hhu.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RefreshScope
public class CheckFilterContext {
    @Autowired
    private Map<String,CheckFilter> checkFilterMap;

    @Value("${filters:apikey,ip}")
    private String filters;

    public void check(Object obj){
        String[] filterArray = filters.split(",");
        for (String filter : filterArray) {
            System.out.println(checkFilterMap.get(filter));
            CheckFilter checkFilter = checkFilterMap.get(filter);
            checkFilter.check(obj);
        }
    }
}
