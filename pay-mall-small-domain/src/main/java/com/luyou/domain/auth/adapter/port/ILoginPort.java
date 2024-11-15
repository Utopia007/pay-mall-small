package com.luyou.domain.auth.adapter.port;

import java.io.IOException;

/**
 * @author 鹿又笑
 * @create 2024/11/14-15:01
 * @description
 */
public interface ILoginPort {

    String createQrCodeTicket() throws IOException;

    void sendLoginTemplate(String openid) throws IOException;


}
