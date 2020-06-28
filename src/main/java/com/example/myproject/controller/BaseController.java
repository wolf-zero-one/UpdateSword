package com.example.myproject.controller;

import com.example.myproject.Bean.BaseResponse;
import com.example.myproject.Bean.RequestBean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/myProject")
public class BaseController {


    @RequestMapping(value = "/test",method= RequestMethod.POST)
    public BaseResponse getBaseController(@RequestBody RequestBean bean) {

        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode("200");
        baseResponse.setMes("success");
        return baseResponse;
    }
}
