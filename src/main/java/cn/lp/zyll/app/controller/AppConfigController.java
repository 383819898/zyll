package cn.lp.zyll.app.controller;

import cn.lp.zyll.util.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 李鹏
 * @Description: TODO 基础配置
 * @Date: 2021/6/7 01:09
 * @Version: v1.0
 */

@Api(tags = "基础配置")
@RestController
@RequestMapping("/config")
public class AppConfigController {


    @ApiOperation("小说配置")
    @RequestMapping("bookConfig")
    public ResponseUtil bookConfig(){

        return ResponseUtil.success();
    }




}
