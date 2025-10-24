package com.meowu.starter.entity.utils;

import com.meowu.starter.entity.enums.StringEnum;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class StringEnumReflectUtils{

    private StringEnumReflectUtils(){
        throw new IllegalStateException("Instantiation is not allowed");
    }

    public static <T extends Enum<T> & StringEnum<T>> T getByCode(Class<T> type, String code){
        if(Objects.isNull(type)){
            throw new IllegalArgumentException("Enum type must not be null");
        }

        if(StringUtils.isBlank(code)){
            return null;
        }

        for(T entity : type.getEnumConstants()){
            if(entity.getCode().equals(code)){
                return entity;
            }
        }
        throw new IllegalArgumentException("No matched with code: " + code);
    }
}
