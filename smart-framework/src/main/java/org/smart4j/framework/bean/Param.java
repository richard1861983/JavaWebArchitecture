package org.smart4j.framework.bean;

import org.smart4j.framework.util.CastUtil;
import org.smart4j.framework.util.CollectionUtil;
import org.smart4j.framework.util.StringUtil;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by qingzhong on 16/4/5.
 */
public class Param {

    private Map<String,Object> paramMap;
    private List<FormParam> formParamList;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 根据参数名获取long型参数值
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取所有字段信息
     */
    public Map<String ,Object> getMap() {
        return paramMap;
    }

    /**
     * 获取请求参数映射
     */
    public Map<String, Object> getFieldMap() {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        if (CollectionUtil.isNotEmpty(formParamList)) {
            for (FormParam formParam : formParamList) {
                String fieldName = formParam.getFieldName();
                Object fieldValue = formParam.getFieldValue();
                if (fieldMap.containsKey(fieldName)) {
                    fieldValue = fieldMap.get(fieldName) + StringUtil.SEPARATOR + fieldValue;
                }
                fieldMap.put(fieldName, fieldValue);
            }
        }
        return fieldMap;
    }
}
