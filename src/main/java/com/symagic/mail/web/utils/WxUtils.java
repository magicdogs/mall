package com.symagic.mail.web.utils;

import com.alibaba.druid.util.HttpClientUtils;
import com.alibaba.fastjson.JSON;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.util.Map;

public class WxUtils {
    private static String AppId = "wx520e65b48fe80529";
    private static String SecretCode = "bd3aa7aba724efd75eae02d06f3b5648";
    private static String WxLoginUrl = "https://api.weixin.qq.com/sns/jscode2session?";

    private static final String WX_OPENID = "openid";

    public static String getUserOpenId(String code){
        Map<String,String> userMap = getUserMap(code);
        String openId = "";
        if(userMap.containsKey(WX_OPENID)){
            openId = userMap.get(WX_OPENID);
        }
        return openId;
    }

    public static Map<String,String> getUserMap(String code){

        StringBuilder sBuilder = new StringBuilder(WxLoginUrl);
        sBuilder.append("appid=")
                .append(AppId)
                .append("&secret=")
                .append(SecretCode)
                .append("&js_code=")
                .append(code)
                .append("&grant_type=authorization_code");
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(sBuilder.toString())
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                throw new RuntimeException("服务器端错误: " + response);
            }
            Headers responseHeaders = response.headers();
            for (int i = 0; i < responseHeaders.size(); i++) {
                System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
            }
            String resultJson = response.body().string();
            System.out.println(resultJson);
            return JSON.parseObject(resultJson,Map.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
