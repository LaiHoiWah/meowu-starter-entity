package com.meowu.starter.entity.enums;

import com.meowu.starter.entity.utils.StringEnumReflectUtils;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum AccountStatus implements StringEnum<AccountStatus>{

    ACTIVE("A", "ACTIVE"),

    INACTIVE("I", "INACTIVE"),

    FROZEN("F", "FROZEN"),

    DELETE("D", "DELETE"),

    ;

    private final String code;
    private final String description;

    public static AccountStatus getByCode(String code){
        return StringEnumReflectUtils.getByCode(AccountStatus.class, code);
    }
}
