package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

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



}
