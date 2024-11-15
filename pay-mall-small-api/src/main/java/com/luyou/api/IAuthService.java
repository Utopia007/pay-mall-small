package com.luyou.api;

import com.luyou.api.response.Response;

/**
 * @author 鹿又笑
 * @create 2024/11/14-15:11
 * @description
 */
public interface IAuthService {

    Response<String> weixinQrCodeTicket();

    Response<String> checkLogin(String ticket);


}
