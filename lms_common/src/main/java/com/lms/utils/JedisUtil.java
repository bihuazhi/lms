package com.lms.utils;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * 连接Redis的工具类.
 */
public class JedisUtil {
    //获取连接
    public static Jedis getJedisClient(){
        int  port = Integer.parseInt(PropertyUtil.getProperty("redis.port"));
        String host = PropertyUtil.getProperty("redis.host");
        Jedis jedis = new Jedis(host,port);
        return jedis;
    }

    public static void main(String[] args) {
        Jedis jedisClient = getJedisClient();
        String ping = jedisClient.ping();
        System.out.println("connection is ok? ===>"+ping);
    }
}
