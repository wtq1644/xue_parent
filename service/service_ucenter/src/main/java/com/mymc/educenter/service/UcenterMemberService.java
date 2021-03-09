package com.mymc.educenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mymc.educenter.entity.UcenterMember;
import com.mymc.educenter.entity.vo.RegisterVo;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author mymc
 * @since 2020-10-03
 */
public interface UcenterMemberService extends IService<UcenterMember> {


    //登录的方法
    String login(UcenterMember member);

    //注册的方法
    void register(RegisterVo registerVo);

    //根据openid判断
    UcenterMember getOpenIdMember(String openid);

    Integer countRegister(String day);
}
