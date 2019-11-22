package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Api(tags = "分享微服务")
@RestController
public class ShareService {
    /*
     * 分享规则管理
     */

    @GetMapping("shareRules")
    @ApiOperation("查看所有分享活动规则(管理员)")
    public ArrayList<Object> getAllShareRules(){ return new ArrayList<>(); }

    @GetMapping("goods/{id}/shareRule")
    @ApiOperation(value = "查询特定商品上的分享规则")
    public Object findShareRuleForGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }

    @PostMapping("shareRules")
    @ApiOperation("添加分享活动规则(管理员)")
    public Object addShareRules(@ApiParam(name="shareRule",value="分享规则信息")   Object shareRule){ return new Object(); }

    @PostMapping("goods/shareRules")
    @ApiOperation("为某个商品添加/修改分享活动规则(管理员)")
    public Object addShareRulesForGoods(@ApiParam(name="goodsid",value="商品ID")  @PathVariable("goodsId") String goodsId,@ApiParam(name="shareRuleId",value="分享规则ID")  @PathVariable("shareRuleId") String shareRuleId){ return new Object(); }

    @DeleteMapping("shareRules/{id}")
    @ApiOperation("删除分享活动规则(管理员)")
    public boolean deleteShareRules(@ApiParam(name="grouponRuleId",value="团购规则ID")  @PathVariable("grouponRuleId") String shareRuleId){ return true; }

    @PutMapping("shareRules/{id}")
    @ApiOperation("修改某个分享活动规则(管理员)")
    public Object updateShareRules(@ApiParam(name="id",value="分享规则ID")  @PathVariable("id") String shareRuleId,@ApiParam(name="shareRule",value="分享规则信息")   Object shareRule){ return new Object(); }


    @GetMapping("shareItem")
    @ApiOperation("查看所有分享(管理员)")
    public ArrayList<Object> getAllShareItems(){
        return null;
    }

    @GetMapping("shareItem/{id}")
    @ApiOperation("查看某个分享(管理员)")
    public Object getShareItem(@ApiParam(name="id",value="分享规则ID")  @PathVariable("id") String shareId){
        return null;
    }
}
