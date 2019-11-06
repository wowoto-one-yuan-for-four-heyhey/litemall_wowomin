package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(value="优惠券controller",tags={"优惠券管理"})
@RestController
@RequestMapping("")
public class CouponController {
    @GetMapping("coupon-rules")
    @ApiOperation("查看所有优惠券规则")
    public void getAllCouponRules(@ApiParam(name="couponId",value="优惠券id",required=true) @PathVariable String id){ return ; }

    @PostMapping("coupon-rules")
    @ApiOperation("添加优惠券规则")
    public void addCouponRule(){ return ; }

    @DeleteMapping("coupon-rules/{couponRuleId}")
    @ApiOperation("删除优惠券规则")
    public void deleteCouponRule(){ return ; }

    @PutMapping("coupon-rules/{couponRuleId}")
    @ApiOperation("修改优惠券规则信息")
    public void updateCouponRule(){ return ; }
}
