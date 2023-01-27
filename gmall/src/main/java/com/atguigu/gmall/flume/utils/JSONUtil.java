package com.atguigu.gmall.flume.utils;

import com.alibaba.fastjson.JSONObject;

public class JSONUtil {
    public static boolean isJSONValidate(String log) {
        try {
            JSONObject.parseObject(log);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
