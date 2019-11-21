package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

public class GoodsService {


    /*
     * 获得商品
     */
    @GetMapping("product")
    @ApiOperation("获得商品")
    public Object getProduct(){ return new Object();}

}
