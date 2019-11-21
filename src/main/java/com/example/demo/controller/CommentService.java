package com.example.demo.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class CommentService {

    /*
     * 用户评论
     */

    @PostMapping("goods/{id}/comments")
    @ApiOperation("添加特定商品评论")
    public Object addComment(@ApiParam(name="id",value="商品id",required=true)@PathVariable("id")String id,
                             @ApiParam(name="content",value="评论内容",required=true)String content){return new Object();}

    @GetMapping("goods/{id}/comments")
    @ApiOperation("查看特定商品评论")
    public ArrayList<Object> getComment(@ApiParam(name="id",value="商品id",required=true)@PathVariable("id")String id,
                                        @ApiParam(name="num",value="每页展示数量",required=true) int num,
                                        @ApiParam(name="page",value="页码",required=true) int page)
    {return new ArrayList<Object>();}

    @GetMapping("topics/{id}/comments")
    @ApiOperation("查看特定专题的评论")
    public ArrayList<Object> getCommentsByTopicId(@ApiParam(name="id",value="专题id",required=true)@PathVariable("id")String id,
                                                  @ApiParam(name="num",value="每页展示数量",required=true) int num,
                                                  @ApiParam(name="page",value="页码",required=true) int page)
    { return new ArrayList<Object>(); }

    @PostMapping("topics/{id}/comments")
    @ApiOperation("添加特定专题的评论")
    public Object addTopicComment(@ApiParam(name="id",value="专题id",required=true)@PathVariable("id")String id,
                                  @ApiParam(name="content",value="评论内容",required=true)String content ){ return new Object(); }

    @DeleteMapping("topics/{topicId}/comments/{commentId}")
    @ApiOperation("删除该用户对特定专题的特定评论")
    public boolean deleteOneComment(@ApiParam(name="topicId",value="话题id",required=true)@PathVariable("topicId")String topicId,
                                    @ApiParam(name="commentId",value="话题id",required=true)@PathVariable("commentId")String commentId){ return true; }

    @PutMapping("topics/{topicId}/comments/{commentId}")
    @ApiOperation("修改该用户对特定专题的特定评论")
    public Object updateComment(@ApiParam(name="topicId",value="话题id",required=true)@PathVariable("topicId")String topicId,
                                @ApiParam(name="commentId",value="话题id",required=true)@PathVariable("commentId")String commentId){ return new Object();}

     /*
      *管理员评论
      */
     @GetMapping("goods/comments")
     @ApiOperation(value = "查看所有商品评论(管理员)")
     public ArrayList<Object> getAllGoodsComments(@ApiParam(name="num",value="每页展示数量",required=true) int num,
                                                  @ApiParam(name="page",value="页码",required=true) int page)
     {return new ArrayList<>();}

    @GetMapping("goods/comments/search")
    @ApiOperation(value = "搜索商品评论(管理员)")
    public ArrayList<Object> searchGoodsComments(@ApiParam(name="userId",value="用户ID")  String userId,
                                                 @ApiParam(name="goodsId",value="商品ID")  String goodsId,
                                                 @ApiParam(name="num",value="每页展示数量",required=true) int num,
                                                 @ApiParam(name="page",value="页码",required=true) int page)
    {return new ArrayList<>();}

    @PostMapping("goods/comments/{id}")
    @ApiOperation(value = "回复商品评论(管理员)")
    public Object replyGoodsComments(@ApiParam(name="commentId",value="评论ID",required=true) @PathVariable("id") String id,
                                     @ApiParam(name="reply",value="回复内容")String reply)
    { return new Object();}

    @DeleteMapping("goods/comments/{id}")
    @ApiOperation(value = "删除商品评论(管理员)")
    public boolean deleteGoodsComments(@ApiParam(name="id",value="评论ID",required=true) @PathVariable("id")  String id){return true; }

    @PutMapping("goods/comments/{id}")
    @ApiOperation(value = "审核商品评论(管理员)")
    public boolean verifyGoodsComments(@ApiParam(name="id",value="评论ID",required=true) @PathVariable("id")  String id){return true; }
}
