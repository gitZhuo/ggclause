package com.zhuo.ggclause.util;

import java.util.Map;

/**
 * @author zhuoshengqi
 * @date 2019/03/12  18:34
 * @description
 */
public class CommonUtils {
    public static String getParameter(Map paramMap, String args) {

        return (String) paramMap.get(args);

    }

    public static Long getLongParameter(Map paramMap, String args, Object o) {
        return (Long) paramMap.get(args);
    }
}
