package com.patrick.pacmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.patrick.common.to.SocialUser;
import com.patrick.common.utils.PageUtils;
import com.patrick.pacmall.member.entity.MemberEntity;
import com.patrick.pacmall.member.exception.PhoneExistException;
import com.patrick.pacmall.member.exception.UserNameExistException;
import com.patrick.pacmall.member.vo.MemberLoginVo;
import com.patrick.pacmall.member.vo.MemberRegistVo;

import java.util.Map;

/**
 * 会员
 *
 * @author patrick
 * @email xuanweihao6@gmail.com
 * @date 2022-04-20 17:22:55
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void regist(MemberRegistVo vo);

    void checkPhoneUnique(String phone) throws PhoneExistException;

    void checkUserNameUnique(String userName) throws UserNameExistException;

    MemberEntity login(MemberLoginVo vo);

    MemberEntity socialLogin(SocialUser vo);
}

