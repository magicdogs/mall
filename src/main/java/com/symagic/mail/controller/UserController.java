package com.symagic.mail.controller;

import com.symagic.mail.model.MallUsersEntity;
import com.symagic.mail.repostory.MallUsersRepository;
import com.symagic.mail.web.constant.Urls;
import com.symagic.mail.web.utils.WxUtils;
import com.symagic.mail.web.view.Response;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Administrator
 */
@RestController
public class UserController {

    @Autowired
    MallUsersRepository mallUsersRepository;
    /**
     Request URL:https://api.it120.cc/mall/user/wxapp/login?code=0114f6Rp1yNvDq0nkyTp1TgUQp14f6R1
     * @param code
     * @return
     * code 微信登录接口返回的 code 参数数据
     * type 1 服务号 2 小程序，不传默认为2
     */
    @RequestMapping(Urls.User.WXAPP_LOGIN)
    public Response wxAppLogin(@RequestParam String code,@RequestParam(required = false,defaultValue = "2") String type){
        System.out.println(code + " , " + type);
        Response response = new Response();
        String openId = WxUtils.getUserOpenId(code);
        MallUsersEntity usersEntity = mallUsersRepository.findByToken(openId);
        if(Objects.isNull(usersEntity)
                || usersEntity.getId() == 0 ) {
            MallUsersEntity usersRegister = new MallUsersEntity();
            usersRegister.setToken(openId);
            mallUsersRepository.save(usersRegister);
            usersEntity = mallUsersRepository.findByToken(openId);
        }
        Map<String,String> resp = new HashMap<>();
        resp.put("token",openId);
        resp.put("uid",String.valueOf(usersEntity.getId()));
        response.setData(resp);
        return response;
    }
}
