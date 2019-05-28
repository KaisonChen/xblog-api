package com.xblog.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @Author: chenxiaohu
 * @Date: 2019/5/28
 * @Time: 09:31
 * @Description: 处理数组类型的null值, 该类会将字段类型为集合类型的null值处理成空集合
 */
public class MyNullArrayJsonSerializer extends JsonSerializer{

    @Override
    public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
        if (value == null) {
            jgen.writeStartArray();
            jgen.writeEndArray();
        }
    }

}
