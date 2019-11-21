package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@Api(tags = "商品中心微服务")
@RestController
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




    @GetMapping("goods/{id}/grouponRule")
    @ApiOperation(value = "查询特定商品上的团购规则")
    public Object findGrouponRuleForGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }

    @GetMapping("goods/{id}/shareRule")
    @ApiOperation(value = "查询特定商品上的分享规则")
    public Object findShareRuleForGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }

    /*
     * 商品
     */
    @GetMapping("goods")
    @ApiOperation(value = "查看所有商品")
    public ArrayList<Object> getAllGoods(){ return new ArrayList<Object>(); }
    @GetMapping("goods/{id}")
    @ApiOperation(value = "查看特定商品")
    public Object getOneGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }
    @GetMapping("goods/search")
    @ApiOperation(value = "根据商品名称查看商品")
    public ArrayList<Object> getGoodsOfName(@ApiParam(name="name",value="商品名",required=true) String name) { return new ArrayList<Object>(); }

    /*
     * 品牌
     */
    @GetMapping("brands")
    @ApiOperation("查看所有品牌")
    public ArrayList<Object> getAllBrands(){return new ArrayList<Object>();}
    @GetMapping("brands/{id}/goods")
    @ApiOperation("查看指定品牌下的商品")
    public ArrayList<Object> getGoodsByBrandId(@ApiParam(name="id",value="品牌ID",required=true) @PathVariable("id") String id){return new ArrayList<Object>();}

    /*
     * 分类
     */
    @GetMapping("categories")
    @ApiOperation("查看所有分类")
    public ArrayList<Object> getAllCategories(){return new ArrayList<Object>();}

    @GetMapping("categories/{id}/subcategories")
    @ApiOperation("查看特定一级分类下二级分类")
    public ArrayList<Object> getSubCategories(@ApiParam(name="id",value="一级分类ID",required=true) @PathVariable("id") String id){return new ArrayList<Object>();}

    @GetMapping("categories/{id}/goods")
    @ApiOperation("查看指定类别下的商品")
    public ArrayList<Object> getGoodsBySubcategoryId(@ApiParam(name="id",value="类别id",required=true)@PathVariable("id")String id){return new ArrayList<Object>();}





}
