package com.xblog.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @Author: chenxiaohu
 * @Date: 2019/5/28
 * @Time: 09:24
 * @Description: 处理字符串等类型的null值,该类会将字段类型为字符串、int等类型的null值处理成空字符串
 */
public class MyNullJsonSerializer extends JsonSerializer {
    @Override
    public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException {
        if (value == null) {
            jgen.writeString("");
        }
    }
}
