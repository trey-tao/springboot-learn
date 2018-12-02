package com.trey.swagger;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @FileName: IndexController.java
 * @Description: IndexController.java类说明
 * @Author: tao.shi
 * @Date: 2018/11/20 11:46
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @ApiOperation(value="用户登陆", notes = "用户登陆系统")
    @ApiImplicitParam(name="name", value = "用户姓名", required = true, dataType = "String")
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(@RequestParam("name")String name) {
        return "Hello, " + name;
    }

}
