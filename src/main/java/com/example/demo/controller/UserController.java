package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value="用户controller",tags={"用户管理"})
@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("")
    @ApiOperation("查看所有用户信息")
    public Object getAllUsersInfo(){ return new Object(); }

    @GetMapping("/{userId}")
    @ApiOperation("查看特定用户信息")
    public Object getOneUserInfo(){ return new Object(); }

    @PostMapping("")
    @ApiOperation("添加用户")
    public Object createUser(){ return new Object(); }

    @DeleteMapping("/{userId}")
    @ApiOperation("删除用户")
    public Object deleteUser(){ return new Object(); }

    @PutMapping("/{userId}")
    @ApiOperation("修改用户信息")
    public Object updateUserInfo(){ return new Object(); }
}
