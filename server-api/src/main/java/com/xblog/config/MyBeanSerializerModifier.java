package com.xblog.config;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;

import java.util.List;
import java.util.Set;

/**
 * @Author: chenxiaohu
 * @Date: 2019/5/28
 * @Time: 09:29
 * @Description:  该类控制将null值处理成空集合还是空字符串
 */
public class MyBeanSerializerModifier extends BeanSerializerModifier {

    /**
     * 数组类型
     */
    private JsonSerializer nullArrayJsonSerializer = new MyNullArrayJsonSerializer();

    /**
     * 字符串等类型
     */
    private JsonSerializer nullJsonSerializer = new MyNullJsonSerializer();

    @Override
    public List<BeanPropertyWriter> changeProperties(SerializationConfig config, BeanDescription beanDesc,
                                                     List beanProperties) {
        //循环所有的beanPropertyWriter
        for (int i = 0; i < beanProperties.size(); i++) {
            BeanPropertyWriter writer = (BeanPropertyWriter) beanProperties.get(i);
            //判断字段的类型，如果是array，list，set则注册nullSerializer
            if (isArrayType(writer)) {
                //给writer注册一个自己的nullSerializer
                writer.assignNullSerializer(this.nullArrayJsonSerializer);
            } else {
                writer.assignNullSerializer(this.nullJsonSerializer);
            }
        }
        return beanProperties;
    }

    //判断是什么类型
    protected boolean isArrayType(BeanPropertyWriter writer) {
        Class clazz = writer.getPropertyType();
        return clazz.isArray() || clazz.equals(List.class) || clazz.equals(Set.class);
    }
}

