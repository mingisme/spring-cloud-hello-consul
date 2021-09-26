package com.example.springcloudhelloconsul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/config")
public class ConfigController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @Autowired
    private DsProperties dsProperties;

    @RequestMapping("/get")
    public boolean get(){
        return useLocalCache;
    }

    @RequestMapping("/ds")
    public DsProperties ds(){
        return dsProperties;
    }

}
