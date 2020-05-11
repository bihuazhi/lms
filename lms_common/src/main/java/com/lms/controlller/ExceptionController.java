package com.lms.controlller;

import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import com.lms.exception.CustomException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by Administrator on 2020/3/11/011.
 */
//通知控制器
@RestControllerAdvice
public class ExceptionController {

    //异常全局拦截处理，返回错误的json格式的数据  处理自定义的全局异常
    @ExceptionHandler(value = Exception.class)
    public Result jsonCustomException(Exception e){
        return new Result(ResultCode.SERVER_ERROR);
    }

    //处理权限的处理器
    @ExceptionHandler(value = UnauthorizedException.class)
    public Result handlerAuthorized(Exception e){
        return new Result(ResultCode.UNAUTHORISE);
    }

}
