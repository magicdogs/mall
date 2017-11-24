package com.symagic.mail.web.constant;

public interface Urls {

    interface Config{

    }
    interface User{
        String ROOT = "/user";
        String USER_DETAIL = ROOT + "/detail";
        String USER_AMOUNT = ROOT + "/amount";

        String WITHDRAW_APPLY = ROOT + "/withDraw/apply";

        String CHECK_TOKEN = ROOT + "/check-token";
        String WXAPP_LOGIN = ROOT + "/wxapp/login";
        String WXAPP_REGISTER = ROOT + "/wxapp/register/complex";
        String WXAPP_BINDMOBILE = ROOT + "/wxapp/bindMobile";

        String SHIPPING_ADDRESS = ROOT + "/shipping-address/{apiAdd}";
        String SHIPPING_ADDRESS_DEFAULT = ROOT + "/shipping-address/default";
        String SHIPPING_ADDRESS_LIST = ROOT + "/shipping-address/list";
        String SHIPPING_ADDRESS_DETAIL = ROOT + "/shipping-address/detail";
        String SHIPPING_ADDRESS_UPDATE = ROOT + "/shipping-address/update";
        String SHIPPING_ADDRESS_DELETE = ROOT + "/shipping-address/delete";
    }

    interface Shop {
        String ROOT = "/shop";
        String GOODS_DETAIL = ROOT + "/goods/detail";
        String GOODS_PRICE = ROOT + "/goods/price";
        String GOODS_REPUTATION = ROOT + "/goods/reputation";
        String GOODS_CATEGORY_ALL = ROOT + "/goods/category/all";
        String GOODS_LIST = ROOT + "/goods/list";
    }

    interface Order {
        String ROOT = "/order";
        String CREATE = ROOT + "/create";
        String DETAIL = ROOT + "/detail";
        String DELIVERY = ROOT + "/delivery";
        String REPUTATION = ROOT + "/reputation";
        String CLOSE = ROOT + "/close";
        String PAY = ROOT + "/pay";
        String STATISTICS = ROOT + "/statistics";
        String LIST = ROOT + "/list";
    }
    interface Common {

        String TEMPLATE_MSG = "/template-msg/put";

        String BANNER_LIST = "/banner/list";

        String DISCOUNTS_COUPONS = "/discounts/coupons";
        String DISCOUNTS_FETCH = "/discounts/fetch";
        String DISCOUNTS_MY = "/discounts/my";

        String NOTICE_LIST = "/notice/list";
        String NOTICE_DETAIL = "/notice/detail";

        String SCORE_TODAY_SIGNED = "/score/today-signed";
        String SCORE_SIGNE = "/score/sign";

        String WXAPP_GET_PAY_DATA = "/pay/wxapp/get-pay-data";

        String CONFIG_GET_VALUE =  "/config/get-value";

    }


}
