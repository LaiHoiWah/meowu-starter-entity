package com.meowu.starter.entity.enums;

import com.meowu.starter.entity.utils.StringEnumReflectUtils;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum Locale implements StringEnum<Locale>{

    ZH_CN("zh-CN", "Chinese"),

    ZH_TW("zh-TW", "Taiwan"),

    ZH_HK("zh-HK", "HongKong"),

    EN_US("en-US", "English"),

    ;

    private final String code;
    private final String description;

    public static Locale getByCode(String code){
        return StringEnumReflectUtils.getByCode(Locale.class, code);
    }
}
