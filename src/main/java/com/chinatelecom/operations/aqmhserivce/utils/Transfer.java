package com.chinatelecom.operations.aqmhserivce.utils;
import com.chinatelecom.operations.aqmhserivce.entity.*;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Transfer {

    private static String compile = "[A-Z]";
    /**
     * 转换风格 驼峰转下划线
     * @param fieldName 属性名称
     * @return
     */
    private static String getTransformFieldName(String fieldName) {
        Pattern humpPattern = Pattern.compile(compile);
        Matcher matcher = humpPattern.matcher(fieldName);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(sb, "_"+matcher.group(0).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }



    public static void main(String[] args) {
        Class<VOrgTreeAllStaffInfo> aClass = VOrgTreeAllStaffInfo.class;
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(getTransformFieldName(field.getName()));
        }
    }
}
