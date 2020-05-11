package com.lms.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.baomidou.mybatisplus.extension.api.R;
import redis.clients.jedis.Jedis;

import java.rmi.ServerException;
import java.util.Map;
import java.util.Random;

/**
 * Created by Administrator on 2020/5/1/001.
 */
public class Sms {

    public static String sendCode(String phone){
        //加载accesskeyId 和秘钥
        String key = PropertyUtil.getProperty("sms.AccessKeyID");
        String secret = PropertyUtil.getProperty("sms.AccessKeySecret");

        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", key, secret);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        //发送验证码
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "笔画之");
        request.putQueryParameter("TemplateCode", "SMS_162732161");
        String code = genCode();
        request.putQueryParameter("TemplateParam", "{\"code\":\""+code+"\"}");

        //把验证码存入Redis当中
        Jedis jedis = JedisUtil.getJedisClient();
        jedis.set("sms_"+phone,code); //把验证码存入redis当中
        jedis.expire("sms_"+phone,60);//设置过期时间
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            Map<String,String> resultMap = (Map<String,String>)JSON.parse(response.getData());
            return resultMap.get("Code").toString();
        } catch (ClientException e) {
            e.printStackTrace();
            return "NO";
        }
    }

    //生成验证
    public static String genCode(){
        String  code = "";

        for(int i =0;i<4;i++){
            code +=(int)(Math.random()*10); //1-4的随机数
        }
        return code;
    }

    public static void main(String[] args) {
        sendCode("15118877219");
    }

}
