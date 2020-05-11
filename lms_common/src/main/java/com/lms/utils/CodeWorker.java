package com.lms.utils;

import java.util.Random;

/**
 * 生成编码的时间戳和随机数.
 */
public class CodeWorker {
    public static String codeGenerate(String prefix){
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                stringBuilder.append(random.nextInt(10) + "");
            }
        return prefix+stringBuilder.toString()+System.currentTimeMillis();
    }
}
