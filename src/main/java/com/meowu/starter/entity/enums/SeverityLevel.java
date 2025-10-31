package com.meowu.starter.entity.enums;

import com.meowu.starter.entity.utils.StringEnumReflectUtils;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum SeverityLevel implements StringEnum<SeverityLevel>{

    INFO("I", "INFO"),

    WARN("W", "WARN"),

    ERROR("E", "ERROR"),

    SUCCESS("S", "SUCCESS")

    ;

    private final String code;
    private final String description;

    public static SeverityLevel getByCode(String code){
        return StringEnumReflectUtils.getByCode(SeverityLevel.class, code);
    }
}
