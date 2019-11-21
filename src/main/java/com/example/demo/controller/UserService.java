package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户中心微服务")
@RestController
public class UserService {

    /*
     * 地址
     */
    @GetMapping("addresses")
    @ApiOperation("获得自己的地址")
    public Object getUserAddress(){ return new Object(); }


    @PostMapping("addresses")
    @ApiOperation("添加地址")
    public Object createAddress(@ApiParam(name="address",value="地址信息",required=true)
                                    @PathVariable("address") String address) { return new Object(); }

    @DeleteMapping("addresses/{addressId}")
    @ApiOperation("删除地址")
    public Object deleteAddress(@ApiParam(name="addressId",value="地址ID",required=true)
                                    @PathVariable("addressId") String addressId){ return new Object(); }

    @PutMapping("address/{addressId}")
    @ApiOperation("修改地址信息")
    public Object updateAddress(@ApiParam(name="addressId",value="地址ID",required=true)
                                    @PathVariable("addressId") String addressId){ return new Object(); }



    /*
     * 收藏
     */
    @GetMapping("collections")
    @ApiOperation("查看所有收藏")
    public Object getCollections(){ return new Object(); }
    @PostMapping("collections/{goodsId}")

    @ApiOperation("添加收藏")
    public Object addCollections(@ApiParam(name="collections",value="收藏夹信息",required=true)
                                     @PathVariable("collections") String collections){ return new Object(); }

    @DeleteMapping("collections/{collectionId}")    // collectionId <-> goodId
    @ApiOperation("删除收藏")
    public Object deleteCollection(@ApiParam(name="collectionId",value="收藏ID",required=true)
                                       @PathVariable("collectionId") String collectionId){ return new Object(); }


    /*
     * 足迹
     */
    @GetMapping("footprints")
    @ApiOperation("获得特定用户的足迹")
    public Object getPrints(){ return new Object(); }
    @PostMapping("footprints/{goodsId}")
    @ApiOperation("添加足迹")
    public Object addPrint(@ApiParam(name="goodsId",value="商品ID",required=true)
                               @PathVariable("goodsId") String goodsId){ return new Object(); }
    @DeleteMapping("footprints/{fpId}")
    @ApiOperation("删除特定足迹")
    public Object deletePrint(@ApiParam(name="fpId",value="足迹ID",required=true)
                                  @PathVariable("fpId") String fpId){ return new Object(); }
    @DeleteMapping("footprints")
    @ApiOperation("删除所有足迹")
    public Object deletePrints(){ return new Object();}



    /*
     * 购物车
     */
    @GetMapping("cart-items")
    @ApiOperation("查看购物车")
    public Object getCartItems(){ return new Object(); }

    @PostMapping("cart-items/{goodsId}")
    @ApiOperation("加入购物车")
    public Object addItem(@ApiParam(name="goodsId",value="商品ID",required=true)
                              @PathVariable("goodsId") String goodsId){ return new Object(); }
    @DeleteMapping("cart-items/{cartItemId}")
    @ApiOperation("删除购物车中特定物品")
    public Object getCartItem(@ApiParam(name="cartItemId",value="购物车商品ID",required=true)
                                  @PathVariable("cartItemId") String cartItemId){ return new Object();}


    /*
     * 分享返点
     */
    @PutMapping("user/{userId}/rebate")
    @ApiOperation("增加用户的返点")
    public Object addRebate(@ApiParam(name="rebate",value="返点值",required=true)
                                @PathVariable("rebate") int rebate,
                            @ApiParam(name="userId",value="用户Id")String userId){ return new Object();}

}
