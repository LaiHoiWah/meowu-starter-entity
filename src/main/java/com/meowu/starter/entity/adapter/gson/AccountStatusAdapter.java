package com.meowu.starter.entity.adapter.gson;

import com.google.gson.*;
import com.meowu.starter.entity.enums.AccountStatus;

import java.lang.reflect.Type;
import java.util.Objects;

public class AccountStatusAdapter implements TypeAdapter<AccountStatus>{

    @Override
    public Type getType(){
        return AccountStatus.class;
    }

    @Override
    public AccountStatus deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException{
        return Objects.isNull(element) ? null : AccountStatus.getByCode(element.getAsString());
    }

    @Override
    public JsonElement serialize(AccountStatus status, Type type, JsonSerializationContext context){
        return Objects.isNull(status) ? null : new JsonPrimitive(status.getCode());
    }
}
