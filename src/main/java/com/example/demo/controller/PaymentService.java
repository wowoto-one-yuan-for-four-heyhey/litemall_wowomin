package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

@Api(value="PaymentService",tags={"支付微服务"})
@RestController
public class PaymentService {

    @PostMapping("payment/{id}")
    @ApiOperation("调用第三方支付接口支付")
    public Object getCouponInfoForOrder(@ApiParam(name="orderInfo",value="订单信息",required=true)  Object orderInfo,
                                        @ApiParam(name="id",value="支付方式",required=true)@PathVariable("id") String id
                                        )
    { return new Object(); }

    @GetMapping("orders/{id}/payment/")
    @ApiOperation("查看订单支付状态(内部接口，供orderService调用)")
    public Object getPaymentStatus(@ApiParam(name="id",value="订单ID",required=true)@PathVariable("id") String id)
    { return new Object(); }

    @PutMapping("payment/{id}")
    @ApiOperation("团购服务给用户退款(内部接口，供DiscountService调用)")
    public Object giveBackGrouponRefund(@ApiParam(name="id",value="支付订单ID",required=true)@PathVariable("id") String id)
    { return new Object(); }
}
