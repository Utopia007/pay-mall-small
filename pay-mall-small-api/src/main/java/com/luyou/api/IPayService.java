package com.luyou.api;

import com.luyou.api.dto.CreatePayRequestDTO;
import com.luyou.api.response.Response;

public interface IPayService {

    Response<String> createPayOrder(CreatePayRequestDTO createPayRequestDTO);

}
