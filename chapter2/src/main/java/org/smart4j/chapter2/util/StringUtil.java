package org.smart4j.chapter2.util;

/**
 * Created by qingzhong on 16/3/31.
 */
public class StringUtil {

    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(String str) {
        if(str!=null) {
            str=str.trim();
        }

        return StringUtil.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
