package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Api(value="GoodsService",tags = "商品微服务")
@RestController
public class GoodsService {

    /*
     * 获得商品
     */

    /*
     * 商品
     */
    @GetMapping("goods")
    @ApiOperation(value = "查看所有商品")
    public ArrayList<Object> getAllGoods(){ return new ArrayList<Object>(); }
    @GetMapping("goods/{id}")
    @ApiOperation(value = "查看特定商品(外部接口/内部接口，给 TopicSevice , FootprintService 访问)")
    public Object getOneGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }
    @GetMapping("goods/search")
    @ApiOperation(value = "根据商品名称查看商品")
    public ArrayList<Object> getGoodsOfName(@ApiParam(name="name",value="商品名",required=true) String name) { return new ArrayList<Object>(); }
    @GetMapping("products/{productId}")
    @ApiOperation("获得特定规格商品(外部接口/内部接口, 给 OrderSevice , UserService 访问)")
    public Object getProductForOthers(@ApiParam(name="productId",value="特定规格商品ID",required=true)
                                      @PathVariable("productId") String productId){ return new Object();}



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


    /*
     *管理员品牌
     */

    @PostMapping("brands/search")
    @ApiOperation("搜索品牌(管理员)")
    public Object searchBrand(){return new Object();}


    @PostMapping("brands")
    @ApiOperation("添加品牌(管理员)")
    public Object addBrand(@ApiParam(name="brand",value="品牌信息",required=true)  Object brand) {return new Object();}

    @DeleteMapping("brands/{id}")
    @ApiOperation("删除品牌(管理员)")
    public Object deleteBrand(@ApiParam(name="id",value="品牌ID",required=true) @PathVariable("id") String id){return new Object();}

    @PutMapping("brands/{brandId}")
    @ApiOperation("修改品牌信息(管理员)")
    public Object updateBrand(@ApiParam(name="id",value="品牌ID",required=true) @PathVariable("id") String id){return new Object();}

   /*
    *管理员分类
    */
   @PostMapping("categories")
   @ApiOperation(value = "添加分类(管理员)")
   public Object addCategory(@ApiParam(name="categotry",value="分类信息",required=true)  Object category){ return new Object(); }

    @DeleteMapping("categories/{id}")
    @ApiOperation(value = "删除特定分类(管理员)")
    public Object deleteCategory(@ApiParam(name="id",value="分类ID",required=true) @PathVariable("id") String id){ return new Object(); }

    @PutMapping("categories/{id}")
    @ApiOperation(value = "修改特定分类(管理员)")
    public Object updateCategory(@ApiParam(name="id",value="分类ID",required=true) @PathVariable("id") String id){ return new Object(); }

    /*
     * 管理员商品
     */
    @PostMapping("goods")
    @ApiOperation(value = "添加商品(管理员)")
    public Object addGoods(@ApiParam(name="goods",value="商品信息",required=true) Object goods){ return new Object(); }

    @DeleteMapping("goods/{id}")
    @ApiOperation(value = "删除商品(管理员)")
    public Object deleteGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }

    @PutMapping("goods/{goodsId}")
    @ApiOperation(value = "修改商品信息(管理员)")
    public Object updateGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id,@ApiParam(name="goods",value="商品信息",required=true)  Object goods){ return new Object(); }

    @PostMapping("goods/{id}/products/")
    @ApiOperation(value = "添加特定商品(管理员)")
    public Object addProducts(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id,@ApiParam(name="Products",value="商品规格信息",required=true)  Object goodsProducts){ return new Object(); }

    @DeleteMapping("goods/{goodsId}/products/{productsId}")
    @ApiOperation(value = "删除特定商品(管理员)")
    public Object deleteProducts(@ApiParam(name="goodsId",value="商品ID",required=true) @PathVariable("goodsId") String goodsId,@ApiParam(name="ProductsId",value="商品规格ID",required=true) @PathVariable("productsId") String productsId){ return new Object(); }

    @PutMapping("goods/{goodsId}/products/{productsId}")
    @ApiOperation(value = "修改特定商品(管理员)")
    public Object updateProducts(@ApiParam(name="goodsId",value="商品ID",required=true) @PathVariable("goodsId") String goodsId,@ApiParam(name="ProductsId",value="商品规格ID",required=true) @PathVariable("productsId") String productsId){ return new Object(); }







}