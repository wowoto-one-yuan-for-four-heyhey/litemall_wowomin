package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value="商品controller",tags={"商品管理"})
@RestController
@RequestMapping("")
public class GoodsController {
    @PostMapping("goods")
    @ApiOperation(value = "添加商品")
    public Object addGoods(){ return new Object(); }

    @DeleteMapping("goods/{id}")
    @ApiOperation(value = "删除商品")
    public Object deleteGoods(){ return new Object(); }

    @PutMapping("goods/{id}")
    @ApiOperation(value = "修改商品信息")
    public Object updateGoods(){ return new Object(); }

    @PostMapping("goods/{id}/specifications")
    @ApiOperation(value = "添加商品规格")
    public Object addSpecification(){ return new Object(); }

    @DeleteMapping("goods/{id}/specifications/{specificationId}")
    @ApiOperation(value = "删除商品规格")
    public Object deleteSpecification(){ return new Object(); }

    @PutMapping("goods/{id}/specifications/{specificationId}")
    @ApiOperation(value = "修改商品规格信息")
    public Object updateSpecification(){ return new Object(); }

    @PostMapping("pre-sale-goods")
    @ApiOperation(value = "添加预售商品")
    public Object addPreSaleGoods(){ return new Object(); }

    @DeleteMapping("pre-sale-goods/{id}")
    @ApiOperation(value = "删除预售商品")
    public Object deletePreSaleGoods(){ return new Object(); }

    @PutMapping("pre-sale-goods/{id}")
    @ApiOperation(value = "修改预售商品信息")
    public Object updatePreSaleGoods(){ return new Object(); }

    @PostMapping("groupon-goods")
    @ApiOperation(value = "添加团购商品")
    public Object addGrouponGoods(){ return new Object(); }

    @DeleteMapping("groupon-goods/{id}")
    @ApiOperation(value = "删除团购商品")
    public Object deleteGrouponGoods(){ return new Object(); }

    @PutMapping("groupon-goods/{id}")
    @ApiOperation(value = "修改团购商品信息")
    public Object updateGrouponGoods(){ return new Object(); }

}
