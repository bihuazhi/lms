package com.lms.utils;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

import java.util.Date;


/**
 * 注册日期转换器.
 */
public class DateConverter{

    public static void RegisterConvert(){
        ConvertUtils.register(new DateLocaleConverter(), Date.class);
    }
}
