package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class AdService {

    /*
     * 广告操作
     * */
    @GetMapping("ads/{id}")
    @ApiOperation("获取特定广告信息")
    public ArrayList<Object> getAdsById(@ApiParam(name="id",value="广告ID",required=true) @PathVariable("id") String id)
    { return new ArrayList<>(); }

    @GetMapping("ads")
    @ApiOperation("查看所有广告信息(管理员)")
    public ArrayList<Object> getAllAds(@ApiParam(name="num",value="每页展示数量",required=true) int num,
                                       @ApiParam(name="page",value="页码",required=true) int page)
    { return new ArrayList<>(); }

    @GetMapping("ads/search")
    @ApiOperation("搜索广告信息(管理员)")
    public ArrayList<Object> searchAds(@ApiParam(name="title",value="广告标题")String title,
                                       @ApiParam(name="content",value="广告内容")String content,
                                       @ApiParam(name="num",value="每页展示数量",required=true) int num,
                                       @ApiParam(name="page",value="页码",required=true) int page)
    { return new ArrayList<>(); }

    @PostMapping("ads")
    @ApiOperation("添加广告信息(管理员)")
    public Object createAds(@ApiParam(name="ad",value="广告信息")Object ad){ return new Object(); }

    @DeleteMapping("ads/{id}")
    @ApiOperation("删除广告信息(管理员)")
    public boolean deleteAds(@ApiParam(name="id",value="广告ID",required=true)  @PathVariable("id") String id)
    { return true; }

    @PutMapping("ads/{id}")
    @ApiOperation("修改广告信息(管理员)")
    public Object updateAds(@ApiParam(name="id",value="广告ID",required=true)  @PathVariable("id") String id,
                            @ApiParam(name="ad",value="广告信息")Object ad)
    {return new Object(); }

}
