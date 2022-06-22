package com.patrick.pacmall.feign;

import com.patrick.common.to.SocialUser;
import com.patrick.common.utils.R;
import com.patrick.pacmall.vo.UserLoginVo;
import com.patrick.pacmall.vo.UserRegistVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("pacmall-member")
public interface MemberFeignService {

    @PostMapping("/member/member/regist")
    R regist(@RequestBody UserRegistVo vo);

    @PostMapping("/member/member/login")
    R login(@RequestBody UserLoginVo vo);

    @PostMapping("/member/member/oauth2/login")
    R SocialLogin(@RequestBody SocialUser vo) throws Exception;
}
