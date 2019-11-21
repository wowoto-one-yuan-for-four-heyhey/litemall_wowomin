package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@Api(value="FootprintService",tags={"足迹微服务"})
@RestController
public class FootprintService {

    /*
     * 足迹
     */
    @GetMapping("footprints")
    @ApiOperation("获得用户的足迹")
    public ArrayList<Object> getPrints(){ return new ArrayList<Object>(); }
    @PostMapping("footprints/{id}")
    @ApiOperation("添加足迹")
    public Object addPrint(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }
    @DeleteMapping("footprints/{id}")
    @ApiOperation("删除特定足迹")
    public boolean deletePrint(@ApiParam(name="id",value="足迹ID",required=true) @PathVariable("id") String id){ return true; }
    @DeleteMapping("footprints")
    @ApiOperation("删除所有足迹")
    public boolean deletePrints(){ return true;}
}
