package com.lms.exception;


import com.lms.entity.Result;
import com.lms.entity.ResultCode;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2020/3/10/010.
 */

public class CustomException extends RuntimeException {

    //处理所有的不同的异常
   /* @ExceptionHandler(value = Exception.class)
    public Result handleException(Exception e,HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("code", 6500);
        map.put("msg", e.getMessage());
        map.put("url", request.getRequestURL());
        return new Result(ResultCode.SERVER_ERROR); //自定义错误信息
    }*/

   public CustomException(String message){
       super(message);
   }
}
