package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Api(tags = "专题微服务")
@RestController
public class TopicService {

    /*
     * 专题
     */
    @GetMapping("topics")
    @ApiOperation("获得所有专题")
    public ArrayList<Object> getAllTopics(){ return new ArrayList<Object>(); }

    @GetMapping("topics/{id}")
    @ApiOperation("查看特定专题")
    public Object getOneTopic(@ApiParam(name="id",value="话题ID",required=true) @PathVariable("id") String id){ return new Object(); }







}
