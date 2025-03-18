package com.hhu.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class TestController {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @PostMapping("/test/set/{key}")
    public String set(@PathVariable String key, @RequestBody Map map){
        redisTemplate.opsForHash().putAll(key,map);
        return "ok";
    }

    @GetMapping("/test/get/{key}")
    public Map<Object, Object> get(@PathVariable String key){
        Map<Object,Object> result = redisTemplate.opsForHash().entries(key);
        return result;
    }
}
