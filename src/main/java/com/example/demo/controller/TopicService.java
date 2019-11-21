package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

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




    /*
     * 话题操作
     */

    @PostMapping("topics/search")
    @ApiOperation("搜索专题")
    public ArrayList<Object> searchTopic(@ApiParam(name="name",value="专题标题")   String name){ return new ArrayList<>();}

    @PostMapping("topics")
    @ApiOperation("添加专题")
    public Object addTopic(@ApiParam(name="topic",value="专题信息")   Object topic){return new Object(); }

    @DeleteMapping("topic/{id}")
    @ApiOperation("删除专题")
    public boolean deleteTopic(@ApiParam(name="id",value="专题ID")  @PathVariable("id") String id){return true; }

    @PatchMapping("topic/{id}")
    @ApiOperation("修改专题信息")
    public Object updateTopic(@ApiParam(name="id",value="专题ID")  @PathVariable("id") String id,@ApiParam(name="topic",value="专题信息")   Object topic){ return new Object();}





}
