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
    @GetMapping("products/{productId}")
    @ApiOperation("获得特定规格商品(内部接口, 给 OrderSevice , UserService 访问)")
    public Object getProduct(@ApiParam(name="productId",value="特定规格商品ID",required=true)
                                 @PathVariable("productId") String productId){ return new Object();}

    @GetMapping("goods/{goodsId}")
    @ApiOperation("获得商品(内部接口, 给 TopicSevice , FootprintService 访问)")
    public Object getGoods(@ApiParam(name="goodsId",value="商品ID",required=true)
                             @PathVariable("goodsId") String goodsId){ return new Object();}

}
