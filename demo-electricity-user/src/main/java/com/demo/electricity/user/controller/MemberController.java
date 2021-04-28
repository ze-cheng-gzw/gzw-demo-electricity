package com.demo.electricity.user.controller;

import com.demo.electricity.base.vo.FindMemberVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Api(value = "v1", tags = "用户操作相关接口")
@RequestMapping("/api/v1")
public class MemberController {

    @PostMapping("/member/login")
    @ApiOperation(value = "账号密码登录接口", notes = "返回token")
    public void login () {
        FindMemberVO findMemberVO = new FindMemberVO();
    }
}
