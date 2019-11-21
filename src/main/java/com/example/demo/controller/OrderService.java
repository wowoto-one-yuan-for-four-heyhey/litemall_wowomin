package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class OrderService {
    @GetMapping("orders")
    @ApiOperation("查看用户的全部订单")
    public ArrayList<Object> getOrders(){return new ArrayList<Object>();}

    @GetMapping("orders/{id}")
    @ApiOperation("查看特定订单的订单详情")
    public Object getOrderDetail(@ApiParam(name="id",value="订单id",required=true)@PathVariable("id")String id){return new Object();}

    @PostMapping("orders")
    @ApiOperation("发起订单")
    public Object addOrder(@ApiParam(name="order",value="新订单",required=true)Object newObject){return new Object();}

    @PostMapping("orders/{id}/payment")
    @ApiOperation("支付订单")
    public Object payOrder(@ApiParam(name="id",value="订单id",required=true)@PathVariable("id")String id){return new Object();}

    @PostMapping("orders/{id}/confirmation")
    @ApiOperation("确认收货订单")
    public Object confirmOrder(@ApiParam(name="id",value="订单id",required=true)@PathVariable("id")String id){return new Object();}

    @PostMapping("orders/{id}/cancellation")
    @ApiOperation("取消订单")
    public Object cancelOrder(@ApiParam(name="id",value="订单id",required=true)@PathVariable("id")String id){return new Object();}

    @PostMapping("orders/{id}/customerService")
    @ApiOperation("发起一项订单售后服务")
    public Object addOrderCustomerService(@ApiParam(name="id",value="订单id",required=true)@PathVariable("id")String id){return new Object();}

    @GetMapping("orders/{id}/customerService")
    @ApiOperation("查看订单下的对应售后服务")
    public Object getOrderCustomerService(@ApiParam(name="id",value="订单id",required=true)@PathVariable("id")String id){return new Object();}

    @PutMapping("orders/{orderId}/customerService/{customerServiceId}")
    @ApiOperation("推进一项订单售后服务")
    public Object updateOrderCustomerService(@ApiParam(name="orderId",value="订单id",required=true)@PathVariable("orderId")String orderId,@ApiParam(name="customerServiceId",value="售后id",required=true)@PathVariable("customerServiceId")String customerServiceId){return new Object();}



    @GetMapping("orders/search")
    @ApiOperation(value = "根据用户ID、订单ID、订单状态等信息查询所有订单(管理员)")
    public ArrayList<Object> getSearchGoods(@ApiParam(name="userId",value="用户ID")  Object userId,@ApiParam(name="orderId",value="订单ID")  Object id,@ApiParam(name="status",value="订单状态")  String status){return new ArrayList<>();}

    @PutMapping("orders/{id}")
    @ApiOperation(value = "修改特定订单(管理员)")
    public Object updateOrder(@ApiParam(name="id",value="订单ID")  @PathVariable("id") Object orderId,@ApiParam(name="order",value="订单信息")  Object order){return new Object();}

    @DeleteMapping("orders/{id}")
    @ApiOperation(value = "删除特定订单(管理员)")
    public Object deleteOrder(@ApiParam(name="id",value="订单ID")   @PathVariable("id")String id){return new Object();}



    @GetMapping("orders/shareOrders-in")
    @ApiOperation(value = "获取分享订单（内部接口，供UserService使用）")
    public ArrayList<Object> getShareOrders(@ApiParam(name = "shareId", value="分享活动Id")String shareId){return new ArrayList<>();}

    @GetMapping("orders/grouponOrders-in")
    @ApiOperation(value = "获取团购订单（内部接口，供DiscountService使用）")
    public ArrayList<Object> getGrouponOrders(@ApiParam(name="grouponId", value="团购活动Id")String grouponId){return new ArrayList<>();}
}
