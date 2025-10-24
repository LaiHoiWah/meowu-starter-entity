package com.meowu.starter.entity.enums;

public interface StringEnum<T extends Enum<T> & StringEnum<T>>{

    String getCode();
    String getDescription();
}
