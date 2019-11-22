package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Api(value="UserService",tags = "用户微服务")
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
     * 用户信息操作
     * */

    @GetMapping("users")
    @ApiOperation("查看所有用户信息(管理员)")
    public ArrayList<Object> getAllUsersList(){ return new ArrayList<>(); }

    @GetMapping("users/{id}")
    @ApiOperation("查看特定用户信息(管理员)")
    public Object getUsersList(@ApiParam(name="id",value="用户ID")  @PathVariable("id") String id){ return new Object(); }

    @GetMapping("users/search")
    @ApiOperation("搜索用户(管理员)")
    public ArrayList<Object> searchUsersInfo(@ApiParam(name="userName",value="用户名")  String userName,@ApiParam(name="phone",value="电话号码")  String phone){ return new ArrayList<>(); }

    @PostMapping("users")
    @ApiOperation("添加用户(管理员)")
    public Object createUser(@ApiParam(name="user",value="用户信息") Object user){ return new Object(); }

    @DeleteMapping("users/{id}")
    @ApiOperation("删除用户(管理员)")
    public boolean deleteUser(@ApiParam(name="id",value="用户ID")  @PathVariable("id") String id){ return true; }

    @PutMapping("users/{userId}")
    @ApiOperation("修改用户信息(管理员)")
    public Object updateUserInfo(@ApiParam(name="id",value="用户ID")  @PathVariable("id") String id,@ApiParam(name="user",value="用户信息") Object user){return new Object();  }





    /*
     * 分享返点
     */
    @PutMapping("user-in/{userId}/rebate")
    @ApiOperation("增加用户的返点(内部接口，给 ShareService 访问)")
    public Object addRebate(@ApiParam(name="rebate",value="返点值",required=true)
                                @PathVariable("rebate") int rebate,
                            @ApiParam(name="userId",value="用户Id")String userId){ return new Object();}

}
