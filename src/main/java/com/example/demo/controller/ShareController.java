package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value="分享controller",tags={"管理员操作接口"})
@RestController
@RequestMapping("")
public class ShareController {

    /*
     * 分享规则管理
     */

    @GetMapping("shareRules")
    @ApiOperation("查看所有分享活动规则")
    public Object getAllShareRules(){ return new Object(); }

    @PostMapping("shareRules")
    @ApiOperation("添加分享活动规则")
    public Object addShareRules(){ return new Object(); }

    @DeleteMapping("shareRules/{id}")
    @ApiOperation("删除分享活动规则")
    public Object deleteShareRules(){ return new Object(); }

    @PutMapping("shareRules/{id}")
    @ApiOperation("修改分享活动规则信息")
    public Object updateShareRules(@PathVariable("id") Integer id){ return new Object(); }

}
