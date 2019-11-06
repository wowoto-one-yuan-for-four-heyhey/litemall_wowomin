package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value="专题controller",tags={"专题管理"})
@RestController
@RequestMapping("/topics")
public class TopicController {
    @PostMapping("")
    @ApiOperation("添加专题")
    public void addTopic(){ }

    @DeleteMapping("{topicId}")
    @ApiOperation("删除专题")
    public void deleteTopic(){ }

    @PatchMapping("{topicId}")
    @ApiOperation("修改专题信息")
    public void updateTopic(){ }
}
