package com.example.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value="商品controller",tags={"商品管理"})
@RestController
@RequestMapping("/goods")
public class GoodsController {
}
