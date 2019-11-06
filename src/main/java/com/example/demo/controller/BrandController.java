package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value="品牌controller",tags={"品牌管理"})
@RestController
@RequestMapping("/brands")
public class BrandController {
    @PostMapping("")
    @ApiOperation("添加品牌")
    public Object addBrand(){return new Object();}

    @DeleteMapping("{brandId}")
    @ApiOperation("删除品牌")
    public Object deleteBrand(){return new Object();}

    @PutMapping("{brandId}")
    @ApiOperation("修改品牌信息")
    public Object updateBrand(){return new Object();}
}
