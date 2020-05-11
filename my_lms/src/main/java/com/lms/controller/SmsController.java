package com.lms.controller;

import com.aliyuncs.exceptions.ClientException;
import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.utils.Sms;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2020/5/2/002.
 */
@RestController
@RequestMapping("/sms")
@CrossOrigin
public class SmsController {

    @GetMapping("/sendMessage")
    public Result sendMessage(@RequestParam("mobile") String mobile){
          return new Result(ResultCode.SUCCESS,Sms.sendCode(mobile));
    }
}
