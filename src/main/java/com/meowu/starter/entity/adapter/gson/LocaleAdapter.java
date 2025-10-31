package com.meowu.starter.entity.adapter.gson;

import com.google.gson.*;
import com.meowu.starter.entity.enums.Locale;

import java.lang.reflect.Type;
import java.util.Objects;

public class LocaleAdapter implements TypeAdapter<Locale>{

    @Override
    public Type getType(){
        return Locale.class;
    }

    @Override
    public Locale deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException{
        return Objects.isNull(element) ? null : Locale.getByCode(element.getAsString());
    }

    @Override
    public JsonElement serialize(Locale status, Type type, JsonSerializationContext context){
        return Objects.isNull(status) ? null : new JsonPrimitive(status.getCode());
    }
}
