package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@Api(value="DiscountService",tags={"折扣微服务"})
@RestController
public class DiscountService {

    /*
     * 用户优惠券
     */
    @GetMapping("coupons")
    @ApiOperation("查看用户的所有优惠券")
    public ArrayList<Object> getAllCouponsInfo(@ApiParam(name="num",value="每页展示数量",required=true) int num,
                                               @ApiParam(name="page",value="页码",required=true) int page)
    { return new ArrayList<Object>(); }

    @GetMapping("coupons/{id}")
    @ApiOperation("查看特定优惠券信息")
    public Object getOneCouponInfo(@ApiParam(name="id",value="优惠券id",required=true) @PathVariable("id") String id)
    { return new Object(); }

    @PostMapping("coupons/{couponRuleId}")
    @ApiOperation("领取特定优惠券")
    public Object addCoupon(@ApiParam(name="couponRuleId",value="优惠券规则ID",required=true)@PathVariable("couponRuleId")String couponRuleId)
    { return new Object(); }

    /*
     * 管理员优惠券
     */
    @GetMapping("coupon-rules")
    @ApiOperation("查看所有优惠券规则(管理员)")
    public ArrayList<Object> getAllCouponRules(@ApiParam(name="num",value="每页展示数量",required=true) int num,
                                               @ApiParam(name="page",value="页码",required=true) int page)
    { return new ArrayList<>(); }

    @GetMapping("coupon-rules/search")
    @ApiOperation("搜索优惠券规则(管理员)")
    public ArrayList<Object> searchCouponRules(@ApiParam(name="name",value="优惠券名字")  String name,
                                               @ApiParam(name="couponStatus",value="优惠券状态")  String couponStatus,
                                               @ApiParam(name="num",value="每页展示数量",required=true) int num,
                                               @ApiParam(name="page",value="页码",required=true) int page)
    { return new ArrayList<>(); }

    @PostMapping("coupon-rules")
    @ApiOperation("添加优惠券规则(管理员)")
    public Object addCouponRule(@ApiParam(name="couponRule",value="优惠券规则详细",required=true)  Object couponRule){ return new Object();}

    @DeleteMapping("coupon-rules/{id}")
    @ApiOperation("删除优惠券规则(管理员)")
    public boolean deleteCouponRule(@ApiParam(name="id",value="优惠券规则ID",required=true) @PathVariable("id") String id){ return true;}

    @PutMapping("coupon-rules/{id}")
    @ApiOperation("修改优惠券规则信息(管理员)")
    public Object updateCouponRule(@ApiParam(name="id",value="优惠券规则ID",required=true) @PathVariable("id") String id){return new Object(); }

    /*
     *用户团购规则
     */
    @GetMapping("goods/{id}/grouponRule")
    @ApiOperation(value = "查询特定商品上的团购规则")
    public Object findGrouponRuleForGoods(@ApiParam(name="id",value="商品ID",required=true) @PathVariable("id") String id){ return new Object(); }

    /*
     *管理员团购
     */
    @PostMapping("grouponRule(管理员)")
    @ApiOperation(value = "添加团购规则")
    public Object addGrouponRule(@ApiParam(name="grouponRule",value="团购规则信息")   Object grouponRule){ return new Object(); }

    @PostMapping("goods/{goodsId}/grouponRule/{grouponRuleId}")
    @ApiOperation(value = "为某个商品添加/修改团购规则(管理员)")
    public Object addGrouponRuleForGoods(@ApiParam(name="goodsid",value="商品ID")  @PathVariable("goodsId") String goodsId,
                                         @ApiParam(name="grouponRuleId",value="团购规则ID")  @PathVariable("grouponRuleId") String grouponRuleId)
    { return new Object(); }

    @DeleteMapping("grouponRule/{grouponRuleId}")
    @ApiOperation(value = "删除团购活动(管理员)")
    public boolean deleteRuleForGoods(@ApiParam(name="grouponRuleId",value="团购规则ID")  @PathVariable("grouponRuleId") String grouponRuleId)
    { return true; }

    @PutMapping("grouponRule/{grouponRuleId}")
    @ApiOperation(value = "修改某个团购规则(管理员)")
    public Object updateRuleForGoods(@ApiParam(name="grouponRuleId",value="团购规则ID")  @PathVariable("grouponRuleId") String grouponRuleId,
                                     @ApiParam(name="grouponRule",value="团购规则信息")   Object grouponRule)
    { return new Object(); }

    /*
     *内部接口
     */
    @GetMapping("user/{id}/coupons")
    @ApiOperation("查看用户的优惠券信息(内部接口，给order使用获得用户优惠券信息)")
    public ArrayList<Object> getCouponInfoByUser(@ApiParam(name="id",value="用户id",required=true)  String id)
    { return null; }
}
