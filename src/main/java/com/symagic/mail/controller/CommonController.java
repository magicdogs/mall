package com.symagic.mail.controller;

import com.alibaba.fastjson.JSON;
import com.symagic.mail.model.MallBannerEntity;
import com.symagic.mail.model.MallConfigEntity;
import com.symagic.mail.model.MallNoticeEntity;
import com.symagic.mail.repostory.MallBannerRepository;
import com.symagic.mail.repostory.MallConfigRepository;
import com.symagic.mail.repostory.MallNoticeRepository;
import com.symagic.mail.web.constant.Urls;
import com.symagic.mail.web.utils.PageWarp;
import com.symagic.mail.web.view.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommonController {

    @Autowired
    MallConfigRepository mallConfigRepository;
    @Autowired
    MallBannerRepository mallBannerRepository;
    @Autowired
    MallNoticeRepository mallNoticeRepository;

    @RequestMapping(Urls.Common.CONFIG_GET_VALUE)
    public Response getConfigValue(@RequestParam String key){
        System.out.println(key);
        MallConfigEntity mallConfigEntities = mallConfigRepository.findOne(9);
        Response response = new Response<>();
        response.setData(mallConfigEntities);
        return response;
    }


    @RequestMapping(Urls.Common.BANNER_LIST)
    public Response bannerList(@RequestParam String key){
        System.out.println(key);
        Response response = new Response<>();
        List<MallBannerEntity> mallBannerEntities = mallBannerRepository.findAll();
        response.setData(mallBannerEntities);
        return response;
    }

    /**
     Request URL:https://api.it120.cc/mall/discounts/coupons?type=
     Request Method:GET
     Status Code:200
     Remote Address:106.14.43.122:443
     Referrer Policy:no-referrer-when-downgrade
     * @param type
     * @return
     * {"code":0,"data":[{"dateAdd":"2017-08-16 11:14:58","dateEndDays":10,"dateEndType":1,"dateStartType":1,"id":5,"moneyHreshold":20.00,"moneyMax":10.00,"moneyMin":10.00,"name":"万圣节大优惠","needScore":0,"numberGit":780,"numberGitNumber":780,"numberLeft":999219,"numberPersonMax":1,"numberTotle":999999,"numberUsed":43,"status":0,"statusStr":"正常","type":"shop"},{"dateAdd":"2017-08-16 11:14:16","dateEndDays":10,"dateEndType":1,"dateStartType":1,"id":4,"moneyHreshold":500.00,"moneyMax":60.00,"moneyMin":1.00,"name":"再来一波","needScore":0,"numberGit":644,"numberGitNumber":644,"numberLeft":999355,"numberPersonMax":1,"numberTotle":999999,"numberUsed":24,"status":0,"statusStr":"正常","type":"shop"},{"dateAdd":"2017-08-16 11:13:42","dateEndDays":10,"dateEndType":1,"dateStartType":1,"id":3,"moneyHreshold":200.00,"moneyMax":50.00,"moneyMin":1.00,"name":"全站通用","needScore":0,"numberGit":587,"numberGitNumber":346,"numberLeft":999412,"numberPersonMax":5,"numberTotle":999999,"numberUsed":43,"status":0,"statusStr":"正常","type":"shop"}],"msg":"success"}
     */
    @RequestMapping(Urls.Common.DISCOUNTS_COUPONS)
    public Response discountsCoupons(@RequestParam String type){
        System.out.println(type);
        Response<CouponsResponse> getData = new Response<>();
        Response response = JSON.parseObject("{\"code\":0,\"data\":[{\"dateAdd\":\"2017-08-16 11:14:58\",\"dateEndDays\":10,\"dateEndType\":1,\"dateStartType\":1,\"id\":5,\"moneyHreshold\":20.00,\"moneyMax\":10.00,\"moneyMin\":10.00,\"name\":\"万圣节大优惠\",\"needScore\":0,\"numberGit\":780,\"numberGitNumber\":780,\"numberLeft\":999219,\"numberPersonMax\":1,\"numberTotle\":999999,\"numberUsed\":43,\"status\":0,\"statusStr\":\"正常\",\"type\":\"shop\"},{\"dateAdd\":\"2017-08-16 11:14:16\",\"dateEndDays\":10,\"dateEndType\":1,\"dateStartType\":1,\"id\":4,\"moneyHreshold\":500.00,\"moneyMax\":60.00,\"moneyMin\":1.00,\"name\":\"再来一波\",\"needScore\":0,\"numberGit\":644,\"numberGitNumber\":644,\"numberLeft\":999355,\"numberPersonMax\":1,\"numberTotle\":999999,\"numberUsed\":24,\"status\":0,\"statusStr\":\"正常\",\"type\":\"shop\"},{\"dateAdd\":\"2017-08-16 11:13:42\",\"dateEndDays\":10,\"dateEndType\":1,\"dateStartType\":1,\"id\":3,\"moneyHreshold\":200.00,\"moneyMax\":50.00,\"moneyMin\":1.00,\"name\":\"全站通用\",\"needScore\":0,\"numberGit\":587,\"numberGitNumber\":346,\"numberLeft\":999412,\"numberPersonMax\":5,\"numberTotle\":999999,\"numberUsed\":43,\"status\":0,\"statusStr\":\"正常\",\"type\":\"shop\"}],\"msg\":\"success\"}",getData.getClass());
        System.out.println(response);
        return response;
    }

    @RequestMapping(Urls.Common.NOTICE_LIST)
    public Response noticeList(@RequestParam(defaultValue = "5") String pageSize){
        System.out.println(pageSize);
        Response response = new Response();
        Pageable pageRequest = new PageRequest(0,5);
        Page<MallNoticeEntity> noticeEntityPage = mallNoticeRepository.findAll(pageRequest);
        response.setData(PageWarp.warp(noticeEntityPage));
        return response;
    }

}
