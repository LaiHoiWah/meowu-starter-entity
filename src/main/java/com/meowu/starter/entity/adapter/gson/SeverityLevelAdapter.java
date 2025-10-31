package com.meowu.starter.entity.adapter.gson;

import com.google.gson.*;
import com.meowu.starter.entity.enums.SeverityLevel;

import java.lang.reflect.Type;
import java.util.Objects;

public class SeverityLevelAdapter implements TypeAdapter<SeverityLevel>{

    @Override
    public Type getType(){
        return SeverityLevel.class;
    }

    @Override
    public SeverityLevel deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException{
        return Objects.isNull(element) ? null : SeverityLevel.getByCode(element.getAsString());
    }

    @Override
    public JsonElement serialize(SeverityLevel level, Type type, JsonSerializationContext context){
        return Objects.isNull(level) ? null : new JsonPrimitive(level.getCode());
    }
}
