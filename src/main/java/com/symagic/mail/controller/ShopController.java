package com.symagic.mail.controller;

import com.symagic.mail.model.MallCategoryEntity;
import com.symagic.mail.model.MallGoodsEntity;
import com.symagic.mail.repostory.MallCategoryRepository;
import com.symagic.mail.repostory.MallGoodsRepository;
import com.symagic.mail.web.constant.Urls;
import com.symagic.mail.web.view.Response;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Administrator
 */
@RestController
public class ShopController {

    @Autowired
    MallCategoryRepository mallCategoryRepository;
    @Autowired
    MallGoodsRepository mallGoodsRepository;

    @RequestMapping(Urls.Shop.GOODS_CATEGORY_ALL)
    public Response allGoodsCategory(){
        Response response = new Response();
        List<MallCategoryEntity> mallCategoryEntityList = mallCategoryRepository.findAll();
        response.setData(mallCategoryEntityList);
        return response;
    }

    @RequestMapping(Urls.Shop.GOODS_LIST)
    public Response goodsList(@RequestParam(required = false,defaultValue = "") String categoryId){
        System.out.println(categoryId);
        Response response = new Response();
        if(StringUtils.isEmpty(categoryId)){
            List<MallGoodsEntity> mallGoodsEntities = mallGoodsRepository.findAll();
            response.setData(mallGoodsEntities);
        }else{
            List<MallGoodsEntity> mallGoodsEntities = mallGoodsRepository.findByCategoryId(Integer.parseInt(categoryId));
            response.setData(mallGoodsEntities);
        }
        return response;
    }

}
