package com.lms.controlller;

import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公共的异常控制器.
 */
@RestController
@CrossOrigin
public class ErrorController {

    @RequestMapping(value = "/autherror")
    public Result autherror(int code){
        return code==1?new Result(ResultCode.UNAUTHENTICATED):new Result(ResultCode.UNAUTHORISE);
    }
}
