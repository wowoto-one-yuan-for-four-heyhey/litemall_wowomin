package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@Api(value="AdminService",tags={"管理员微服务"})
@RestController
public class AdminService {
    /*
     * 管理员操作
     * */

    @GetMapping("admins")
    @ApiOperation("查看所有管理员(管理员)")
    public ArrayList<Object> getAllAdmins(){ return new ArrayList<>();  }

    @PostMapping("admins")
    @ApiOperation("添加管理员(管理员)")
    public Object addAdmin(@ApiParam(name="admin",value="管理员信息")Object admin){ return new Object(); }

    @GetMapping("admins/{id}/log")
    @ApiOperation("查看特定管理员记录(管理员)")
    public Object getAdminLog(@ApiParam(name="id",value="管理员ID")  @PathVariable("id") String id){ return new Object(); }

    @GetMapping("admins/{id}/")
    @ApiOperation("查看特定管理员操作(管理员)")
    public Object getAdmin(@ApiParam(name="id",value="管理员ID")  @PathVariable("id") String id){ return new Object(); }


    @DeleteMapping("admins/{id}")
    @ApiOperation("删除管理员(管理员)")
    public boolean deleteAdmin(@ApiParam(name="id",value="管理员ID")  @PathVariable("id") String id){ return true; }

    @PutMapping("admins/{id}")
    @ApiOperation("编辑管理员(管理员)")
    public Object updateAdmin(@ApiParam(name="id",value="管理员ID")  @PathVariable("id") String id,@ApiParam(name="admin",value="管理员信息")Object admin){return new Object();  }
}
